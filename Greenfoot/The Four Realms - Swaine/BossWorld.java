import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BossWorld extends World
{
    public BossWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(Globals.h, 300, 350);
        addObject(new DoomMonster(), 300, 50);
    }
}
