import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Acorn extends Actor
{
    public void act()
    {
        // move right by 15 pixels at a time
        setLocation(getX() + 15, getY());
        
        // check to see if the acorn hit an EvilBaby
        Owl ow = (Owl) getOneIntersectingObject(Owl.class);
        if (ow != null) // if it DID...
        {
            // increase the counter by 1
            MyWorld.score.add(1);
            Greenfoot.playSound("hit.wav");
            if (MyWorld.score.getValue() == 5)
            {
                Greenfoot.setWorld(new WinWorld());
            }
            // remove both the acorn and the EvilBaby
            getWorld().removeObject(ow);
            getWorld().removeObject(this);
            return;
        }
        
        // check to see if the block is hit by an acorn
        Block bl = (Block) getOneIntersectingObject(Block.class);
        if (bl != null) // if it DID...
        {
            getWorld().removeObject(bl);
            getWorld().removeObject(this);
            return;
        }
        
        // check to see if the eagle is hit by an acorn
        Eagle ea = (Eagle) getOneIntersectingObject(Eagle.class);
        if (ea != null) // if it DID...
        {
            // increase the counter by 15
            MyWorld.score.add(15);
            Greenfoot.playSound("hit.wav");
            getWorld().removeObject(ea);
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
