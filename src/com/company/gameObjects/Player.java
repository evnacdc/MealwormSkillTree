package com.company.gameObjects;

import com.company.gameLevel.ForegroundLayer;
import com.company.gameLevel.Level;
import com.company.gameMechanics.engine.PlayerMechanics;
import com.company.gameSettings.GameConstants;
import com.company.gameTile.GameTile;

import java.awt.*;

/**
 * Created by evnac on 7/2/2017.
 */
public class Player extends GameObject
{

	public static int GridX;
	public static int GridY;

	public static double OffsetX;
	public static double OffsetY;

	public PlayerMechanics.Directions Facing = PlayerMechanics.Directions.UP;
	public PlayerMechanics.Directions Moving = PlayerMechanics.Directions.NONE;

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

	public void Update()
	{
		Engine.Update();
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
