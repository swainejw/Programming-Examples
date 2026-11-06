import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Which question do you want to do? ");
        int choice = Integer.parseInt(input.nextLine());

        while (choice < 4 && choice > 0)
        {
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the dividend ");
                    int dividend = Integer.parseInt(input.nextLine());
                    System.out.println("Enter the divisor ");
                    int divisor = Integer.parseInt(input.nextLine());
                    System.out.println("The quotient is " + dividend/divisor);
                    System.out.println("The remainder is " + dividend%divisor);
                    break;
                case 2:
                    System.out.println("Enter the radius ");
                    double rad = Double.parseDouble(input.nextLine());

                    System.out.println("The diameter is " + rad*2);
                    System.out.println("The circumference is " + Math.PI*rad*2);
                    System.out.println("The area is " + Math.PI*rad*rad);
                    break;
                case 3:
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
                    break;
                default:
                    System.out.println("Invalid choice.");
                    
            } // end switch
            System.out.println("Which question do you want to do? ");
            choice = Integer.parseInt(input.nextLine());
        } // end loop
        System.out.println("Good-bye.");
    }
}
