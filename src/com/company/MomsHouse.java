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
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2,Tiles.DirtPatch_3_3,null        ,null        ,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, null              ,null        ,null        ,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, null              ,null        ,null        ,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
								{Tiles.Grass1,Tiles.WoodFloor1,Tiles.Grass2,Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2,Tiles.Grass2},
				                {Tiles.Grass1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1,Tiles.WoodFloor1},
				                {Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				                {Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Tree_2_5,null      ,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,null      ,null      ,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,null      ,null      ,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,null      ,null      ,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,null      ,null      ,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2},
				{Tiles.Grass2, Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass1,Tiles.Grass2,Tiles.Grass1,Tiles.Grass2}};
	}
}
