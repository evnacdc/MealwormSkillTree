package com.company.gameLevel;

import com.company.gameObjects.GameObject;

/**
 * Created by evnac on 6/25/2017.
 */
public abstract class Level
{

	private BackgroundLayer Background;
	private ForegroundLayer Foreground;

	protected abstract GameObject[][] CreateObjectMap();

	public Level()
	{
		this.Background = new BackgroundLayer(CreateObjectMap());
	}

	public BackgroundLayer GetBackground()
	{
		return Background;
	}
	public ForegroundLayer GetForeground()
	{
		return Foreground;
	}

}