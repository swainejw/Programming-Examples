import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Tux tx = new Tux();
    SimpleTimer t = new SimpleTimer();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        addObject(tx, 300, 340);
        for (int x = 0; x < 30; x++)
        {
            addObject(new Brick(), 10 + 20*x, 380);
        }
    }
    
    public void act()
    {
        if (t.millisElapsed() > 1000)
        {
            addObject(new Balloon(), 800, 40);
            t.mark();
        }
    }
}
