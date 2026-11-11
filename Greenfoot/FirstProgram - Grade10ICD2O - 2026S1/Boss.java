import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boss extends Actor
{
    // give the Boss a SimpleTimer (a stopwatch) called 'timer'
    SimpleTimer timer = new SimpleTimer();
    // set the vertical speed
    int ySpeed = 15;

    // determine timings for bullet shoot
    int minDelay = 500;
    int maxDelay = 1500;
    int randValue = minDelay + Greenfoot.getRandomNumber(maxDelay-minDelay);

    public Boss()
    {
        getImage().scale(200, 200);
    }

    public void act()
    {
        // always move vertically by ySpeed
        setLocation(getX(), getY() - ySpeed);

        // if the Boss hits the top or bottom, switch the direction
        // by changing the sign of the ySpeed variable
        if (getY() < 25 || getY() > 375)
        {
            ySpeed *= -1;
        }

        // if the timer gets above 1 second
        if (timer.millisElapsed() > randValue)
        {
            // add a BossBullet to the screen at the x,y of the Boss
            getWorld().addObject(new BossBullet(), getX(), getY());

            // reset the timer to 0
            timer.mark();

            // choose a different random value
            randValue = minDelay + Greenfoot.getRandomNumber(maxDelay-minDelay);
        }
    }
}

