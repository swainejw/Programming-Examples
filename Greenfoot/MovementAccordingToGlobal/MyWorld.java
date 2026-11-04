import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Fries(), 50, 200);
        addObject(new Fries(), 100, 200);
        addObject(new Fries(), 150, 200);
        addObject(new Fries(), 200, 200);
        addObject(new Fries(), 250, 200);
        addObject(new Fries(), 300, 200);
    }
}
