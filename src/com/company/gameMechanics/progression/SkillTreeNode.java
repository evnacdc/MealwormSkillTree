package com.company.gameMechanics.progression;

import org.newdawn.slick.Image;

import java.util.ArrayList;

/**
 * Created by evnac on 6/25/2017.
 */
public abstract class SkillTreeNode
{
	int teir;
	int cost;
	boolean enabled;
	Image icon;

	ArrayList<SkillTreeNode> childNodes = new ArrayList<SkillTreeNode>();


}
