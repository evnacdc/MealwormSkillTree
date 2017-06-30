package com.company.gameTile;

import com.company.gameSettings.Config;
import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;

import java.awt.*;

/**
 * Created by evnac on 6/25/2017.
 */

// Visual representation of the sprites in the game. GameTile holds an array
// of Images to display a game object, along with metadata and tile generation
// methods to generate new game tiles.
public class GameTile
{

	public Image[][] sprite;
	public String Name;
	public int TileID ;

	protected int spriteSheetX;
	protected int spriteSheetY;

	public Dimension dimensions;
	public boolean singleBlock;

	private String FileName;

	public Dimension getDimensions()
	{
		return this.dimensions;
	}

	public GameTile(String fileName)
	{
		this(0,0, fileName);
	}

	// make singe sized block
	public GameTile(int spriteX, int spriteY, String fileName)
	{
		this(spriteX,spriteY,1,1, fileName);
	}

	// make larger tile
	public GameTile(int spriteX, int spriteY, int height, int width, String fileName)
	{
		// Init globals
		this.spriteSheetX = spriteX;
		this.spriteSheetY = spriteY;
		this.dimensions = new Dimension(width,height);
		this.FileName = fileName;

		// Set single block flag
		if(this.dimensions.getWidth() == 1 && this.dimensions.getHeight() == 1)
		{
			this.singleBlock = true;
		}

		// Setup sprite with given parameters
		InitSprite();
	}

	// Take current sprite size and fill up sprite array with images
	void InitSprite()
	{
		this.sprite = new Image[(int)dimensions.getHeight()][(int)dimensions.getWidth()];

		try
		{
			if (this.sprite != null)
			{
				for (int row = 0; row < this.dimensions.getHeight(); row++)
				{
					for (int col = 0; col < this.dimensions.getWidth(); col++)
					{
						this.sprite[row][col] = new SpriteSheet(
								new Image(this.FileName), Config.SPRITE_BLOCK_WIDTH, Config.SPRITE_BLOCK_HEIGHT)
								.getSprite(this.spriteSheetX + col, this.spriteSheetY + row);
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
