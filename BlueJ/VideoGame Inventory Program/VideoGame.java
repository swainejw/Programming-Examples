import java.util.ArrayList;

public class VideoGame
{
    ///////////////////////////////
    // instance variables
    ///////////////////////////////
    private String title;
    private int yearOfRelease;
    private String company;
    private int rating;
    private String genre;
    private ArrayList<String> characters;

    ///////////////////////////////
    // constructors
    ///////////////////////////////
    public VideoGame(String t)
    {
        title = t;
    }
    
    public VideoGame(String t, int y)
    {
        title = t;
        yearOfRelease = y;
    }

    public VideoGame(String t, int y, String c)
    {
        title = t;
        yearOfRelease = y;
        company = c;
    }
    
    ///////////////////////////////
    // methods
    ///////////////////////////////
    public String toString()
    {
        return title + " " + company;
    }
    
    public void showInfo()
    {
        System.out.println(title + ", " + yearOfRelease + ", " + genre);
    }
    
    public void setRating(int r)
    {
        rating = r;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public String getTitle()
    {
        return title;
    }
}
