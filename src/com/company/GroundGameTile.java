package com.company;

import org.newdawn.slick.SlickException;

/**
 * Created by evnac on 6/25/2017.
 */
public class GroundGameTile extends GameTile
{
	public GroundGameTile(int spriteX, int spriteY) throws SlickException
	{
		super(spriteX, spriteY);
	}

	public GroundGameTile(int spriteX, int spriteY, int height, int width) throws SlickException
	{
		super(spriteX, spriteY, height, width);
	}
}
