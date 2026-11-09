import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HBar extends Actor
{
    public HBar()
    {
        // Make a greenfoot image, scale it, give it colour, and fill it in
        GreenfootImage img = getImage();
        img.scale(150,20);
        img.setColor(new Color(0,0,255));
        img.fill();
        setImage(img);
    }
}
