import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class Wizard extends Actor
{
    String name = "Gandalf the Grey";
    
    Label l = new Label("", 60);
    public static Counter timeShow = new Counter();
    
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();

    public Wizard()
    {
        getImage().scale(100, 100);
        
        questions.add("What is the name of the wizard who guides Frodo on his quest?");
        questions.add("What is the name of Frodo's loyal gardener and best friend?");
        questions.add("What race is Legolas?");
        questions.add("What is the name of the dark lord who created the One Ring?");
        questions.add("In which land does most of The Lord of the Rings begin?");
        questions.add("What is the name of Aragorn's sword that was reforged from Narsil?");
        questions.add("What creature says 'My precious' when referring to the One Ring?");
        questions.add("What is the name of the fiery demon Gandalf fights in Moria?");
        questions.add("Which mountain must the One Ring be destroyed in?");
        questions.add("What city do Aragorn and his allies defend during the Battle of the Pelennor Fields?");
    
        answers.add("Gandalf");
        answers.add("Samwise Gamgee");
        answers.add("Elf");
        answers.add("Sauron");
        answers.add("The Shire");
        answers.add("Anduril");
        answers.add("Gollum");
        answers.add("Balrog");
        answers.add("Mount Doom");
        answers.add("Minas Tirith");
    }
    
    public void act()
    {
        Hero h = (Hero) getOneObjectAtOffset(200, 0, Hero.class);
        timeShow.add(1);
        
        if (h != null && timeShow.getValue() > 80)
        {
            
            int rn = Greenfoot.getRandomNumber(questions.size());
            String q = questions.get(rn);
            String a = answers.get(rn);
            String ua = Greenfoot.ask(q);
            if (ua.matches(a))
            {
                l.setValue("CORRECT");
            }
            else
            {
                l.setValue("INCORRECT");
            }
            
            timeShow.setValue(0);
        }
    }
}
