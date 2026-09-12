import java.util.ArrayList;
import java.util.Scanner;

public class MainNoCollections {
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

        // Option 1: Ascending
        if (choice == 1) 
        {
            ArrayList<Integer> copy = new ArrayList<Integer>(numbers);

            // Simple selection sort (ascending)
            for (int i = 0; i < copy.size(); i++) 
            {
                int minIndex = i;

                for (int j = i + 1; j < copy.size(); j++) 
                {
                    if (copy.get(j) < copy.get(minIndex)) 
                    {
                        minIndex = j;
                    }
                }

                // Swap
                int temp = copy.get(i);
                copy.set(i, copy.get(minIndex));
                copy.set(minIndex, temp);
            }

            // Print
            for (int i = 0; i < copy.size(); i++) 
            {
                System.out.println(copy.get(i));
            }
        }

        // Option 2: Descending
        else if (choice == 2) 
        {
            ArrayList<Integer> copy = new ArrayList<Integer>(numbers);

            // Simple selection sort (descending)
            for (int i = 0; i < copy.size(); i++) 
            {
                int maxIndex = i;

                for (int j = i + 1; j < copy.size(); j++) 
                {
                    if (copy.get(j) > copy.get(maxIndex)) 
                    {
                        maxIndex = j;
                    }
                }

                // Swap
                int temp = copy.get(i);
                copy.set(i, copy.get(maxIndex));
                copy.set(maxIndex, temp);
            }

            // Print
            for (int i = 0; i < copy.size(); i++) 
            {
                System.out.println(copy.get(i));
            }
        }

        // Option 3: Search
        else if (choice == 3) {
            System.out.print("Enter a number to search: ");
            int target = input.nextInt();

            int index = -1;

            for (int i = 0; i < numbers.size(); i++) 
            {
                if (numbers.get(i) == target) 
                {
                    index = i;
                    break;
                }
            }

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