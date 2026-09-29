import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoomMonster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoomMonster extends Actor
{
    int speed = 10;
    SimpleTimer t = new SimpleTimer();
    
    public DoomMonster()
    {
        getImage().scale(100, 100);
    }
    
    public void act()
    {
        if (t.millisElapsed() > 3000)
        {
            getWorld().addObject(new Fireball(), getX(), getY() + 10);
            t.mark();
        }
        
        setLocation(getX() + speed, getY());
        if (isAtEdge() == true)
        {
            speed *= -1;
        }
    }
}
