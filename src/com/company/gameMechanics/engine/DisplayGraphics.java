package com.company.gameMechanics.engine;

import com.company.gameLevel.Layer;
import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameSettings.Config;
import com.company.gameTile.GameTile;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.util.Arrays;

/**
 * Created by evnac on 6/27/2017.
 */
public class DisplayGraphics
{
	/*
	Given a layer, take the image map, and display it on the screen.
	 */
	public static void DisplayLayer(org.newdawn.slick.Graphics g, int offsetX, int offsetY, Layer layer)
	{
		// Get image map from layer
		Image[][] map = layer.GetImageMap();

		// Exit if map is null or empty
		if(map == null)
		{
			return;
		}
		if(map.length == 0 && map[0].length == 0)
		{
			return;
		}

		// Iterate across columns
		for(int col=0; col < map[0].length; col++)
		{
			// Iterate across rows
			for(int row=0; row<map.length; row++)
			{
				// Get current tile.
				Image currentTile = map[row][col];

				if(currentTile != null)
				{
					int x = col * Config.SPRITE_BLOCK_WIDTH + offsetX;
					int y =  row * Config.SPRITE_BLOCK_HEIGHT + offsetY;

					g.drawImage(currentTile,x,y);
				}
			}
		}
	}

	public static void DisplayPlayer()
	{

	}

	public static void DisplayLevel(org.newdawn.slick.Graphics g, int offsetX, int offsetY, Level level)
	{
		if(level.GetBackground() != null)
		{
			// Display Background
			DisplayLayer(g, offsetX, offsetY, level.GetBackground());
		}

		if(level.GetForeground() != null)
		{
			// Display Foreground
			DisplayLayer(g, offsetX, offsetY, level.GetForeground());
		}
	}
}
