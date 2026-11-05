import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decimal number that is 'a'.");
        double a = Double.parseDouble(input.nextLine());
        
        System.out.println("Enter a 2nd decimal number that is 'b'.");
        double b = Integer.parseInt(input.nextLine());
        
        System.out.println("Enter a 3rd decimal number that is 'c'.");
        double c = Integer.parseInt(input.nextLine());
        
        double disc = b*b - 4*a*c;
        
        if (disc < 0)
        {
            System.out.println("No real roots (no solutions)");
        }
        else if (disc == 0)
        {
            System.out.println("1 real root (1 solution)");
            double ans = -b/(2*a);
            System.out.println("The answer is " + ans);
        }
        else 
        {
            System.out.println("2 real roots (2 solutions)");
            double ans1 = -b + Math.sqrt(b*b - 4*a*c)/(2*a);
            double ans2 = -b - Math.sqrt(b*b - 4*a*c)/(2*a);
            System.out.println("The answers are " + ans1 + " and " + ans2);
        }
        
        
    }
}
