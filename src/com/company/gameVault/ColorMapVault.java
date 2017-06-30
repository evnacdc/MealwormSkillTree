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
		ColorMap.put(new RGB(15,79,34),GameObjectVault.Tree1);
		ColorMap.put(new RGB(103,65,44),GameObjectVault.Tree1Stump);
		ColorMap.put(new RGB(63,72,204),GameObjectVault.StairCaseTop);
		ColorMap.put(new RGB(101,109,214),GameObjectVault.StairCaseMiddle);
		ColorMap.put(new RGB(153,158,227),GameObjectVault.StairCaseBottom);
		ColorMap.put(new RGB(101,109,214),GameObjectVault.Door1);
		ColorMap.put(new RGB(127,127,127),GameObjectVault.StoneWalkWay1);

	}

}
