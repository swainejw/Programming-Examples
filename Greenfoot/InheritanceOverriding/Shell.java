import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Shell extends Actor
{
    int speed;
    int dir;
    
    public Shell(int sp, int d)
    {
        getImage().scale(20,20);
        speed = sp;
        
        if (d == 0)
        {
            speed *= -1;
        }
    }
    
    public void act()
    {
        setLocation(getX() + speed, getY() + Greenfoot.getRandomNumber(20));
        
        if (getX() > 595)
        {
            getWorld().removeObject(this);
            return;
        }
    }
    
}
