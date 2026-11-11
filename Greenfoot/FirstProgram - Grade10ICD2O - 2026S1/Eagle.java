import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurnTowardsAndMove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eagle extends Actor
{
    int x, y;
    boolean gotCoords = false;
    
    public Eagle()
    {
        gotCoords = false;
    }
    public void act()
    {
        if (!gotCoords)
        {
            gotCoords = true;
            turnTowards(GameData.h.getX(),GameData.h.getY());
        }
        move(3);
        
        if (getX() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
