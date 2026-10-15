import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HeroBullet extends Actor
{
    int speed = 15;
    
    public void act()
    {
        setLocation(getX(), getY() - speed);
        
        if (getY() < 5)
        {
            getWorld().removeObject(this);
            return;
        }
        
        DoomMonster dm = (DoomMonster) getOneIntersectingObject(DoomMonster.class);
        if (dm != null)
        {
            dm.health--;
            if (dm.health == 0)
            {
                Globals.h.doneBoss = true;   
                BossWorld.dn.flipImage();
                getWorld().addObject(new Exit(), getWorld().getWidth()/2, getWorld().getHeight() - 25);
                getWorld().removeObject(dm);
            }
            getWorld().removeObject(this);
            return;
        }
    }
}
