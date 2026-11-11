import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
{
    SimpleTimer t = new SimpleTimer();
    
    // set the number of owls and the grid size for the barrier
    int numCondors = 5;
    int barrX = 6;
    int barrY = 7;
    
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // add the hero and the evil baby to the screen
        addObject(GameData.h, 50, 200);
        
        for (int x = 0; x < numCondors; x++)
        {
            addObject(new Condor(), 550, 40+80*x);
        }
        
        for (int x = 0; x < numCondors; x++)
        {
            addObject(new Condor(), 450, 40+80*x);
        }
        
        for (int x = 0; x < barrX; x++)
        {
            for (int y = 0; y < barrY; y++)
            {
                addObject(new Block(), 100 + 6*x, 150 + 6*y);
            }
        }
        
        addObject(GameData.score, 60, 20);
    }
    
    
    public void act()
    {
        if (t.millisElapsed() > 2000)
        {
            addObject(new Eagle(), 600, Greenfoot.getRandomNumber(getHeight()));
            t.mark();
        }
    }
}
