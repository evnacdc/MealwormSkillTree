package com.company.gameLevel;

import com.company.gameMechanics.engine.DisplayGraphics;
import com.company.gameMechanics.engine.GenerateGraphics;
import com.company.gameObjects.GameObject;
import org.newdawn.slick.Image;

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
		this.ImageMap = GenerateGraphics.GenerateImageMap(objectMap);
	}

	public GameObject[][] GetMap()
	{
		return this.ObjectMap;
	}

	public Image[][] GetImageMap()
	{
		return this.ImageMap;
	}

}
