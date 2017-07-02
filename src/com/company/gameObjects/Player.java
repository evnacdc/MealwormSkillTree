package com.company.gameObjects;

import com.company.gameLevel.ForegroundLayer;
import com.company.gameLevel.Level;
import com.company.gameMechanics.engine.PlayerMechanics;
import com.company.gameTile.GameTile;

import java.awt.*;

/**
 * Created by evnac on 7/2/2017.
 */
public class Player extends GameObject
{

	public int playerX;
	public int playerY;

	public PlayerMechanics.Directions MovementDirection = PlayerMechanics.Directions.NONE;

	private static PlayerMechanics Engine;

	public Player(GameTile sprite)
	{
		super(sprite);
		Engine = new PlayerMechanics(this);
	}

	public void NewMap(Level newLevel, int x, int y)
	{
		Engine.NewMap(newLevel, x, y);
	}

	public boolean Move(PlayerMechanics.Directions direction)
	{
		if(this.MovementDirection == PlayerMechanics.Directions.NONE)
		{
			return Engine.Move(direction);
		}
		return false;
	}
}
