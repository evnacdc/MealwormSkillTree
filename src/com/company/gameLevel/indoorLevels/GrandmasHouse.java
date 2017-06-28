package com.company.gameLevel.indoorLevels;

import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;

/**
 * Created by evnac on 6/27/2017.
 */
public class GrandmasHouse extends Level
{

	@Override
	protected GameObject[][] InitBackground()
	{
		return new GameObject[0][];
	}

	@Override
	protected GameObject[][] InitForeground()
	{
		return new GameObject[0][];
	}

	// Ground Floor /////////////////////////////////
	public static class GroundFloor extends Level
	{
		public GroundFloor()
		{

		}
		@Override
		protected GameObject[][] InitBackground()
		{
			return new GameObject[0][];
		}

		@Override
		protected GameObject[][] InitForeground()
		{
			return new GameObject[0][];
		}
	}

	// Basement  //////////////////////////////////
	public static class Basement
	{

	}
}
