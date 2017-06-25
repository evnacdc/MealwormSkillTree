package com.company;

import javafx.scene.input.MouseButton;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.awt.geom.Rectangle2D;

/**
 * Created by evnac on 6/25/2017.
 */
public class SkillTree extends BasicGameState
{

	private static final double GRAVITY_SCALE = .0005;

	private float boxX;
	private float boxY;
	private float boxVelY;
	private float boxVelX;

	private Rectangle floor;

	public SkillTree(int state)
	{

	}

	@Override
	public int getID()
	{
		return Main.treeView;
	}

	@Override
	public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException
	{
		boxX = 10;
		boxY = 10;
		boxVelX = 0;
		boxVelY = 0;

		floor = new Rectangle(0, gameContainer.getHeight()-20, gameContainer.getWidth(), 20);
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException
	{
		graphics.setColor(Color.red);
		graphics.fillRect(boxX,boxY,200,200);
		DrawFloor(graphics);
	}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException
	{
		Input input = gameContainer.getInput();
		if (input.isKeyDown(Input.KEY_W))
		{

			boxY--;
		}
		if (input.isKeyDown(Input.KEY_A))
		{
			boxX--;
		}
		if (input.isKeyDown(Input.KEY_S))
		{
			boxY++;
		}
		if (input.isKeyDown(Input.KEY_D))
		{
			boxX++;
		}

		boxVelY += GRAVITY_SCALE;

		boxX += boxVelX;
		boxY += boxVelY;
	}

	public void DrawFloor(Graphics g)
	{
		g.setColor(Color.white);
		g.fill(floor);
	}
}
