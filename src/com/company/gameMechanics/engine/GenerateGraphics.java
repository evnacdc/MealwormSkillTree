package com.company.gameMechanics.engine;

import com.company.gameObjects.GameObject;
import org.newdawn.slick.Image;

/**
 * Created by evnac on 6/29/2017.
 */
public class GenerateGraphics
{

	// Given a game object array, generate the corresponding image map
	public static Image[][] GenerateImageMap(GameObject[][] objectMap)
	{
		// TODO: Remove try-catch once program is stable and tested
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
				for (int x = 0; x < imageMap[0].length; x++)
				{
					// The image we're currently creating
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
								catch (Exception e)
								{
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
			// Send back image map we just created
			return imageMap;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
