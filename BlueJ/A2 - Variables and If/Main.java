import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the dividend ");
        // int dividend = Integer.parseInt(sc.nextLine());
        // System.out.println("Enter the divisor ");
        // int divisor = Integer.parseInt(sc.nextLine());
        
        // System.out.println("The quotient is " + dividend/divisor);
        // System.out.println("The remainder is " + dividend%divisor);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double rad = Double.parseDouble(sc.nextLine());
        
        System.out.println("The diameter is " + rad*2);
        System.out.println("The circumference is " + Math.PI*rad*2);
        System.out.println("The area is " + Math.PI*rad*rad);
        
    }
}
