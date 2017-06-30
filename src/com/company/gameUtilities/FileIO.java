package com.company.gameUtilities;


import com.company.gameObjects.GameObject;
import com.company.gameTile.RGB;
import com.company.gameVault.ColorMapVault;
import com.company.gameVault.GameObjectVault;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by evnac on 6/29/2017.
 */
public class FileIO
{

	public static GameObject[][] GetObjectArrayFromImage(String fileName)
	{
		try
		{
			BufferedImage img;
			img = ImageIO.read(new File(fileName));

			int imgHeight = img.getHeight();
			int imgWidth = img.getWidth();

			GameObject[][] objArr = new GameObject[imgHeight][imgWidth];

			// stuff happens

			// Go down rows
			for( int y = 0; y < imgHeight; y++)
			{
				// Go across columns
				for(int x = 0; x < imgWidth; x++)
				{
					// Get Current Pixel value in form of RGB object
					RGB currentRgbValue = GetRgbFromInt(img.getRGB(x,y));

					// Put value in corresponding spot of rgb array
					objArr[y][x] = ColorMapVault.Get(img.getRGB(x,y));
				}
			}

			return objArr;


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}

	public static RGB[][] GetRgbArrayFromImage(String fileName)
	{
		try
		{
			BufferedImage img;
			img = ImageIO.read(new File(fileName));

			int imgHeight = img.getHeight();
			int imgWidth = img.getWidth();

			RGB[][] rgbArr = new RGB[imgHeight][imgWidth];

			// stuff happens

			// Go down rows
			for( int y = 0; y < imgHeight; y++)
			{
				// Go across columns
				for(int x = 0; x < imgWidth; x++)
				{
					// Get Current Pixel value in form of RGB object
					RGB currentRgbValue = GetRgbFromInt(img.getRGB(x,y));

					// Put value in corresponding spot of rgb array
					rgbArr[y][x] = currentRgbValue;
				}
			}

			return rgbArr;


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}


	public static RGB GetRgbFromInt(int color)
	{

		int bitmask = 0xFF;

		// should be 8 bits, pretend there's 8 and not 4

		// red  grn  blue
		// 1001 0110 0101 color
		//           1111 bitmask
		// 0000 0000 0101 color & bitmask
		int blueValue = color & bitmask;

		bitmask = (bitmask << 8);

		// red  grn  blue
		// 1001 0110 0101 color
		//      1111      bitmask
		// 0000 0110 0000 color & bitmask
		int greenValue = (color & bitmask) >> 8;

		bitmask = (bitmask << 8);

		// rinse repeat
		int redValue = (color & bitmask) >> 16;

		return new RGB(redValue, greenValue, blueValue);
	}
}
