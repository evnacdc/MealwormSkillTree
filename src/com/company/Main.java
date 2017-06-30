package com.company;

import com.company.gameMechanics.progression.SkillTree;
import com.company.gameUtilities.FileIO;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Main extends StateBasedGame {


    public static final String gameName = "Skill Tree";
    public static final int skillTreeIndex = 0;
    public static final int mainMapIndex = 1;

    public Main(String gameName)
    {
        super(gameName);
        this.addState(new SkillTree(skillTreeIndex));
        this.addState(new MainMap(mainMapIndex));

    }

    public static void main(String[] args) {
	// write your code here
        AppGameContainer gameContainer;
        try
        {
            gameContainer = new AppGameContainer(new Main(gameName));
            gameContainer.setDisplayMode(800,600,false);
            gameContainer.start();
        }
        catch (SlickException se)
        {
            se.printStackTrace();
        }
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException
    {
        this.getState(skillTreeIndex).init(gameContainer, this);
        this.getState(mainMapIndex).init(gameContainer, this);
        this.enterState(mainMapIndex);
    }
}
