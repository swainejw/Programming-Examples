import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static Counter score = new Counter();
    public static Hero h = new Hero();
    public static SimpleTimer t = new SimpleTimer();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // add the hero and the evil baby to the screen
        addObject(h, 50, 200);
        
        for (int x = 0; x < 5; x++)
        {
            addObject(new Owl(), 550, 40+80*x);
        }
        
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 16; y++)
            {
                addObject(new Block(), 100 + 6*x, 150 + 6*y);
            }
        }
        
        addObject(score, 60, 20);
        score.setValue(0);
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
