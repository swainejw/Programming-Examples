import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WizardWorld extends World
{
    public static Wizard w = new Wizard();
    int wizPosX = 200;
    int wizPosY = 200;
    public WizardWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(Globals.h, 500, wizPosY);
        addObject(w, wizPosX, wizPosY);
        addObject(w.l, wizPosX, wizPosY - 80);
        addObject(w.timeShow, 50, 20);
    }
}
