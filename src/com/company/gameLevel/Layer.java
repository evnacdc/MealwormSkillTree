package com.company.gameLevel;

import com.company.gameObjects.GameObject;
import org.newdawn.slick.Image;

import java.util.Arrays;

/**
 * Created by evnac on 6/27/2017.
 */
public abstract class Layer
{
	// Logical part of the layer. Contains object references to each tile.
	protected GameObject[][] ObjectMap;

	// Contains the images of the map and no information
	protected Image[][] ImageMap;

	// Default ctor
	public Layer(GameObject[][] objectMap)
	{
		this.ObjectMap = objectMap;

		this.ImageMap = GenerateImageMap(objectMap);
	}

	public GameObject[][] GetMap()
	{
		return this.ObjectMap;
	}

	public Image[][] GetImageMap()
	{
		return this.ImageMap;
	}

	public Image[][] GenerateImageMap(GameObject[][] objectMap)
	{
		// Make image map of same size as Object Map
		Image[][] imageMap = new Image[objectMap[0].length][objectMap.length];

		// Init array to null. Null values are assumed to be unfilled spaces.
		Arrays.fill(imageMap,null);

		// Copy Image data from object map to image map
		for(int y=0; y<imageMap[0].length; y++)
		{
			for(int x=0; x<imageMap.length; x++)
			{
				Image currentImage = imageMap[y][x];

				// Only start drawing on empty tile
				if( currentImage == null)
				{
					GameObject currentObject = objectMap[y][x];
					PasteSprite(currentObject.GetSprite().sprite,imageMap,x,y);
				}
			}
		}

		return null;
	}

	public void PasteSprite(Image[][] sprite, Image[][] canvas, int startX, int startY)
	{
		for(int i=0; i<sprite[0].length; i++)
		{
			for (int j = 0; j < sprite.length; j++)
			{
				int xCord = startX + j;
				int yCord = startY + i;

				canvas[yCord][xCord] = sprite[i][j];
			}
		}
	}
}
