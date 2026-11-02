import java.util.Scanner;

public class A1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number.");
        int num = Integer.parseInt(input.nextLine());
        
        if (num % 2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
    }
}
