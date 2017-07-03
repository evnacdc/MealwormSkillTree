package com.company.gameVault;

import com.company.gameSettings.GameConstants;
import com.company.gameTile.GameTile;

/**
 * Created by evnac on 7/3/2017.
 */
public class GameTileVault
{
	public static GameTile Door1;

	public GameTileVault()
	{
		Door1 = new GameTile(5, 9, 2, 1, GameConstants.FilePaths.SpriteSheets.BASE);
	}
}
