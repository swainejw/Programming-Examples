import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Acorn extends Actor
{
    public void act()
    {
        setLocation(getX() + 15, getY());
        
        EvilBaby eb = (EvilBaby) getOneIntersectingObject(EvilBaby.class);
        if (eb != null)
        {
            getWorld().removeObject(eb);
            getWorld().removeObject(this);
            return;
        }
        
        if (getX() > 595)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
