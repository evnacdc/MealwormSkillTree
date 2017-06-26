package com.company;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

/**
 * Created by evnac on 6/25/2017.
 */
public class MainMap extends BasicGameState implements MouseListener
{

	double offsetX = 0;
	double offsetY = 0;

	double speed = .2;

	private GameLevel currentLevel;

	public MainMap(int index)
	{

	}

	@Override
	public int getID()
	{
		return Main.mainMapIndex;
	}

	@Override
	public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException
	{
		Tiles tiles = new Tiles();
		currentLevel = new MomsHouse();
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException
	{
		try
		{
			currentLevel.Display(graphics,(int)offsetX,(int)offsetY);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException
	{
		Input input = gameContainer.getInput();

		if(input.isKeyDown(Input.KEY_W)) { MoveUp();}
		if(input.isKeyDown(Input.KEY_A)) { MoveLeft();}
		if(input.isKeyDown(Input.KEY_S)) { MoveDown();}
		if(input.isKeyDown(Input.KEY_D)) { MoveRight();}

	}

	private void MoveUp()
	{
		offsetY+=speed;
	}
	private void MoveDown()
	{
		offsetY-=speed;
	}
	private void MoveRight()
	{
		offsetX-=speed;
	}
	private void MoveLeft()
	{
		offsetX+=speed;
	}
}
