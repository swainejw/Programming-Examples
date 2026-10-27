import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BabyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyBullet extends Actor
{
    /**
     * Act - do whatever the BabyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - 15, getY());
    }
}
