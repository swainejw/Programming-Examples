import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Acorn extends Actor
{
    public void act()
    {
        // move right by 15 pixels at a time
        setLocation(getX() + 15, getY());
        
        // check to see if the acorn hit an EvilBaby
        EvilBaby eb = (EvilBaby) getOneIntersectingObject(EvilBaby.class);
        if (eb != null) // if it DID...
        {
            // remove both the acorn and the EvilBaby
            getWorld().removeObject(eb);
            getWorld().removeObject(this);
            return;
        }
        
        // if the x coordinate of the acorn gets above 595, remove it
        if (getX() > 595)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
