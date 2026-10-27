import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class MyWorld extends World
{
    SimpleTimer kt = new SimpleTimer();
    
    ArrayList<Enemy> arrEn = new ArrayList<Enemy>();
    
    public MyWorld()
    {    
        super(750, 400, 1, false); 
        arrEn.add(new Goomba());
        arrEn.add(new KoopaTroopa());
        arrEn.add(new Bowser());
        arrEn.add(new Waluigi());
    }
    
    public void act()
    {
        if (kt.millisElapsed() > 1800)
        {
            int rn = Greenfoot.getRandomNumber(arrEn.size());
            int yOffset = -100 + Greenfoot.getRandomNumber(100);
            addObject(arrEn.get(rn), 700, getHeight() / 2 + yOffset);
            
            kt.mark();
        }
    }
}
