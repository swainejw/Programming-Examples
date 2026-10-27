import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Acorn extends Actor
{
    public void act()
    {
        setLocation(getX() + 15, getY());
        if (getX() > 595)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
