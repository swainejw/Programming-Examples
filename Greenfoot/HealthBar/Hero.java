import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5, getY());
        }
        
        Portal p = (Portal) getOneIntersectingObject(Portal.class);
        if (p!=null)
        {
            Greenfoot.setWorld(new MyWorld2());
        }
    }    
}
