package com.company.gameLevel;

import com.company.gameObjects.GameObject;

import java.awt.*;

/**
 * Created by evnac on 6/25/2017.
 */
public abstract class Level
{
	private String Name;

	private BackgroundLayer Background;
	private ForegroundLayer Foreground;

	protected abstract GameObject[][] CreateBackground();
	protected abstract GameObject[][] CreateForeground();

	public Level()
	{
		this.Background = new BackgroundLayer(CreateBackground());
		this.Foreground = new ForegroundLayer(CreateForeground());
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