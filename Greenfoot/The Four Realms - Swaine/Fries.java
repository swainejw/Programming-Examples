import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fries extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 3);
        
        if (getY() > getWorld().getHeight() - 5)
        {
            getWorld().removeObject(this);
            return;
        }
        
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null)
        {
            Globals.h.fryCount++;
            if (Globals.h.fryCount == 5)
            {
                FallingWorld.dn.flipImage();
                Globals.h.doneFalling = true;
                getWorld().addObject(new Exit(), 40, getWorld().getHeight()/2);
            }
            getWorld().removeObject(this);
            return;
        }
    }
}
