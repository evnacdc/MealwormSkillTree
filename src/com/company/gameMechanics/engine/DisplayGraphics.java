package com.company.gameMechanics.engine;

import com.company.gameLevel.Layer;
import com.company.gameLevel.Level;
import com.company.gameObjects.GameObject;
import com.company.gameObjects.Player;
import com.company.gameSettings.Config;
import com.company.gameSettings.GameConstants;
import com.company.gameTile.GameTile;
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
	}
}
