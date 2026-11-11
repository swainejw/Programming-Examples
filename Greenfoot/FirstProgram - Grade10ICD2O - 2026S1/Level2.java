import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
{
    // set the number of condors and the grid size for the barrier
    int numCondors = 5;
    int barrX = 6;
    int barrY = 7;
    
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // add the hero to the screen
        addObject(GameData.h, 50, 200);
        
        // making two lines of condors
        for (int x = 0; x < numCondors; x++)
        {
            addObject(new Condor(), 550, 40+80*x);
        }
        
        for (int x = 0; x < numCondors; x++)
        {
            addObject(new Condor(), 450, 40+80*x);
        }
        
        // make the barrier (smaller for level 2)
        for (int x = 0; x < barrX; x++)
        {
            for (int y = 0; y < barrY; y++)
            {
                addObject(new Block(), 100 + 6*x, 150 + 6*y);
            }
        }
        
        // Add the score from the GameData class (but don't reset it
        // because we're on Level2)
        addObject(GameData.score, 60, 20);
    }
    
    
    public void act()
    {
        // no eagles on level 2
    }
}
