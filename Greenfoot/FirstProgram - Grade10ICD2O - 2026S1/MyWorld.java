import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public static Counter score = new Counter();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        // add the hero and the evil baby to the screen
        addObject(new Hero(), 100, 200);
        
        addObject(new EvilBaby(), 500, 100);
        addObject(new EvilBaby(), 500, 150);
        addObject(new EvilBaby(), 500, 200);
        addObject(new EvilBaby(), 500, 250);
        addObject(new EvilBaby(), 500, 300);
        
        addObject(score, 60, 20);
    }
}
