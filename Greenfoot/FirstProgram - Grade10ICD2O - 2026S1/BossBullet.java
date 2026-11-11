import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BossBullet extends Actor
{
    public void act()
    {
        // move to the left by 12 pixels at a time
        setLocation(getX() - 12, getY());
        
         // check to see if the BossBullet hit the Hero
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null) // if it DID...
        {
            h.health--;
            if (h.health == 0)
            {
                getWorld().removeObject(h);
                Greenfoot.setWorld(new LoseWorld());
            }
            // remove both the BossBullet and the Hero
            
            getWorld().removeObject(this);
            return;
        }
        
        Block bl = (Block) getOneIntersectingObject(Block.class);
        if (bl != null) // if it DID...
        {
            // remove both the Block and the BossBullet
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
