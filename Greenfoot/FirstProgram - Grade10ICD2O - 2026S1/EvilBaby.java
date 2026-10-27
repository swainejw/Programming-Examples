import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EvilBaby extends Actor
{
    // give the EvilBaby a SimpleTimer (a stopwatch) called 'timer'
    SimpleTimer timer = new SimpleTimer();
    
    public void act()
    {
        // if the timer gets above 1 second
        if (timer.millisElapsed() > 1000)
        {
            // add a BabyBullet to the screen at the x,y of the EvilBaby
            getWorld().addObject(new BabyBullet(), getX(), getY());
            
            // reset the timer to 0
            timer.mark();
        }
    }
}
