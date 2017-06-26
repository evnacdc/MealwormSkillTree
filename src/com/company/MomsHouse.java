package com.company;

/**
 * Created by evnac on 6/25/2017.
 */
public class MomsHouse extends GameLevel
{

	public MomsHouse()
	{
		super();

	}

	@Override
	public GameTile[][] InitMap()
	{

		return new GameTile[][] {{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
				{Tiles.Grass1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2}};
	}
}
