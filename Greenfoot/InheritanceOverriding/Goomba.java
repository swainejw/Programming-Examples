import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Goomba extends Enemy
{
    GreenfootImage g1 = new GreenfootImage("goomba1.png");
    GreenfootImage g2 = new GreenfootImage("goomba2.png");
    
    SimpleTimer aniT = new SimpleTimer();
    
    final int aniTimeValue = 100;
    
    public Goomba()
    {
        setImage(g1);
        getImage().scale(150, 150);
    }
    
    public void act()
    {
        if (aniT.millisElapsed() > aniTimeValue)
        {
            if (getImage() == g1)
            {
                setImage(g2);
                getImage().scale(150, 150);
            }
            else
            {
                setImage(g1);
                getImage().scale(150, 150);
            }
            aniT.mark();
        }
        
        super.act();
    }
}
