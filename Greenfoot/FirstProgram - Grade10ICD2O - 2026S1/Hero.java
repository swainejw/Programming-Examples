import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    // the hero can move by 4 pixels at a time
    int speed = 4;
    int shotDelay = 300;
    
    SimpleTimer timer = new SimpleTimer();
    
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
        if (Greenfoot.isKeyDown("space") && timer.millisElapsed() > shotDelay)
        {
            // add an Acorn to the world at the x,y of the Hero
            getWorld().addObject(new Acorn(), getX(), getY());
            timer.mark();
        }
    }
}
