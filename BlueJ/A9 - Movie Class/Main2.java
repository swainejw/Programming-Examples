
/**
 * Write a description of class Main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main2
{
    public static void main(String[] args)
    {
        Movie m1 = new Movie("Up");
        Movie m2 = m1;
        Movie m3 = new Movie();
        m3 = m2;
        
        System.out.println(m1.getTitle());
        System.out.println(m2.getTitle());
        System.out.println(m3.getTitle());
        
        
        m1.setTitle("Up 2");
        System.out.println(m1.getTitle());
        System.out.println(m2.getTitle());
        System.out.println(m3.getTitle());
        
    }
}
