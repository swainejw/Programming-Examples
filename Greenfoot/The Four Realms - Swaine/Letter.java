import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Actor
{
    char ltr;
    int speed = 2;

    public Letter()
    {   
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomIndex = Greenfoot.getRandomNumber(alphabet.length());
        ltr = alphabet.charAt(randomIndex);

        GreenfootImage image = new GreenfootImage("" + ltr, 40, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }

    public void act()
    {
        setLocation(getX(), getY() + 3);
        if (getY() > getWorld().getHeight() - 5)
        {
            getWorld().removeObject(this);
        }
    }
    
    public boolean isThisLetter(char key)
    {
        if (Character.toUpperCase(key) == ltr)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
