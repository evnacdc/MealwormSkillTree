package com.company;

/**
 * Created by evnac on 6/26/2017.
 */
public class Tiles
{

	public static GameTile Grass1;
	public static GameTile Grass2;
	public static GameTile Grass3;
	public static GameTile SpikeBall;

	public static GameTile TallGrass_LB;
	public static GameTile TallGrass_MB;
	public static GameTile TallGrass_RB;

	public static GameTile Stump;

	public static GameTile WoodFloor1;



	public static GameTile Wall1;

	public Tiles()
	{
		try
		{
			WoodFloor1 = new GroundGameTile(18, 20);

			Grass1 = new GroundGameTile(0,25);
			Grass2 = new GroundGameTile(1,25);
			Grass3 = new GroundGameTile(1,25);
			SpikeBall = new GroundGameTile(9,14);

			Stump = new GroundGameTile(16,14,3,2);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
