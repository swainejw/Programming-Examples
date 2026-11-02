import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer number.");
        double num1 = Double.parseDouble(input.nextLine());
        
        System.out.println("Enter an integer number.");
        int num2 = Integer.parseInt(input.nextLine());
        
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
