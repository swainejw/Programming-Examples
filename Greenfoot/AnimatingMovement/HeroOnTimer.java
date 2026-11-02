import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HeroOnTimer extends Actor
{
    // The HeroOnTimer has one of two images available
    GreenfootImage u1 = new GreenfootImage("up1.png");
    GreenfootImage u2 = new GreenfootImage("up2.png");

    // You need a timer, and two variables
    SimpleTimer t = new SimpleTimer();
    int animationDelay = 800;
    int vMove = 3;
    
    public HeroOnTimer()
    {
        // the initial values of the HeroOnTimer
        setImage(u1);
        t.mark();
    }

    public void act() 
    {
        // if the timer value gets above the animationDelay value
        if (t.millisElapsed() > animationDelay)
        {
            // move vertically
            setLocation(getX(), getY() - vMove);
            
            // switch images
            if (getImage() != u2)
            {
                setImage(u2);
            }
            else if (getImage() != u1)
            {
                setImage(u1);
            }
            
            // restart the timer
            t.mark();
        }
    }
} 

