import java.util.Scanner;

public class ForLoops
{
    public static void main(String[] args)
    {
        int x;
        Scanner s = new Scanner(System.in);
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q1");
        System.out.println("=================");
        for (x = 0; x <= 10; x++)
        {
            System.out.println(x);
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q2");
        System.out.println("=================");
        for (x = 10; x >= 0; x--)
        {
            System.out.println(x);
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q3");
        System.out.println("=================");
        for (x = 50; x <= 70; x+=2)
        {
            System.out.println(x);
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q4");
        System.out.println("=================");
        for (x = 44; x <= 62; x+=6)
        {
            System.out.println(x);
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q5");
        System.out.println("=================");
        x = 0;
        while (x < 11)
        {
            System.out.println(x);
            x++;
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q6");
        System.out.println("=================");
        x = 10;
        while (x >= 0)
        {
            System.out.println(x);
            x--;
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q7");
        System.out.println("=================");
        x = 50;
        while (x <= 70)
        {
            System.out.println(x);
            x+=2;
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q8");
        System.out.println("=================");
        x = 44;
        while (x <= 62)
        {
            System.out.println(x);
            x+=6;
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q9");
        System.out.println("=================");
        System.out.println("How many times do you want to print it?");
        int numTimes = Integer.parseInt(s.nextLine());
        for (x = 0; x < numTimes; x++)
        {
            System.out.println("Computers are great.");
        }
        System.out.println();
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q10");
        System.out.println("=================");
        System.out.println("Enter the low number: ");
        int lowNum = Integer.parseInt(s.nextLine());
        System.out.println("Enter the high number: ");
        int highNum = Integer.parseInt(s.nextLine());
        
        int sum = 0;
        double count = 0;
        for (x = lowNum; x <= highNum; x++)
        {
            sum += x;
            count++;
        }
        double avg = sum / count;
        
        System.out.println("The sum from " + lowNum + " to " + highNum + " is " + sum);
        System.out.println("The average is " + avg);
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q11");
        System.out.println("=================");
        for (x = 65; x < 91; x++)
        {
            char letter = (char) x;
            System.out.println(letter);
        }
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q12");
        System.out.println("=================");
        System.out.println("What number would you like to do? ");
        int myNum = s.nextInt();
        for (x = 1; x <= 10; x++)
        {
            System.out.println(myNum + " x " + x + " = " + x*myNum);
        }
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q13a");
        System.out.println("=================");
        System.out.println("What number would you like to find out about?");
        int searchNum = Integer.parseInt(s.nextLine());
        boolean isPrime = true;
        for (int y = 2; y < searchNum; y++)
        {
            if (searchNum % y == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true)
        {
            System.out.println(searchNum + " is prime.");
        }
        else
        {
            System.out.println(searchNum + " is not prime.");
        }
        
        // ++++++++++++++++++++++++++++++++++++++++++++++++++++ //
        System.out.println("Q13b");
        System.out.println("=================");
        System.out.println("What number would you like to search up to?");
        searchNum = Integer.parseInt(s.nextLine());
        isPrime = true;
        for (x = 2; x <= searchNum; x++)
        {
            isPrime = true;
            for (int y = 2; y < x; y++)
            {
                if (x % y == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
            {
                System.out.println(x);
            }
        }
        
    }
}