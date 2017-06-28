package com.company;

import com.company.gameLevel.Level;
import com.company.gameVault.indoorLevels.GrandmasHouse;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import static com.company.gameMechanics.engine.graphics.DisplayLevel;

/**
 * Created by evnac on 6/25/2017.
 */
public class MainMap extends BasicGameState implements MouseListener
{

	int offsetX = 0;
	int offsetY = 0;

	double speed = .2;

	private Level currentLevel;

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
		//currentLevel = new GrandmasHouse.Basement();
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException
	{
		try
		{
			DisplayLevel(graphics , offsetX , offsetY,currentLevel);
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
