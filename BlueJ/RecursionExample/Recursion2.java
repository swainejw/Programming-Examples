
/**
 * Write a description of class Main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion2
{
    /* Assume that n is greater than or equal to 1 */
    static int fun1(int n)
    {
        if (n == 1)
        {
            System.out.print("BASE CASE: Evaluating fun1(" + n + ") ");
            System.out.println("n is 1 so return 0");
            return 0;
        }
        else
        {
            System.out.print(
                "n is " + n +
                ", n/2 is " + (n/2) +
                " ... return is 1 + fun1(" + (n/2) + ") ... "
            );
            System.out.println("Next it will evaluate fun1(" + n/2 + ") ... ");
            

            return 1 + fun1(n / 2);
        }
    }
    
    // Driver code
    public static void main(String[] args)
    {
        System.out.println(fun1(100));
    }
}
