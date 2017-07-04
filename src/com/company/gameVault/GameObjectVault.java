package com.company.gameVault;

import com.company.gameObjects.BackgroundObjects.BackgroundObject;
import com.company.gameObjects.Player;
import com.company.gameObjects.SolidObjects.ActiveSolidObjects.TransportBlock;
import com.company.gameObjects.SolidObjects.PassiveSolidObjects.DirectionalBlock;
import com.company.gameObjects.SolidObjects.PassiveSolidObjects.DumbBlock;
import com.company.gameSettings.GameConstants;
import com.company.gameTile.GameTile;

/**
 * Created by evnac on 6/27/2017.
 */
public class GameObjectVault
{

	public static Player Player1;


	// Dumb Objects
	public static DumbBlock Tree1Stump;
	public static DumbBlock RiverMiddleContinous; //This needs to be broken up in the future
	public static DumbBlock MapEdge;
	public static DumbBlock TallShelf1_1x2;
	public static DumbBlock RoofFlatLeft_1x2;
	public static DumbBlock RoofFlatMiddle_1x2;
	public static DumbBlock RoofFlatRight_1x2;
	public static DumbBlock RedBrickWall_3x3;
	public static DumbBlock StoneWall1_1x3;

	// Background Objects
	public static BackgroundObject GrassPatchWholeWithMostLeaves;
	public static BackgroundObject DarkMudPillar;
	public static BackgroundObject Tree1;
	public static BackgroundObject StoneWalkWay1;
	public static BackgroundObject DevTexture;

	// Direction Objects
	public static DirectionalBlock StairCaseTop;
	public static DirectionalBlock StairCaseMiddle;
	public static DirectionalBlock StairCaseBottom;
	public static DirectionalBlock BridgeWithNiceRailing;

	public GameObjectVault() throws Exception
	{
		try
		{
			Player1 = new Player(new GameTile("img/singleTiles/DevTexture.png"));

			// Dumb Game Objects
			Tree1Stump = new DumbBlock(new GameTile(28, 19, 3, 3, GameConstants.FilePaths.SpriteSheets.BASE));
			RiverMiddleContinous = new DumbBlock(new GameTile(21, 14, 1, 3, GameConstants.FilePaths.SpriteSheets.BASE));
			MapEdge = new DumbBlock(new GameTile("img/singleTiles/DevTexture.png"));
			TallShelf1_1x2 = new DumbBlock(new GameTile(19,8 ,2,1,GameConstants.FilePaths.SpriteSheets.OBJECT));
			RoofFlatRight_1x2 = new DumbBlock(new GameTile(5,13,2,1,GameConstants.FilePaths.SpriteSheets.BASE));
			RoofFlatMiddle_1x2 = new DumbBlock(new GameTile(4,13,2,1,GameConstants.FilePaths.SpriteSheets.BASE));
			RoofFlatLeft_1x2 = new DumbBlock(new GameTile(3,13,2,1,GameConstants.FilePaths.SpriteSheets.BASE));
			RedBrickWall_3x3 = new DumbBlock(new GameTile(0,16,3,3,GameConstants.FilePaths.SpriteSheets.BASE));
			StoneWall1_1x3 = new DumbBlock(new GameTile(25,8,3,1,GameConstants.FilePaths.SpriteSheets.BASE));

			// Background Objects
			GrassPatchWholeWithMostLeaves = new BackgroundObject(new GameTile(21, 5, GameConstants.FilePaths.SpriteSheets.TERRAIN));
			DarkMudPillar = new BackgroundObject(new GameTile(0, 0, 3, 5,GameConstants.FilePaths.SpriteSheets.BUILD) ); //**This is a piller and should be a dumb block..?
			Tree1 = new BackgroundObject(new GameTile(24, 15, 3, 3,GameConstants.FilePaths.SpriteSheets.BASE));
			StoneWalkWay1 = new BackgroundObject(new GameTile(30, 26, GameConstants.FilePaths.SpriteSheets.BASE));
			DevTexture = new BackgroundObject(new GameTile("img/singleTiles/DevTexture.png"));

			// Direction Objects
			StairCaseTop = new DirectionalBlock(new GameTile(15, 18, GameConstants.FilePaths.SpriteSheets.BASE));
			StairCaseMiddle = new DirectionalBlock(new GameTile(15, 19, GameConstants.FilePaths.SpriteSheets.BASE));
			StairCaseBottom = new DirectionalBlock(new GameTile(15, 20, GameConstants.FilePaths.SpriteSheets.BASE));
			BridgeWithNiceRailing = new DirectionalBlock(new GameTile(16, 16, 3,3, GameConstants.FilePaths.SpriteSheets.BASE));

		}
		catch(Exception e)
		{
			throw new Exception("Error loading game objects in GameObjectVault\n\n" + e.toString());
		}
	}


}