import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    public void act()
    {
        // this code allows the user to control the hero with keys
        if (Greenfoot.isKeyDown("down"))
        {
            // go down 2 pixels
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            // go up 2 pixels
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            // go right 2 pixels
            setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            // go left 2 pixels
            setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("space"))
        {
            // add an Acorn to the world at the x,y of the Hero
            getWorld().addObject(new Acorn(), getX(), getY());
        }
    }
}
