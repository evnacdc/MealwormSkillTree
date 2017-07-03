package com.company.gameVault;

import com.company.gameObjects.GameObject;
import com.company.gameTile.RGB;
import sun.awt.image.PixelConverter;

import java.nio.channels.GatheringByteChannel;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by evnac on 6/28/2017.
 */
public class ColorMapVault
{
	private static ArrayList<ColorObjectPair> ColorMap;

	public ColorMapVault()
	{
		this.ColorMap = new ArrayList<ColorObjectPair>();
		AddMappings();
	}

	private void AddMappings()
	{
		// Transparent block
		Add( 0, null);

		Add(1,3,5, GameObjectVault.GrassPatchWholeWithMostLeaves);
		Add(15,79,34,GameObjectVault.Tree1);
		Add(103,65,44,GameObjectVault.Tree1Stump);
		Add(63,72,204,GameObjectVault.StairCaseTop);
		Add(101,109,214,GameObjectVault.StairCaseMiddle);
		Add(153,158,227,GameObjectVault.StairCaseBottom);
		Add(127,127,127,GameObjectVault.StoneWalkWay1);
	}

	private void Add(int red, int green, int blue, GameObject obj)
	{
		ColorMap.add(new ColorObjectPair(RGB.ToInt(red,green,blue),obj));
	}

	private void Add(int rgb, GameObject obj)
	{
		ColorMap.add(new ColorObjectPair(rgb,obj));
	}

	public static GameObject Get(int r, int g, int b)
	{
		 return ColorMapVault.Get(RGB.ToInt(r,g,b));
	}

	public static GameObject Get(int rgbInt)
	{
		for(ColorObjectPair pair: ColorMap)
		{
			if(pair.Color == rgbInt )
			{
				return pair.Object;
			}
		}
		return GameObjectVault.DevTexture;
	}

	private class ColorObjectPair
	{
		int Color;
		GameObject Object;

		public ColorObjectPair(int color, GameObject obj)
		{
			this.Color = color;
			this.Object = obj;
		}
	}
}
