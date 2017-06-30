package com.company.gameUtilities;


import com.company.gameTile.RGB;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by evnac on 6/29/2017.
 */
public class FileIO
{
	public static RGB[][] GetRgbArrayFromImage()
	{
		try
		{
			BufferedImage img;
			img = ImageIO.read(new File("img/singleTiles/DevTexture.png"));

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

		bitmask = bitmask << 8;

		// red  grn  blue
		// 1001 0110 0101 color
		//      1111      bitmask
		// 0000 0110 0000 color & bitmask
		int greenValue = color & bitmask;

		bitmask = bitmask << 8;

		// rinse repeat
		int redValue = color & bitmask;

		return new RGB(redValue, greenValue, blueValue);
	}
}
