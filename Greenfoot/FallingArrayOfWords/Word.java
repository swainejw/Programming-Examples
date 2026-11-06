import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Word extends Actor
{
    Label l;
    boolean correct;
    
    public Word(String s, boolean b)
    {
        l = new Label(s, 20);
        correct = b;
        setImage(l.getImage());
    }

    public void act()
    {
        setLocation(getX(), getY() + 2);
    }
}
