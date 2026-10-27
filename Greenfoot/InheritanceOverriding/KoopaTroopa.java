import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class KoopaTroopa extends Enemy
{
    SimpleTimer t = new SimpleTimer();
    
    public void act()
    {
        setLocation(getX() - 4, getY());
        
        if (t.millisElapsed() > 400)
        {
            getWorld().addObject(new PurpleShell(), getX(), getY());
            t.mark();
        }
        
        super.act();
    }
}
