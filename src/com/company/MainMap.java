package com.company;

import com.company.gameLevel.Level;
import com.company.gameLevel.indoorLevels.GrandmasHouse;
import com.company.gameSettings.GameConstants;
import com.company.gameVault.ColorMapVault;
import com.company.gameVault.LevelVault;
import com.company.gameVault.GameObjectVault;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import static com.company.gameMechanics.engine.DisplayGraphics.DisplayLevel;

/**
 * Created by evnac on 6/25/2017.
 */
public class MainMap extends BasicGameState implements MouseListener
{

	double offsetX = 0;
	double offsetY = 0;

	double speed = .1;

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
		try
		{
			new GameConstants();
			new GameObjectVault();
			new ColorMapVault();
			new LevelVault();

		}
		catch(Exception e)
		{
			System.out.println("Error loading resources...\n\n" + e.toString());
			System.exit(1);
		}

		currentLevel = new GrandmasHouse.Basement();
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException
	{
		try
		{
			DisplayLevel(graphics , (int)offsetX , (int)offsetY,currentLevel);
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
