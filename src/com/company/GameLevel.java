package com.company;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by evnac on 6/25/2017.
 */
public abstract class GameLevel
{

	private GameTile[][] Map;

	abstract GameTile[][] InitMap();

	public GameLevel()
	{
		this.Map = InitMap();
	}

	public void Display(Graphics g, int offsetX, int offsetY)
	{
		for(int col=0; col < Map[0].length; col++)
		{
			GameTile currentTile;
			for(int row=0; row<Map.length; row++)
			{

				currentTile = Map[row][col];
				if(currentTile != null)
				{
					if (currentTile.singleBlock)
					{
						g.drawImage(currentTile.sprite[0][0], col * GameConfig.SPRITE_BLOCK_WIDTH + offsetX, row * GameConfig.SPRITE_BLOCK_HEIGHT + offsetY);
					}
					else
					{
						for (int spriteCol = 0; spriteCol < currentTile.dimensions.getWidth(); spriteCol++)
						{
							for (int spriteRow = 0; spriteRow < currentTile.dimensions.getHeight(); spriteRow++)
							{
								g.drawImage(currentTile.sprite[spriteRow][spriteCol], (col + spriteCol) * GameConfig.SPRITE_BLOCK_WIDTH + offsetX, (row + spriteRow) * GameConfig.SPRITE_BLOCK_HEIGHT + offsetY);
							}
						}
					}
				}
			}
		}

	g.drawImage(Tiles.SpikeBall.sprite[0][0],200,200);


	}

}
