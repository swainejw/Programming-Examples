import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer t1 = new SimpleTimer();
    SimpleTimer t2 = new SimpleTimer();
    public static Hero h = new Hero();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(h, 100, 300);
        h.health = 3;
        
        for (int x = 0; x < h.health; x++)
        {
            addObject(new Heart(), 40+60*x, 50);
        }
    }
    
    public void act()
    {
        if (t1.millisElapsed() > 1200)
        {
            addObject(new Projectile(), getWidth(), 200);
            t1.mark();
        }
        
        if (t2.millisElapsed() > 5900)
        {
            addObject(new Mooshroom(), getWidth(), 300);
            t2.mark();
        }
    }
}
