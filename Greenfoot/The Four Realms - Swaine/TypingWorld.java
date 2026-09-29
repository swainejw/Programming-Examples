import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class TypingWorld extends World
{
    public TypingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Hero(), 300, 350);
    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
    
        if (key != null)
        {
            char typed = key.toUpperCase().charAt(0);
            checkForLetter(typed);
        }
    
        spawnLetters();
    }
    
    private void checkForLetter(char typed)
    {
        List<Letter> letters = getObjects(Letter.class);
    
        for (Letter letter : letters)
        {
            if (letter.isThisLetter(typed))
            {
                removeObject(letter);
                break;
            }
        }
    }
    
    private void spawnLetters()
    {
        if (Greenfoot.getRandomNumber(50) == 0)
        {
            addObject(new Letter(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
}
