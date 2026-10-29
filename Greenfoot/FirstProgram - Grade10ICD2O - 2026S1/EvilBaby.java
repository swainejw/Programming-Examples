import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EvilBaby extends Actor
{
    // give the EvilBaby a SimpleTimer (a stopwatch) called 'timer'
    SimpleTimer timer = new SimpleTimer();
    // set the vertical speed
    int ySpeed = 5;
    
    public void act()
    {
        // always move vertically by ySpeed
        setLocation(getX(), getY() - ySpeed);
        
        // if the EvilBaby hits the top or bottom, switch the direction
        // by changing the sign of the ySpeed variable
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
