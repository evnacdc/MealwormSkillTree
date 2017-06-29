package com.company.gameSettings;

/**
 * Created by evnac on 6/27/2017.
 */
public class Constants
{

	// Enumeration of sprite sheet file names
	public enum SpriteSheets
	{
		BASE("base_out_atlas.png"),
		TERRAIN("terrain_atlas.png"),
		OBJECT("terrain_atlas.png"),
		BUILD("build_atlas.png");

		SpriteSheets(String file)
		{
			this.File = File;
		}
		private String File;
		public String GetFile()
		{
			return this.File;
		}
	}
}
