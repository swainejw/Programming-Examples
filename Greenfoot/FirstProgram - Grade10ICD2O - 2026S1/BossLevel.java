import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BossLevel extends World
{
    // set the number of condors and the grid size for the barrier
    int numCondors = 5;
    int barrX = 6;
    int barrY = 7;
    
    public BossLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // add the hero
        addObject(GameData.h, 50, 200);
        // add the Boss
        addObject(new Boss(), 450, 200);
        
        // Add the score from the GameData class (but don't reset it
        // because we're on BossLevel)
        addObject(GameData.score, 60, 20);
    }
    
    
    public void act()
    {
        // no eagles on level 2
    }
}
