
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables
    private int points;
    private String fName;
    private String lName;
    private int rank;

    /**
     * Constructor for objects of class Player
     */
    public Player(int r, String fn, String ln, int p)
    {
        fName = fn;
        lName = ln;
        points = p;
        rank = r;
    }

    /**
     * METHODS
     */
    public int getPoints()
    {
        // put your code here
        return points;
    }
    
    public int getRank()
    {
        // put your code here
        return rank;
    }
    
    public String getFName()
    {
        // put your code here
        return fName;
    }
    
    public String getLName()
    {
        // put your code here
        return lName;
    }
    
    public void showInfo()
    {
        System.out.println(fName + " " + lName + " " + points + " " + rank);
    }
}
