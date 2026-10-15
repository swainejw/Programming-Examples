import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 4);
        
        if (getY() > getWorld().getHeight() - 5)
        {
            getWorld().removeObject(this);
            return;
        }
        
        Hero h = (Hero) getOneIntersectingObject(Hero.class);
        if (h != null)
        {
            Greenfoot.setWorld(new LoseWorld());
        }
    }
}
