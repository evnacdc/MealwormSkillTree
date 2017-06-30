package com.company.gameTile;

/**
 * Created by evnac on 6/28/2017.
 */
public class RGB
{

	public int Red;
	public int Green;
	public int Blue;

	public RGB(int red, int green, int blue)
	{
		this.Red = red;
		this.Green = green;
		this.Blue = blue;
	}
	public int Value()
	{
		int val = 0;
		val += Blue;
		val += Green << 8;
		val += Red << 16;
		return val;
	}
	public static int ToInt(int red, int green, int blue)
	{
		int val = 0;
		val += blue;
		val += green << 8;
		val += red << 16;
		val |= 0xFF << 24;
		return val;
	}
}
