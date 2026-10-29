import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BabyBullet extends Actor
{
    public void act()
    {
        // move to the left by 15 pixels at a time
        setLocation(getX() - 15, getY());
        
        // if the x coordinate of the acorn gets above 595, remove it
        if (getX() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
