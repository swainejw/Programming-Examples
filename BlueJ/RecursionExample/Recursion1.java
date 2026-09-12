
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion1
{
    // Driver code
    public static void main(String[] args)
    {
        System.out.println(fun1(5, 2)); 
    }
    
    public static int fun1(int x, int y)
    {
        if (x == 0)
        {
            System.out.println("BASE CASE: x is 0, so returning y: " + y);
            return y;
        }
        else
        {
            System.out.print("x is " + x + ", y is " + y + ", x-1 is " + (x-1) + ", x+y is " + (x+y));
            System.out.println(" ... next it will evaluate fun1(" + x + ", " + y + ")");
            return fun1(x - 1, x + y);
        }
    }
    
    
}
