import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Movie> myMovies = new ArrayList<Movie>();
        
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.print("Type add, remove, show, search, or quit.");
            
        String choice = s.nextLine();
        while (!choice.matches("quit"))
        {
            if (choice.matches("add"))
            {
                System.out.print("What's the title?");
                String t = s.nextLine();
        
                System.out.print("What's the runtime in minutes?");
                int rt = Integer.parseInt(s.nextLine());
                
                System.out.print("What's the rating?");
                double ra = Double.parseDouble(s.nextLine());
                
                System.out.print("What's the release year?");
                int ry = Integer.parseInt(s.nextLine());
                
                System.out.print("Please enter 3 stars, separated by semi-colons: ");
                String st = s.nextLine();
                String[] stars = st.split(";");
                
                Movie m = new Movie(t, rt, ra, ry, stars);
                myMovies.add(m);
            }
            else if (choice.matches("remove"))
            {
                System.out.print("Which do you want to remove?");
                for (int x = 0; x < myMovies.size(); x++)
                {
                    System.out.print(x + ". " + myMovies.get(x));
                }
                int i = Integer.parseInt(s.nextLine());
                myMovies.remove(i);
            }
            else if (choice.matches("show"))
            {
                System.out.println("Which movie do you want info for?");
                for (int x = 0; x < myMovies.size(); x++)
                {
                    System.out.print(x + ". " + myMovies.get(x));
                }
                int i = Integer.parseInt(s.nextLine());
                myMovies.get(i).showInfo();
            
            }
            else if (choice.matches("search"))
            {
                System.out.print("What do you want to search for?");
                System.out.print("title(t)/release year(y)/rating(r)/star(s)");
                String str = s.nextLine();
                if (str.matches("t"))
                {
                    System.out.print("What title are you looking for?");
                    String title = s.nextLine();
                    for (int x = 0; x < myMovies.size(); x++)
                    {
                        if (myMovies.get(x).getTitle().matches(title))
                        {
                            System.out.println("Found " + title + " at index " + x);
                        }
                    }
                }
                else if (str.matches("y"))
                {
                    System.out.print("What year are you looking for?");
                    int year = Integer.parseInt(s.nextLine());
                    for (int x = 0; x < myMovies.size(); x++)
                    {
                        if (myMovies.get(x).getReleaseYear() ==  year)
                        {
                            System.out.println("Found " + myMovies.get(x).getTitle() + " matching year at index " + x);
                        }
                    }
                }
                else if (str.matches("r"))
                {
                    System.out.print("What rating are you looking to compare to (I'll list all the ratings above and equal to what you put in)?");
                    double rating = Double.parseDouble(s.nextLine());
                    for (int x = 0; x < myMovies.size(); x++)
                    {
                        if (myMovies.get(x).getRating() >= rating)
                        {
                            System.out.println("Found " + myMovies.get(x).getTitle() + " matching year at index " + x);
                        }
                    }
                }
                else if (str.matches("s"))
                {
                    System.out.print("Type a star and I'll list the movies I find that star in.?");
                    String currStar = s.nextLine();
                    for (int x = 0; x < myMovies.size(); x++)
                    {
                        String[]  movStars = myMovies.get(x).getStars();
                        for (int y = 0; x < movStars.length; x++)
                        {
                            if (movStars[y].matches(currStar))
                            {
                                System.out.println(myMovies.get(x).getTitle() + " has " + currStar + " in it.");
                            }
                        }
                    }
                }
                            
            }
            System.out.println("What do you want to do now?");
            System.out.print("Type add, remove, show, search, or quit.");
            
            choice = s.nextLine();
        }
  
        
    }
}
