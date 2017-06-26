package com.company;

import org.newdawn.slick.SlickException;

/**
 * Created by evnac on 6/25/2017.
 */
public class WallTile extends GameTile
{

	public WallTile(int spriteX, int spriteY) throws SlickException
	{
		super(spriteX, spriteY);
	}

	public WallTile(int spriteX, int spriteY, int height, int width) throws SlickException
	{
		super(spriteX, spriteY, height, width);
	}
}
