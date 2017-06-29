package com.company.gameVault;

import com.company.gameObjects.BackgroundObjects.BackgroundObject;
import com.company.gameObjects.SolidObjects.PassiveSolidObjects.DirectionalBlock;
import com.company.gameSettings.Constants;
import com.company.gameTile.GameTile;

/**
 * Created by evnac on 6/27/2017.
 */
public class GameObjectVault
{
	// Static Game Objects

	// Background Objects
	public static BackgroundObject GrassPatchWholeWithMostLeaves = new BackgroundObject(new GameTile(21,5, Constants.SpriteSheets.BASE.GetFile()));
	public static BackgroundObject DarkMudPillar = new BackgroundObject(new GameTile(0,0,3,5, Constants.SpriteSheets.BUILD.GetFile()));

	// Direction Objects
	public static DirectionalBlock StairCaseMiddle = new DirectionalBlock(new GameTile(15,19, Constants.SpriteSheets.BUILD.GetFile()));



}