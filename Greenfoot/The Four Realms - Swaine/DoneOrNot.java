import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DoneOrNot extends Actor
{
    GreenfootImage yes = new GreenfootImage("check.png");
    GreenfootImage no = new GreenfootImage("red_x.png");
    
    public DoneOrNot()
    {
        setImage(no);
        getImage().scale(50, 50);
    }
    
    public void flipImage()
    {
        if (getImage() == yes)
        {
            setImage(no);
            getImage().scale(50, 50);
        }
        else if (getImage() == no)
        {
            setImage(yes);
            getImage().scale(50, 50);
        }
    }
    
    public void setYesImage()
    {
        setImage(yes);
    }
    
    public void setNoImage()
    {
        setImage(no);
    }
}
