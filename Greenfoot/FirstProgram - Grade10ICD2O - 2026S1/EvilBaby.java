import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EvilBaby extends Actor
{
    // give the EvilBaby a SimpleTimer (a stopwatch) called 'timer'
    SimpleTimer timer = new SimpleTimer();
    int ySpeed = 5;
    
    public void act()
    {
        setLocation(getX(), getY() - ySpeed);
        
        if (getY() < 25 || getY() > 375)
        {
            ySpeed *= -1;
        }
        
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
