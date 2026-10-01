import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fireball extends Actor
{
    int speed = 5;
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
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
