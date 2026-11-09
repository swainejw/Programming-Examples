import greenfoot.*;

public class Notes extends Actor
{
    // Create sound objects
    GreenfootSound beep = new GreenfootSound("beep.wav");
    GreenfootSound music = new GreenfootSound("background.mp3");

    public void act()
    {
        // Play a one-time sound
        if (Greenfoot.isKeyDown("1"))
        {
            beep.play();
            Greenfoot.delay(5); // prevents rapid repeats
        }

        // Start looping background music
        if (Greenfoot.isKeyDown("2"))
        {
            music.playLoop();
            Greenfoot.delay(10);
        }

        // Stop the looping music
        if (Greenfoot.isKeyDown("3"))
        {
            music.stop();
            Greenfoot.delay(10);
        }
        
        // Pause the looping music
        if (Greenfoot.isKeyDown("4"))
        {
            music.pause();
        }

    }
}
