import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FallingWorld extends World
{
    SimpleTimer t = new SimpleTimer();
    
    public FallingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Hero(), 300, 350);
    }
    
    public void act()
    {
        if (t.millisElapsed() > 4000)
        {
            addObject(new Fries(), Greenfoot.getRandomNumber(getWidth()), 0);
            t.mark();
        }
    }
}
