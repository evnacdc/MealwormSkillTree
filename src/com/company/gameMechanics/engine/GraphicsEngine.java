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
public class GraphicsEngine
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

	public static Image[][] GenerateImageMap(GameObject[][] objectMap)
	{
		try
		{
			// Return null map if no data exists
			if(objectMap.length == 0 && objectMap[0] == null)
			{
				return null;
			}
			// Make image map of same size as Object Map
			Image[][] imageMap = new Image[objectMap.length][objectMap[0].length];

			// Copy Image data from object map to image map
			for (int y = 0; y < imageMap.length; y++)
			{
				for (int x = 0; x < imageMap.length; x++)
				{
					Image currentImage = imageMap[y][x];

					// Only start drawing on empty tile
					if (currentImage == null)
					{
						Image[][] imageToDraw = objectMap[y][x].GetSprite().sprite;

						// Start drawing new sprite onto canvas
						for (int i = 0; i < imageToDraw.length; i++)
						{
							for (int j = 0; j < imageToDraw[0].length; j++)
							{
								try
								{
									int xCord = x + j;
									int yCord = y + i;

									// Make sure tile being drawn is within coordinates of canvas
									if (xCord <= imageMap[0].length && yCord <= imageMap.length)
									{
										imageMap[yCord][xCord] = imageToDraw[i][j];
									}
								}
								catch(Exception e)
								{
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
			return imageMap;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public static void PasteSprite(Image[][] sprite, Image[][] canvas, int startX, int startY)
	{

	}
}
