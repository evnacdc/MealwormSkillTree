package com.company.gameObjects.SolidObjects.ActiveSolidObjects;

import com.company.gameLevel.Level;
import com.company.gameTile.GameTile;
import com.company.interfaces.ICoordinates;

/**
 * Created by evnac on 7/3/2017.
 */
public class TeleportBlock extends TransportBlock implements ICoordinates
{
	private int X;
	private int Y;

	private int OffsetPlayerOutX;
	private int OffsetPlayerOutY;

	public int Width;
	public int Height;

	public Level BlockLevel;

	public TeleportBlock DestinationBlock;

	public TeleportBlock(GameTile sprite, Level level, int x, int y)
	{
		super(sprite);
		BlockLevel = level;
		this.X = x;
		this.Y = y;
	}

	public TeleportBlock(GameTile sprite, Level level, int x, int y, int offsetX, int offsetY)
	{
		this(sprite,level,x,y);
		this.OffsetPlayerOutX = offsetX;
		this.OffsetPlayerOutY = offsetY;
	}

	@Override
	public void SetX(int x)
	{
		this.X = x;
	}

	@Override
	public void SetY(int y)
	{
		this.Y = y;
	}

	@Override
	public int GetX()
	{
		return X;
	}

	@Override
	public int GetY()
	{
		return Y;
	}
}
