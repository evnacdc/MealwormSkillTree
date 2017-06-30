package com.company.gameVault;

import com.company.gameObjects.BackgroundObjects.BackgroundObject;
import com.company.gameObjects.SolidObjects.PassiveSolidObjects.DirectionalBlock;
import com.company.gameSettings.GameConstants;
import com.company.gameTile.GameTile;

/**
 * Created by evnac on 6/27/2017.
 */
public class GameObjectVault
{
	// Static Game Objects

	// Background Objects
	public static BackgroundObject GrassPatchWholeWithMostLeaves;
	public static BackgroundObject DarkMudPillar;

	// Direction Objects
	public static DirectionalBlock StairCaseMiddle;

	public GameObjectVault() throws Exception
	{
		try
		{


			GrassPatchWholeWithMostLeaves = new BackgroundObject(new GameTile(21, 5, GameConstants.FilePaths.SpriteSheets.TERRAIN));
			DarkMudPillar = new BackgroundObject(new GameTile(0, 0, 3, 5,GameConstants.FilePaths.SpriteSheets.BUILD) );

			StairCaseMiddle = new DirectionalBlock(new GameTile(15, 19, GameConstants.FilePaths.SpriteSheets.BUILD));

		}
		catch(Exception e)
		{
			throw new Exception("Error loading game objects in GameObjectVault\n\n" + e.toString());
		}
	}


}