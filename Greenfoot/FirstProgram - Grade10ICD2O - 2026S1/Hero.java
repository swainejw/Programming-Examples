import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int speed = 4;
    
    public void act()
    {
        // this code allows the user to control the hero with keys
        if (Greenfoot.isKeyDown("down"))
        {
            // go down 2 pixels
            setLocation(getX(), getY() + speed);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            // go up 2 pixels
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            // go right 2 pixels
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            // go left 2 pixels
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("space"))
        {
            // add an Acorn to the world at the x,y of the Hero
            getWorld().addObject(new Acorn(), getX(), getY());
        }
    }
}
