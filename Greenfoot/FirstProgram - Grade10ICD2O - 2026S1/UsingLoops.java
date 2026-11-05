import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class UsingLoops extends World
{

    public UsingLoops()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        for (int x = 0; x < 15; x++)
        {
            addObject(new Block(), 50+x*10, 50+x*10);
        }
        
        
        
        
        
    }
}
