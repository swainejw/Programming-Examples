import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    // all enemies share this constructor which gets run by default
    // if the specific enemy doesn't have it's own constructor
    public Enemy()
    {
        getImage().scale(80, 80);
    }
    
    // the default act method for an enemy (not run if the specific
    // enemy has its own act method)
    public void act()
    {
        setLocation(getX() - 4, getY());
        if (getX() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
