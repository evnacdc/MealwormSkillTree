package com.company;

import org.newdawn.slick.SlickException;

/**
 * Created by evnac on 6/25/2017.
 */
public class SolidGameTile extends GameTile
{
	public SolidGameTile(int spriteX, int spriteY) throws SlickException
	{
		super(spriteX, spriteY);
	}

	public SolidGameTile(int spriteX, int spriteY, int height, int width) throws SlickException
	{
		super(spriteX, spriteY, height, width);
	}
}
