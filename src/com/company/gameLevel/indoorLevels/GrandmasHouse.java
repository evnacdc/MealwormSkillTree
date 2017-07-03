package com.company.gameLevel.indoorLevels;

import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameUtilities.FileIO;
import com.company.gameVault.GameObjectVault;

import static com.company.gameUtilities.FileIO.GetObjectArrayFromImage;

/**
 * Created by evnac on 6/27/2017.
 */
public class GrandmasHouse
{

	// Ground Floor /////////////////////////////////
	public static class GroundFloor extends Level
	{
		@Override
		protected GameObject[][] CreateBackground()
		{
			return GetObjectArrayFromImage("img/maps/GrandmasHouseTopFloorBackground.png");
		}

		@Override
		protected GameObject[][] CreateForeground()
		{
			return GetObjectArrayFromImage("img/maps/GrandmasHouseTopFloorForeground.png");
		}
	}

	// Basement  //////////////////////////////////
	public static class Basement extends Level
	{

		@Override
		protected GameObject[][] CreateBackground()
		{
			return new GameObject[0][];
		}

		@Override
		protected GameObject[][] CreateForeground()
		{
			return new GameObject[0][];
		}
	}
}
