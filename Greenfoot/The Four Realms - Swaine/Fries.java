import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fries extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 3);
        
        if (getY() > getWorld().getHeight() - 5)
        {
            getWorld().removeObject(this);
        }
    }
}
