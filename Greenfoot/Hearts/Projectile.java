import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Projectile extends Actor
{
    public void act()
    {
        setLocation(getX() - 5, getY());
        
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null)
        {
            h.loseLife();
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
