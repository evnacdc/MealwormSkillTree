package com.company.gameMechanics.engine;

import com.company.MainMap;
import com.company.gameLevel.ForegroundLayer;
import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameObjects.Player;
import com.company.gameObjects.SolidObjects.ActiveSolidObjects.TeleportBlock;
import com.company.gameObjects.SolidObjects.ActiveSolidObjects.TransportBlock;
import com.company.gameSettings.GameConstants;
import com.company.gameVault.GameObjectVault;
import org.newdawn.slick.Image;

/**
 * Created by evnac on 7/2/2017.
 */
public class PlayerMechanics
{

	public enum Directions {UP,DOWN,LEFT,RIGHT,UNDER,NONE}

	private static Level CurrentLevel;
	private static GameObject[][] CurrentMap;
	private static Image[][] ImageMap;
	private static Player Player;

	public PlayerMechanics(Player player)
	{
		Player = player;
	}

	public void NewMap(Level currentMap, int x, int y)
	{
		this.SetLevel(currentMap,x,y);
	}

	public void SetLevel(Level currentMap, int x, int y)
	{
		MainMap.currentLevel = currentMap;

		Player.GridX = x;
		Player.GridY = y;
		Player.OffsetX = -x* GameConstants.SPRITE_BLOCK_WIDTH + GameConstants.SPRITE_BLOCK_WIDTH * 13;
		Player.OffsetY = -y* GameConstants.SPRITE_BLOCK_HEIGHT+ GameConstants.SPRITE_BLOCK_HEIGHT * 8;

		this.ImageMap = currentMap.GetForeground().GetImageMap();
		this.CurrentLevel = currentMap;
		this.CurrentMap = currentMap.GetForeground().GetMap();

		this.CurrentMap[y][x] = Player;

		CurrentMap[Player.GridY][Player.GridX] = Player;
		
	}

	public GameObject GetBlock(Directions direction)
	{
		switch(direction)
		{
			case UP:
			{
				if(Player.GridY>0)
				{
					return CurrentMap[Player.GridY-1][Player.GridX];
				}
				break;
			}
			case DOWN:
			{
				if(CurrentMap.length > Player.GridY+1)
				{
					return CurrentMap[Player.GridY+1][Player.GridX];
				}
				break;
			}
			case LEFT:
			{
				if(Player.GridX>0)
				{
					return CurrentMap[Player.GridY][Player.GridX-1];
				}
				break;
			}
			case RIGHT:
			{
				if(CurrentMap[0].length > Player.GridX+1)
				{
					return CurrentMap[Player.GridY][Player.GridX+1];
				}
				break;
			}
			case UNDER:
			{
				return CurrentLevel.GetBackground().GetMap()[Player.GridY][Player.GridX];
			}
			default:
				return null;
		}
	return GameObjectVault.MapEdge;
	}

	public boolean CanMove(Directions direction)
	{
		GameObject obj = GetBlock(direction);

		if(Player.Moving == Directions.NONE)
		{
			if (obj == null || obj instanceof TransportBlock)
			{
				return true;
			}
		}
		return false;
	}

	public void Update()
	{
		switch(Player.Moving)
		{
			case UP:
			{
				Player.OffsetY += GameConstants.PLAYER_WALK_SPEED;
				break;
			}
			case DOWN:
			{
				Player.OffsetY -= GameConstants.PLAYER_WALK_SPEED;
				break;
			}
			case LEFT:
			{
				Player.OffsetX += GameConstants.PLAYER_WALK_SPEED;
				break;
			}
			case RIGHT:
			{
				Player.OffsetX -= GameConstants.PLAYER_WALK_SPEED;
				break;
			}
		}
		if(Player.Moving != Directions.NONE)
		{
			if ( (Math.abs(Player.OffsetY) % (double)GameConstants.SPRITE_BLOCK_HEIGHT) < GameConstants.PLAYER_WALK_SPEED / (double)4)
			{
				if ( (Math.abs(Player.OffsetX) % (double)GameConstants.SPRITE_BLOCK_WIDTH) < GameConstants.PLAYER_WALK_SPEED / (double)4)
				{
					Player.Moving = Directions.NONE;
				}
			}
		}
	}

	public boolean Move(Directions direction)
	{
		if(CanMove(direction) == true)
		{
			this.CurrentMap[Player.GridY][Player.GridX] = null;

			// walked into door or other teleport block
			if(GetBlock(direction) instanceof TeleportBlock)
			{
				TeleportBlock destBlock = (TeleportBlock)((TeleportBlock) GetBlock(direction)).DestinationBlock;
				this.SetLevel(destBlock.BlockLevel,destBlock.GetX()+destBlock.OffsetPlayerOutX,destBlock.GetY()+destBlock.OffsetPlayerOutY);

			}
			else
			{
				switch (direction)
				{
					case UP:
					{
						Player.GridY--;
						CurrentMap[Player.GridY][Player.GridX] = Player;
						Player.Moving = direction;
						return true;
					}
					case DOWN:
					{
						Player.GridY++;
						CurrentMap[Player.GridY][Player.GridX] = Player;
						Player.Moving = direction;
						return true;
					}
					case LEFT:
					{
						Player.GridX--;
						CurrentMap[Player.GridY][Player.GridX] = Player;
						Player.Moving = direction;
						return true;
					}
					case RIGHT:
					{
						Player.GridX++;
						CurrentMap[Player.GridY][Player.GridX] = Player;
						Player.Moving = direction;
						return true;
					}
					default:
						return false;
				}
			}
		}
		return false;
	}



}
