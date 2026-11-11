import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends World
{
    // Level 1 needs a timer to spawn eagles
    SimpleTimer t = new SimpleTimer();
    // set the number of owls and the grid size for the barrier
    int numOwls = 5;
    int barrX = 10;
    int barrY = 20;
    
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // add the hero and the evil baby to the screen
        addObject(GameData.h, 50, 200);
        
        // add the owls to the screen on the right side
        for (int i = 0; i < numOwls; i++)
        {
            // the 40+80i spaces them out on the y-coordinate
            addObject(new Owl(), 550, 40+80*i);
        }
        
        // put the barrier on the screen (a 2x2 grid of dots)
        for (int i = 0; i < barrX; i++)
        {
            for (int j = 0; j < barrY; j++)
            {
                addObject(new Block(), 100 + 6*i, 150 + 6*j);
            }
        }
        
        // Add the main score to the screen and set value to 0 every time
        // the world is recreated
        addObject(GameData.score, 60, 20);
        GameData.score.setValue(0);
    }
    
    
    public void act()
    {
        // Every 2 seconds, have an Eagle spawn on the right side
        if (t.millisElapsed() > 2000)
        {
            addObject(new Eagle(), 600, Greenfoot.getRandomNumber(getHeight()));
            t.mark();
        }
    }
}
