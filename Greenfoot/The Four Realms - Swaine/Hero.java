import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int speed = 5;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
        else if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }
    }
}
