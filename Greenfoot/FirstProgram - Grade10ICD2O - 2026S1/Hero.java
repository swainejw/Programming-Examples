import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    
    int speed = 4; // the hero can move by this pixels at a time
    int shotDelay = 400; // the hero can only shoot at this interval
    int health = 3; // the hero has a health of 3
    public static SimpleTimer t = new SimpleTimer(); // the hero has a timer
    
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
        
        // shooting
        if (Greenfoot.isKeyDown("space") && t.millisElapsed() > shotDelay)
        {
            // add an Acorn to the world at the x,y of the Hero
            getWorld().addObject(new Acorn(), getX(), getY());
            // reset the timer
            t.mark();
        }
    }
}
