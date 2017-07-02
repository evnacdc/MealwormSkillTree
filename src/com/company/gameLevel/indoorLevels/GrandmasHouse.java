package com.company.gameLevel.indoorLevels;

import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameUtilities.FileIO;
import com.company.gameVault.GameObjectVault;

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
			return new GameObject[][]
					{{GameObjectVault.BridgeWithNiceRailing,GameObjectVault.BridgeWithNiceRailing,GameObjectVault.BridgeWithNiceRailing},
							{GameObjectVault.BridgeWithNiceRailing,GameObjectVault.BridgeWithNiceRailing,GameObjectVault.BridgeWithNiceRailing},
							{GameObjectVault.BridgeWithNiceRailing,GameObjectVault.BridgeWithNiceRailing,GameObjectVault.BridgeWithNiceRailing},
							{GameObjectVault.GrassPatchWholeWithMostLeaves,GameObjectVault.StairCaseBottom,GameObjectVault.GrassPatchWholeWithMostLeaves}

					};
		}

		@Override
		protected GameObject[][] CreateForeground()
		{
			return new GameObject[0][];
		}
	}

	// Basement  //////////////////////////////////
	public static class Basement extends Level
	{

		@Override
		protected GameObject[][] CreateBackground()
		{
			return FileIO.GetObjectArrayFromImage("img/maps/New Piskel.png");
		}

		@Override
		protected GameObject[][] CreateForeground()
		{
			return FileIO.GetObjectArrayFromImage("img/maps/foreground.png");
		}
	}
}
