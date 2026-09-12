
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables or characteristics
    private String title;
    private int runTime; // minutes
    private double rating;
    private int releaseYear;
    private String[] stars = new String[3];
    
    /**
     * Constructor for objects of class Movie
     */
    public Movie(String t, int rt, double r, int ry, String[] st)
    {
        title = t;
        runTime = rt;
        rating = r;
        releaseYear = ry;
        stars = st;
    }
    
    public Movie(String t)
    {
        title = t;
    }
    
    public Movie()
    {
        
    }
    
    
    public String getTitle()
    {
        return title;
    }
    
    public double getRating()
    {
        return rating;
    }
    
    public int getReleaseYear()
    {
        return releaseYear;
    }
    
    public String[] getStars()
    {
        return stars;
    }
    
    public void setTitle(String s)
    {
        title = s;    
    }
    
    public void showInfo()
    {
        System.out.println("Title is " + title);
        System.out.println("Release Year is " + releaseYear);
        System.out.println("Runtime is " + runTime);
        System.out.println("Rating is " + rating);
        System.out.print("The stars are ");
        for (int x = 0; x < stars.length; x++)
        {
            System.out.print(stars[x] + " ");
        }
        System.out.println();
    }
}
