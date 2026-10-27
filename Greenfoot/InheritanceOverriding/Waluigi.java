import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Waluigi extends KoopaTroopa
{
    SimpleTimer t = new SimpleTimer();
    
    public Waluigi()
    {
        getImage().scale(20, 40);
    }
    
    public void act()
    {
        setLocation(getX() + 4, getY());
        
        if (t.millisElapsed() > 1000)
        {
            getWorld().addObject(new GreenShell(), getX(), getY());
            t.mark();
        }
        
        super.act();
    }
}
