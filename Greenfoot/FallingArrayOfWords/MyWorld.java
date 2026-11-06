import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer t = new SimpleTimer();
    String[] words = {"Sample1", "Sample2", "Sample3"};
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        if (t.millisElapsed() > 3000)
        {
            for (int x = 0; x < 3; x++)
            {   
                Word w;
                if (x < 2)
                {
                     w = new Word(words[x], false);
                    
                }
                else
                {
                     w = new Word(words[x], true);
                }
                addObject(w, Greenfoot.getRandomNumber(getWidth()), 0);
            }
            
            t.mark();
        }
        
        
    }
}
