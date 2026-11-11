import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Condor extends Actor
{
    // give the Condor a SimpleTimer (a stopwatch) called 'timer'
    SimpleTimer timer = new SimpleTimer();
    // set the vertical speed
    int ySpeed = 5;
    
    // determine timings for bullet shoot
    int minDelay = 3000;
    int maxDelay = 12000;
    int randValue = minDelay + Greenfoot.getRandomNumber(maxDelay-minDelay);
    
    public void started()
    {
        timer.mark();
    }
    
    public void act()
    {
        // always move vertically by ySpeed
        setLocation(getX(), getY() - ySpeed);
        
        // if the Condor hits the top or bottom, switch the direction
        // by changing the sign of the ySpeed variable
        if (getY() < 25 || getY() > 375)
        {
            ySpeed *= -1;
        }
        
        // if the timer gets above 1 second
        if (timer.millisElapsed() > randValue)
        {
            // add a BabyBullet to the screen at the x,y of the Condor
            getWorld().addObject(new Feather(), getX(), getY());
            
            // reset the timer to 0
            timer.mark();
            
            // choose a different random value
            randValue = minDelay + Greenfoot.getRandomNumber(maxDelay-minDelay);
        }
    }
}
