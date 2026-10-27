import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EvilBaby extends Actor
{
    SimpleTimer timer = new SimpleTimer();
    
    public void act()
    {
        if (timer.millisElapsed() > 200)
        {
            getWorld().addObject(new BabyBullet(), getX(), getY());
            timer.mark();
        }
    }
}
