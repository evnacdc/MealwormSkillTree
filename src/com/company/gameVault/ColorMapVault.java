package com.company.gameVault;

import com.company.gameObjects.GameObject;
import com.company.gameTile.RGB;
import sun.awt.image.PixelConverter;

import java.util.HashMap;

/**
 * Created by evnac on 6/28/2017.
 */
public class ColorMapVault
{
	public static HashMap<RGB,GameObject> ColorMap;

	public ColorMapVault()
	{
		this.ColorMap = new HashMap<>(1000);
		AddMappings();
	}

	private void AddMappings()
	{
		ColorMap.put(new RGB(1,3,5), GameObjectVault.GrassPatchWholeWithMostLeaves);
		ColorMap.put(new RGB(101,109,214),GameObjectVault.StairCaseMiddle);
	}

}
