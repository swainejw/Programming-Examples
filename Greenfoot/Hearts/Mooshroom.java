import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mooshroom extends Actor
{
    public void act()
    {
        setLocation(getX() - 4, getY());
        turn(57);
        
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null)
        {
            h.extraLife();
            getWorld().removeObject(this);
            return;
        }
        
        if (getX() < 10)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
