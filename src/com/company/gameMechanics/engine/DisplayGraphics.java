package com.company.gameMechanics.engine;

import com.company.gameLevel.Layer;
import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameObjects.Player;
import com.company.gameSettings.Config;
import com.company.gameSettings.GameConstants;
import com.company.gameTile.GameTile;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.util.Arrays;

/**
 * Created by evnac on 6/27/2017.
 */
public class DisplayGraphics
{
	/*
	Given a layer, take the image map, and display it on the screen.
	 */
	public static void DisplayLayer(org.newdawn.slick.Graphics g, Player player, Layer layer)
	{
		// Get image map from layer
		Image[][] map = layer.GetImageMap();

		// Exit if map is null or empty
		if(map == null)
		{
			return;
		}
		if(map.length == 0 && map[0].length == 0)
		{
			return;
		}

		// Iterate across columns
		for(int col=0; col < map[0].length; col++)
		{
			// Iterate across rows
			for(int row=0; row<map.length; row++)
			{
				// Get current tile.
				Image currentTile = map[row][col];

				if(currentTile != null)
				{
					int x = col * GameConstants.SPRITE_BLOCK_WIDTH + (int)player.OffsetX;
					int y =  row * GameConstants.SPRITE_BLOCK_HEIGHT + (int)player.OffsetY;

					g.drawImage(currentTile,x,y);

				}
			}
		}
	}

	public static void ShowGridlines(Level level, Graphics g)
	{
		if(level.GetBackground().GetMap() != null)
		{
			int rows = level.GetBackground().GetMap().length;
			int cols = level.GetBackground().GetMap()[0].length;
			int height = rows * GameConstants.SPRITE_BLOCK_HEIGHT;
			int width = cols * GameConstants.SPRITE_BLOCK_WIDTH;
			int xOffset = (int)Player.OffsetX;
			int yOffset = (int) Player.OffsetY;

			g.setColor(Color.darkGray);

			for (int row = 0; row < rows; row++)
			{
				g.drawLine(xOffset, row * GameConstants.SPRITE_BLOCK_HEIGHT + yOffset, width + xOffset, row * GameConstants.SPRITE_BLOCK_HEIGHT + yOffset);
				if(row%2 == 0)
				{
					g.drawString(String.format("%s",row),2, row * GameConstants.SPRITE_BLOCK_HEIGHT + yOffset);
				}
			}
			for (int col = 0; col < cols; col++)
			{
				g.drawLine(col * GameConstants.SPRITE_BLOCK_WIDTH + xOffset, yOffset, col * GameConstants.SPRITE_BLOCK_WIDTH + xOffset , height + yOffset);
				if(col%2==0 && col!= 0)
				{
					g.drawString(String.format("%s",col),GameConstants.SPRITE_BLOCK_WIDTH*col + xOffset ,2);
				}
			}
		}
	}

	public static void DisplayPlayer(Player player, Graphics g)
	{
		g.drawImage(player.GetSprite().sprite[0][0],GameConstants.SPRITE_BLOCK_WIDTH * 13, GameConstants.SPRITE_BLOCK_HEIGHT * 8);
	}

	public static void DisplayLevel(org.newdawn.slick.Graphics g, Player player, Level level)
	{
		if(level.GetBackground() != null)
		{
			// Display Background
			DisplayLayer(g,player, level.GetBackground());
		}

		if(level.GetForeground() != null)
		{
			// Display Foreground
			DisplayLayer(g, player, level.GetForeground());
		}

		DisplayPlayer(player,g);

		if(Config.DevMode)
		{
			ShowGridlines(level,g);
		}
	}
}
