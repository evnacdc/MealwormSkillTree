package com.company.gameLevel;

import com.company.gameObjects.BackgroundObjects.BackgroundObject;
import com.company.gameObjects.GameObject;
import com.company.gameObjects.SolidObjects.SolidObject;
import com.company.gameSettings.config;
import com.company.gameTile.GameTile;
import com.sun.org.apache.xml.internal.security.Init;
import org.lwjgl.system.CallbackI;
import org.newdawn.slick.Graphics;

/**
 * Created by evnac on 6/25/2017.
 */
public abstract class Level
{

	private BackgroundLayer Background;
	private ForegroundLayer Foreground;

	protected abstract GameObject[][] InitBackground();
	protected abstract GameObject[][] InitForeground();

	public Level()
	{

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
