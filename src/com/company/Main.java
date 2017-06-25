package com.company;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Main extends StateBasedGame {


    public static final String gameName = "Skill Tree";
    public static final int treeView = 0;

    public Main(String gameName)
    {
        super(gameName);
        this.addState(new SkillTree(treeView));

    }

    public static void main(String[] args) {
	// write your code here
        AppGameContainer gameContainer;
        try
        {
            gameContainer = new AppGameContainer(new Main(gameName));
            gameContainer.setDisplayMode(1000,800,false);
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
        this.getState(treeView).init(gameContainer, this);
        this.enterState(treeView);
    }
}
