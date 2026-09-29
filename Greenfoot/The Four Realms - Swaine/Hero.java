import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int speed = 5;
    
    boolean doneWizard = false;
    boolean doneFalling = false;
    boolean doneTyping = false;
    boolean doneBoss = false;
    
    public void act()
    {
        movement();
        checkWorldBoundaries();
    }
    
    public void movement()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
        else if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }
    }
    
    public void checkWorldBoundaries()
    {
        if (getWorld() instanceof HomeWorld)
        {
            if (getY() > getWorld().getHeight() - 5) // down
            {
                Greenfoot.setWorld(new TypingWorld());
            }
            else if (getY() < 5) // up
            {
                Greenfoot.setWorld(new BossWorld());
            }
            else if (getX() > getWorld().getWidth() - 5) // right
            {
                Greenfoot.setWorld(new FallingWorld());
            }
            else if (getX() < 5) // left
            {
                Greenfoot.setWorld(new WizardWorld());
            }
        }
        
        if (getWorld() instanceof TypingWorld && doneTyping == true)
        {
            if (getY() < 5)
            {
                Greenfoot.setWorld(new HomeWorld());
            }
        }
        if (getWorld() instanceof BossWorld && doneBoss == true)
        {
            if (getY() > getWorld().getHeight() - 5)
            {
                Greenfoot.setWorld(new HomeWorld());
            }    
        }
        if (getWorld() instanceof FallingWorld && doneFalling == true)
        {
            if (getX() < 5)
            {
                Greenfoot.setWorld(new HomeWorld());
            } 
        }
        if (getWorld() instanceof WizardWorld && doneWizard == true)
        {
            if (getX() > getWorld().getWidth() - 5)
            {
                Greenfoot.setWorld(new HomeWorld());
            }    
        }
    }
}
