import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Player> players = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("scorers.txt"));
            String line = br.readLine();
            while (line != null)
            {
                String[] info = line.split(" ");
                
                int rnk = Integer.parseInt(info[0]);
                String frst = info[1];
                String lst = info[2];
                int pts = Integer.parseInt(info[3]);

                players.add(new Player(rnk, frst, lst, pts));
                line = br.readLine();
            }
            br.close();

            // for (Player p:players)
            // {
            // p.showInfo();
            // }

            System.out.println("What do you want to do? ");
            System.out.println("Enter 1 to guess the points of a random player. ");
            System.out.println("Enter 2 to get the information of a specific player. ");
            System.out.println("Enter 0 to quit. ");

            int choice = Integer.parseInt(s.nextLine());

            while (choice != 0)
            {
                if (choice == 1)
                {
                    int max = players.size() - 1;
                    int min = 0;
                    int rn = (int)(Math.random() * ((max - min) + 1)) + min;

                    int target = players.get(rn).getPoints();
                    String fName = players.get(rn).getFName();
                    String lName = players.get(rn).getLName();

                    System.out.println("Your player is " + fName + " " + lName);
                    System.out.print("Guess the number of points: ");
                    int guess = Integer.parseInt(s.nextLine());
                    while (guess != target)
                    {
                        if (guess > target)
                        {
                            System.out.print("Too high - guess again: ");
                        }
                        else 
                        {
                            System.out.print("Too low - guess again: ");
                        }
                        guess = Integer.parseInt(s.nextLine());
                    }
                    System.out.println("You got it!");
                    System.out.println();
                } // end choice 1
                else if (choice == 2)
                {
                    System.out.println("What player do you want to show? Enter first and last name.");
                    String info[] = s.nextLine().split(" ");
                    boolean foundPlayer = false;
                    for (int x = 0; x < players.size(); x++)
                    {
                        if (players.get(x).getFName().matches(info[0]) && players.get(x).getLName().matches(info[1]))
                        {
                            players.get(x).showInfo();
                            foundPlayer = true;
                            break;
                        }
                    }
                    if (!foundPlayer)
                    {
                        System.out.println("Player not found.");
                    }
                } // end choice 2
                System.out.println("What do you want to do? ");
                System.out.println("Enter 1 to guess the points of a random player. ");
                System.out.println("Enter 2 to get the information of a specific player. ");
                System.out.println("Enter 0 to quit. ");
            
                choice = Integer.parseInt(s.nextLine());
            }
        }

        catch (IOException e)
        {
            System.out.println("Something went wrong.");
            System.out.println(e.getMessage());
        }

    }

}
