import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tux extends Actor
{
    int gr = -15;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            gr = -175;
        }
        setLocation(getX() , getY() + gr);
        gr++;
        
        Brick b = (Brick) getOneIntersectingObject(Brick.class);
        if (b != null)
        {
            gr = 0;
        }
    }
}
