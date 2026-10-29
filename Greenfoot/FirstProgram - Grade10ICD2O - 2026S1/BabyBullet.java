import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BabyBullet extends Actor
{
    public void act()
    {
        
        // move to the left by 15 pixels at a time
        setLocation(getX() - 15, getY());
        
         // check to see if the BabyBullet hit the Hero
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null) // if it DID...
        {
            // remove both the BabyBullet and the Hero
            getWorld().removeObject(h);
            getWorld().removeObject(this);
            return;
        }
        
        // if the x coordinate of the acorn gets below 5, remove it
        if (getX() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
    }

}
