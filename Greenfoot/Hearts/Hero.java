import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    int health;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 8);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 8);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            MouseInfo mi = Greenfoot.getMouseInfo();
            if (mi != null)
            {
                turnTowards(mi.getX(), mi.getY());
            }
            move(4);
        }
    }
    
    public void loseLife()
    {
        health--;
        if (health == 0)
        {
            Greenfoot.playSound("ohno.wav");
            Greenfoot.setWorld(new LoseWorld());
        }
        
        updateHearts();
    }
    
    public void extraLife()
    {
        health++;
        Greenfoot.playSound("yay.wav");
        updateHearts();
    }
    
    public void updateHearts()
    {
        getWorld().removeObjects(getWorld().getObjects(Heart.class));
        
        for (int x = 0; x < health; x++)
        {
            getWorld().addObject(new Heart(), 40+60*x, 50);
        }
    }
}
