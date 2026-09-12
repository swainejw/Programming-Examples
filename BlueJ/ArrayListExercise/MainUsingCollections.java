import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainUsingCollections {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        // Fill ArrayList with 1000 random numbers (0–1,000,000)
        for (int i = 0; i < 1000; i++) 
        {
            int rand = (int)(Math.random() * 1000001);
            numbers.add(rand);
        }

        // Menu
        System.out.println("1 - Print numbers (smallest to largest)");
        System.out.println("2 - Print numbers (largest to smallest)");
        System.out.println("3 - Search for a number");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        // Option 1: Ascending order
        if (choice == 1) 
        {
            ArrayList<Integer> copy = new ArrayList<Integer>(numbers);
            Collections.sort(copy);

            for (int i = 0; i < copy.size(); i++) 
            {
                System.out.println(copy.get(i));
            }
        }

        // Option 2: Descending order
        else if (choice == 2) 
        {
            ArrayList<Integer> copy = new ArrayList<Integer>(numbers);
            Collections.sort(copy);
            Collections.reverse(copy);

            for (int i = 0; i < copy.size(); i++) 
            {
                System.out.println(copy.get(i));
            }
        }

        // Option 3: Search
        else if (choice == 3) 
        {
            System.out.print("Enter a number to search: ");
            int target = input.nextInt();

            int index = numbers.indexOf(target);

            if (index != -1) 
            {
                System.out.println("Found at index: " + index);
            } 
            else 
            {
                System.out.println("Number not found.");
            }
        }

        else 
        {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}