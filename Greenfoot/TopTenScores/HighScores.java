import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HighScores extends World
{
    public HighScores()
    {
        super(600, 400, 1); 
        ArrayList<String> lines = new ArrayList<String>();

        try
        {
            // read each line of the file into an ArrayList
            Scanner file = new Scanner(new File("scores.txt"));
            while (file.hasNextLine())
            {
                lines.add(file.nextLine());
            }
            file.close();
        }
        catch(IOException e)
        {
            System.out.println("Something wrong reading file.");
        }

        // Go through the list 10 times, looking for the top score
        for (int place = 1; place <= 10; place++)
        {
            int highestIndex = 0;
            int highestValue = 0;
            
            for (int i = 1; i < lines.size(); i++)
            {
                String[] current = lines.get(i).split(" ");
                int currentScore = Integer.parseInt(current[1]);

                if (currentScore > highestValue)
                {
                    highestIndex = i;
                    highestValue = currentScore;
                }
            }

            System.out.println(lines.get(highestIndex));
            lines.remove(highestIndex);
        }
    }
}

