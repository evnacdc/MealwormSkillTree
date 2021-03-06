package com.company.gameVault;

import com.company.gameLevel.indoorLevels.GrandmasHouse;
import com.company.gameLevel.outdoorLevels.GrandmasNeighborhood;
import com.company.gameObjects.SolidObjects.ActiveSolidObjects.TeleportBlock;
import com.company.gameObjects.SolidObjects.ActiveSolidObjects.TransportBlock;

/**
 * Created by evnac on 7/3/2017.
 */

// Transport block valult generates the pairs of corresponding
// transport blocks such as doors, and stairs.
public class TeleportBlockVault
{

	public static TeleportBlock GrandmasOutsideDoor;
	public static TeleportBlock GrandmasInsideDoor;

	public TeleportBlockVault()
	{
		GrandmasOutsideDoor = new TeleportBlock(GameTileVault.Door1, LevelVault.GrandmasNeighborhood, 14,7,0,2);
		GrandmasInsideDoor = new TeleportBlock(GameTileVault.TanSquare, LevelVault.GrandmasGroundFloor, 5,7,0,-1);


		LevelVault.GrandmasNeighborhood.AddForegroundObject(GameObjectVault.StoneWall1_1x3,1,1);

		GenerateTeleportPair(GrandmasOutsideDoor,GrandmasInsideDoor);
	}

	private void GenerateTeleportPair(TeleportBlock block1, TeleportBlock block2)
	{
		block1.DestinationBlock = block2;
		block2.DestinationBlock = block1;

		block1.BlockLevel.AddForegroundObject(block1,block1.GetX(),block1.GetY());
		block2.BlockLevel.AddForegroundObject(block2,block2.GetX(),block2.GetY());
	}
}