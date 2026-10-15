import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

public class Wizard extends Actor
{
    String name = "Gandalf the Grey";
    
    Label l = new Label("", 20);
    public static Counter timeShow = new Counter();
    
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String[]> answers = new ArrayList<String[]>();

    public Wizard()
    {
        getImage().scale(100, 100);
        
        try 
        {
            Scanner inputQ = new Scanner(new File("questions.txt"));
            while (inputQ.hasNextLine())
            {
                questions.add(inputQ.nextLine());
            }
            inputQ.close();
        
            Scanner inputA = new Scanner(new File("answers.txt"));
            while (inputA.hasNextLine())
            {
                answers.add(inputA.nextLine().split(";"));
            }
            inputA.close();
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong with reading Q/A files.");
        }
    }
    
    public void act()
    {
        Hero h = (Hero) getOneObjectAtOffset(200, 0, Hero.class);
        timeShow.add(1);
        
        if (h != null && timeShow.getValue() > 80 && !h.doneWizard)
        {
            // Pick random question and get corresponding answer and 
            // possible answers
            int rn = Greenfoot.getRandomNumber(questions.size());
            String question = questions.get(rn);
            String[] options = answers.get(rn);
            
            // Correct answer BEFORE shuffling
            String correctAnswer = options[0];
            // Copy to an ArrayList so we can easily SHUFFLE
            ArrayList<String> shuffled = new ArrayList<String>();
            for (String s : options)
            {
                shuffled.add(s);
            }
            // Use the built-in shuffle feature in the Collections library
            Collections.shuffle(shuffled);
            // Find the index of the correct answer
            int correctIndex = shuffled.indexOf(correctAnswer);
            
            // Formatting
            int x = 1;
            String a = "\nChoose from:\n";
            for (String s : shuffled)
            {
                a += x + ". " + s + "\n";
                x++;
            }
            
            String wizardQuestion = question + a;
            String[] possibleAnswers = answers.get(rn);
            String ua = Greenfoot.ask(wizardQuestion);
            
            // Check and display
            l.setValue("");
            if (ua.equals("" + (correctIndex + 1)))
            {
                l.setValue("CORRECT!!!");
                Globals.h.wizCorrect++;
                if (Globals.h.wizCorrect == 1)
                {
                    WizardWorld.dn.flipImage();
                    Globals.h.doneWizard = true;
                    getWorld().addObject(new Exit(), getWorld().getWidth() - 40, getWorld().getHeight()/2);
                }
            }
            else
            {
                l.setValue("INCORRECT! Answer was " + correctAnswer);
            }
            
            questions.remove(rn);
            answers.remove(rn);
            
            timeShow.setValue(0);
        }
    }
}
