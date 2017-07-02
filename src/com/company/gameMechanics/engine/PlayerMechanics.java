package com.company.gameMechanics.engine;

import com.company.gameLevel.ForegroundLayer;
import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameObjects.Player;

/**
 * Created by evnac on 7/2/2017.
 */
public class PlayerMechanics
{

	public enum Directions {UP,DOWN,LEFT,RIGHT,UNDER,NONE}

	private static Level CurrentLevel;
	private static GameObject[][] CurrentMap;
	private static int X;
	private static int Y;
	private static Player Player;

	public PlayerMechanics(Player player)
	{
		Player = player;
	}

	public void NewMap(Level currentMap, int x, int y)
	{
		this.X = x;
		this.Y = y;

		this.CurrentLevel = currentMap;
		this.CurrentMap = currentMap.GetForeground().GetMap();

		this.CurrentMap[y][x] = Player;
	}

	public GameObject GetBlock(Directions direction)
	{
		switch(direction)
		{
			case UP:
			{
				if(Y>0)
				{
					return CurrentMap[Y+1][X];
				}
			}
			case DOWN:
			{
				if(CurrentMap.length > Y)
				{
					return CurrentMap[Y-1][X];
				}
			}
			case LEFT:
			{
				if(X>0)
				{
					return CurrentMap[Y][X-1];
				}
			}
			case RIGHT:
			{
				if(CurrentMap.length > X)
				{
					return CurrentMap[Y][X+1];
				}
			}
			case UNDER:
			{
				return CurrentLevel.GetBackground().GetMap()[Y][X];
			}
			default:
				return null;
		}
	}

	public boolean CanMove(Directions direction)
	{
		if(GetBlock(direction) != null)
		{
			return false;
		}
		return true;
	}

	public boolean Move(Directions direction)
	{
		if(CanMove(direction) == true)
		{
			this.CurrentMap[Y][X] = null;

			switch(direction)
			{
				case UP:
				{
					CurrentMap[Y+1][X] = Player;
					return true;
				}
				case DOWN:
				{
					CurrentMap[Y-1][X] = Player;
					return true;
				}
				case LEFT:
				{
					CurrentMap[Y][X-1] = Player;
					return true;
				}
				case RIGHT:
				{
					CurrentMap[Y][X+1] = Player;
					return true;
				}

				default:
					return false;
			}
		}
		return false;
	}



}
