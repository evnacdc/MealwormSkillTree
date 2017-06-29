package com.company.gameObjects;

import com.company.gameTile.GameTile;

/**
 * Created by evnac on 6/27/2017.
 */
public abstract class GameObject
{
	private GameTile Sprite;


	public GameTile GetSprite()
	{
		return this.Sprite;
	}

	public GameObject(GameTile sprite)
	{
		this.Sprite = sprite;
	}
}
