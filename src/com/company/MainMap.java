package com.company;

import com.company.gameLevel.Level;
import com.company.gameLevel.indoorLevels.GrandmasHouse;
import com.company.gameMechanics.engine.PlayerMechanics;
import com.company.gameObjects.Player;
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

	private static Player Player1;

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

			Player1 = GameObjectVault.Player1;
			currentLevel = new GrandmasHouse.Basement();
			Player1.NewMap(currentLevel,10,10);
		}
		catch(Exception e)
		{
			System.out.println("Error loading resources...\n\n" + e.toString());
			System.exit(1);
		}
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException
	{
		try
		{
			DisplayLevel(graphics , GameObjectVault.Player1 ,currentLevel);
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

		Player1.Update();

		if(input.isKeyDown(Input.KEY_W))
		{
			MoveUp();
			return;
		}
		if(input.isKeyDown(Input.KEY_A))
		{
			MoveLeft();
			return;
		}
		if(input.isKeyDown(Input.KEY_S))
		{
			MoveDown();
			return;
		}
		if(input.isKeyDown(Input.KEY_D))
		{
			MoveRight();
			return;
		}

	}

	private void MoveUp()
	{
		GameObjectVault.Player1.Move(PlayerMechanics.Directions.UP);
	}
	private void MoveDown()
	{
		GameObjectVault.Player1.Move(PlayerMechanics.Directions.DOWN);
	}
	private void MoveRight()
	{
		GameObjectVault.Player1.Move(PlayerMechanics.Directions.RIGHT);
	}
	private void MoveLeft()
	{
		GameObjectVault.Player1.Move(PlayerMechanics.Directions.LEFT);
	}
}
