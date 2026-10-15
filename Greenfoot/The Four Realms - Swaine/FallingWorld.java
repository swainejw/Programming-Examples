import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FallingWorld extends World
{
    SimpleTimer goodT = new SimpleTimer();
    SimpleTimer evilT = new SimpleTimer();
    int randEvilTimeLimit, randGoodTimeLimit;
    public static DoneOrNot dn = new DoneOrNot();
    
    public FallingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(Globals.h, 300, 350);
        
        addObject(dn, 50, 40);
        
        randEvilTimeLimit = 1000 + Greenfoot.getRandomNumber(2000);
        randGoodTimeLimit = 2000 + Greenfoot.getRandomNumber(3000);
    }
    
    public void act()
    {
        if (goodT.millisElapsed() > randEvilTimeLimit && !Globals.h.doneFalling)
        {
            addObject(new Fries(), Greenfoot.getRandomNumber(getWidth()), 0);
            randEvilTimeLimit = 1000 + Greenfoot.getRandomNumber(2000);
            goodT.mark();
        }
        
        if (evilT.millisElapsed() > randGoodTimeLimit && !Globals.h.doneFalling)
        {
            addObject(new Bomb(), Greenfoot.getRandomNumber(getWidth()), 0);
            randGoodTimeLimit = 1000 + Greenfoot.getRandomNumber(2000);
            evilT.mark();
        }
    }
}
