package com.company.gameLevel.outdoorLevels;

import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;

import static com.company.gameUtilities.FileIO.GetObjectArrayFromImage;

/**
 * Created by evnac on 6/27/2017.
 */
public class GrandmasNeighborhood extends Level
{

	@Override
	protected GameObject[][] CreateBackground()
	{
		return GetObjectArrayFromImage("img/maps/New Piskel.png");
	}

	@Override
	protected GameObject[][] CreateForeground()
	{
		return GetObjectArrayFromImage("img/maps/foreground.png");
	}

}