import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DoomMonster extends Actor
{
    int speed = 10;
    int health = 5;
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
