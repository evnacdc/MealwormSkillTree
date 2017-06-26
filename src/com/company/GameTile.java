package com.company;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.awt.*;

/**
 * Created by evnac on 6/25/2017.
 */
public abstract class GameTile
{
	enum TileID{STONE_FLOOR,WOOD_FLOOR,WALL}

	Image[][] sprite;
	String name;
	TileID id;

	protected int spriteSheetX;
	protected int spriteSheetY;

	protected Dimension dimensions;
	protected boolean interactive;
	protected boolean solid;

	public boolean singleBlock;

	public Dimension getDimensions()
	{
		return this.dimensions;
	}

	public GameTile(int spriteX, int spriteY) throws SlickException
	{
		this(spriteX,spriteY,1,1);
	}

	public GameTile(int spriteX, int spriteY, int height, int width) throws SlickException
	{
		this.spriteSheetX = spriteX;
		this.spriteSheetY = spriteY;
		this.dimensions = new Dimension(width,height);

		if(this.dimensions.getWidth() == 1 && this.dimensions.getHeight() == 1)
		{
			this.singleBlock = true;
		}

		InitSprite();
	}

	// Take current sprite size and fill up sprite array with images
	private void InitSprite() throws SlickException
	{
		this.sprite = new Image[(int)dimensions.getHeight()][(int)dimensions.getWidth()];

		if(this.sprite!= null)
		{
			for(int row=0; row<this.dimensions.getHeight(); row++)
			{
				for(int col=0; col<this.dimensions.getWidth(); col++)
				{
					this.sprite[row][col] = new SpriteSheet(
							new Image("img/terrain_atlas.png"),GameConfig.SPRITE_BLOCK_WIDTH, GameConfig.SPRITE_BLOCK_HEIGHT)
							.getSprite( this.spriteSheetX + col, this.spriteSheetY+row);
				}
			}
		}
		else
		{
			throw new SlickException("Sprite variable not initialized to an object.");
		}
	}


}
