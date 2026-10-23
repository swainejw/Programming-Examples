import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Acorn(), getX(), getY());
        }
    }
}
