import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HeroBullet extends Actor
{
    int speed = 15;
    
    public void act()
    {
        setLocation(getX(), getY() - speed);
        
        if (getY() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
        
        DoomMonster dm = (DoomMonster) getOneIntersectingObject(DoomMonster.class);
        if (dm != null)
        {
            getWorld().removeObject(dm);
            Globals.h.doneBoss = true;   
            getWorld().removeObject(this);
            return;
        }
    }
}
