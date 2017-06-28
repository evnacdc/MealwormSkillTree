package com.company.gameMechanics.engine;

import com.company.gameLevel.Layer;
import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameSettings.config;
import com.company.gameTile.GameTile;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 * Created by evnac on 6/27/2017.
 */
public class graphics
{
	/*
	Given a layer, take the image map, and display it on the screen.
	 */
	public static void DisplayLayer(Graphics g, int offsetX, int offsetY, Layer layer)
	{
		// Get image map from layer
		Image[][] map = layer.GetImageMap();

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
					int x = col * config.SPRITE_BLOCK_WIDTH + offsetX;
					int y =  row * config.SPRITE_BLOCK_HEIGHT + offsetY;

					g.drawImage(currentTile,x,y);
				}
			}
		}
	}

	public static void DisplayLevel(Graphics g, int offsetX, int offsetY, Level level)
	{
		// Display Background
		DisplayLayer(g,offsetX,offsetY,level.GetBackground());

		// Display Foreground
		DisplayLayer(g,offsetX,offsetY,level.GetForeground());
	}
}
