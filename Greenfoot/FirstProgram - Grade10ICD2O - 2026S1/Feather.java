import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Feather extends Actor
{
    public void act()
    {
        // move to the left by 9 pixels at a time
        setLocation(getX() - 9, getY());
        
         // check to see if the Feather hit the Hero
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null) // if it DID...
        {
            // remove both the Feather and the Hero
            getWorld().removeObject(h);
            getWorld().removeObject(this);
            return;
        }
        
        Block bl = (Block) getOneIntersectingObject(Block.class);
        if (bl != null) // if it DID...
        {
            // remove both the Block and the Feather
            getWorld().removeObject(bl);
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
