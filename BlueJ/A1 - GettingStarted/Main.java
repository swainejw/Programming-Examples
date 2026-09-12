import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        // 1
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Hello World!");
        
        // 2
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("What's your name?");
        String name = s.nextLine();
        System.out.println("Hello " + name);
        
        // 3
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Please enter integer 1");
        int n1 = Integer.parseInt(s.nextLine());
        System.out.println("Please enter integer 2");
        int n2 = Integer.parseInt(s.nextLine());
        System.out.println("The total is " + (n1 + n2));
        System.out.println("The difference is " + (n1 - n2));
        System.out.println("The product is " + (n1 * n2));
        
        // 4
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Please enter integer 1");
        int num1 = Integer.parseInt(s.nextLine());
        System.out.println("Please enter integer 2");
        int num2 = Integer.parseInt(s.nextLine());
        System.out.println("Please enter integer 3");
        int num3 = Integer.parseInt(s.nextLine());
        System.out.println("The average is " + (num1 + num2 + num3)/3.0);
        int numMax = Math.max(num1, num2);
        numMax = Math.max(numMax, num3);
        System.out.println("The maximum is " + numMax);
        
        // 5
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        int target = 39;
        System.out.println("Guess a number between 0 and 100");
        int guess = Integer.parseInt(s.nextLine());
        int numGuesses = 0;
        
        while (guess != target && numGuesses < 10)
        {
            if (Math.abs(guess - target) < 2)
            {
                System.out.println("BOILING");
            }
            else if (Math.abs(guess - target) < 5)
            {
                System.out.println("HOT");
            }
            else if (guess < target)
            {
                System.out.println("higher");
            }
            else if (guess > target)
            {
                System.out.println("lower");
            }
            
            System.out.print("Please enter your guess: ");
            guess = Integer.parseInt(s.nextLine());            
            numGuesses++;
        }
        
        if (numGuesses == 10 && guess != target)
        {
            System.out.println("You lose");
        }
        else
        {
            System.out.println("YOU WIN!!!");
        }
    }
}
