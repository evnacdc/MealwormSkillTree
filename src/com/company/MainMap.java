package com.company;

import com.company.gameLevel.Level;
import com.company.gameLevel.indoorLevels.GrandmasHouse;
import com.company.gameSettings.GameConstants;
import com.company.gameVault.ColorMapVault;
import com.company.gameVault.GameLevelVault;
import com.company.gameVault.GameObjectVault;
import com.sun.javaws.exceptions.ExitException;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import sun.security.pkcs11.wrapper.Constants;

import static com.company.gameMechanics.engine.GraphicsEngine.DisplayLevel;

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

		try
		{
			new GameConstants();
			new GameObjectVault();
			new GameLevelVault();
			new ColorMapVault();
		}
		catch(Exception e)
		{
			System.out.println("Error loading resources...\n\n" + e.toString());
			System.exit(1);
		}

		currentLevel = new GrandmasHouse.GroundFloor();
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
