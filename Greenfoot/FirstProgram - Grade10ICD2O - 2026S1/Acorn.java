import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Acorn extends Actor
{

    public void act()
    {
        // move right by 15 pixels at a time
        setLocation(getX() + 15, getY());
        
        // check to see if the acorn hit an owl
        Owl ow = (Owl) getOneIntersectingObject(Owl.class);
        if (ow != null) // if it DID...
        {
            GameData.score.add(1); // add to the main score
            Greenfoot.playSound("go.wav"); // play a sound
            
            // if you're on level1 and the score is 5, go to level 2
            if (GameData.score.getValue() == 5 && getWorld() instanceof Level1)
            {
                Greenfoot.setWorld(new Level2());
            }
            // remove both the acorn and the owl
            getWorld().removeObject(ow);
            getWorld().removeObject(this);
            return;
        }
        
        // check to see if the acorn hit a condor
        Condor co = (Condor) getOneIntersectingObject(Condor.class);
        if (co != null) // if it DID...
        {
            GameData.score.add(1); // add to the main score
            
            // if you're on level 2 and the score is 15, you win!
            if (GameData.score.getValue() == 15 && getWorld() instanceof Level2)
            {
                Greenfoot.setWorld(new WinWorld());
            }
            // remove both the acorn and the condor
            getWorld().removeObject(co);
            getWorld().removeObject(this);
            return;
        }
        
        // check to see if the block is hit by an acorn
        Block bl = (Block) getOneIntersectingObject(Block.class);
        if (bl != null) // if it DID hit a block...
        {
            getWorld().removeObject(bl); // remove the block
            getWorld().removeObject(this); // remove the acorn
            return;
        }
        
        // check to see if the eagle is hit by an acorn
        Eagle ea = (Eagle) getOneIntersectingObject(Eagle.class);
        if (ea != null) // if it DID...
        {
            // increase the counter by 15
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
