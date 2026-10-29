import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BabyBullet extends Actor
{
    public void act()
    {
        
        // move to the left by 15 pixels at a time
        setLocation(getX() - 15, getY());
        
         // check to see if the acorn hit an EvilBaby
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null) // if it DID...
        {
            // remove both the acorn and the EvilBaby
            getWorld().removeObject(h);
            getWorld().removeObject(this);
            return;
        }
        
        // if the x coordinate of the acorn gets above 595, remove it
        if (getX() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
    }

}
