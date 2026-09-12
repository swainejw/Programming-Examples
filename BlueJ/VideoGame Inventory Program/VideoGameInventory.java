import java.util.ArrayList;
import java.util.Scanner;


public class VideoGameInventory
{
    public static void main(String[] args)
    {
        int choice = 0;
        Scanner s = new Scanner(System.in);
        ArrayList<VideoGame> videoGames = new ArrayList<VideoGame>();
        
        System.out.println("Welcome to the Video Game Inventory Program!");
        showMenu();
        choice = Integer.parseInt(s.nextLine());
        while (choice != 0)
        {
            if (choice == 1) // add
            {
                System.out.println("What is the title?");
                String title = s.nextLine();
                
                System.out.println("What is the year of release? (type -1 if you don't know):");
                int yor = Integer.parseInt(s.nextLine());
                
                if (yor == -1)
                {
                    videoGames.add(new VideoGame(title));
                }
                else
                {
                    videoGames.add(new VideoGame(title, yor));
                }
                
            }
            else if (choice == 2)
            {
                
            }
            else if (choice == 3)
            {
                
            }
            else if (choice == 4)
            {
                
            }
            
            showMenu();
            choice = Integer.parseInt(s.nextLine());
        }
        
        System.out.println("Thanks for using this amazing program.");
        
    }
    
    public static void showMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("Press 1 to add a video game");
        System.out.println("Press 2 to delete a video game");  
        System.out.println("Press 3 to search the inventory");
        System.out.println("Press 4 to show all from the inventory");
        
        System.out.println("Press 0 to quit");
    }
}
