import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fries extends Actor
{
    static int speed = 5;
    
    public Fries()
    {
        getImage().scale(40, 40);
    }
    
    public void act()
    {
        if (getX() == 590 || getX() == 10)
        {
            speed *= -1;
        }
        setLocation(getX() + speed, getY());
    }
}
