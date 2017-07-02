package com.company.gameSettings;

/**
 * Created by evnac on 6/27/2017.
 */
public class GameConstants
{

	public static final int SPRITE_BLOCK_WIDTH = 32;
	public static final int SPRITE_BLOCK_HEIGHT = 32;

	public static double PLAYER_WALK_SPEED = .25/2;

	public static class FilePaths
	{
		public static final String gameTileFolder = "img/spriteGrids/gameTile/";

		public static class SpriteSheets
		{
			public static final String BASE = gameTileFolder + "base_out_atlas.png";
			public static final String TERRAIN = gameTileFolder + "terrain_atlas.png";
			public static final String OBJECT = gameTileFolder + "terrain_atlas.png";
			public static final String BUILD = gameTileFolder + "build_atlas.png";
		}
	}
}