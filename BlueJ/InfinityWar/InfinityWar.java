import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Write a description of class InfinityWar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InfinityWar
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> lines = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("infinityWar.txt"));
        
        String temp = br.readLine();
        while (temp != null && temp.length() > 0)
        {
            if (temp.charAt(0) != '[' && temp.charAt(0) != '(')
            {
                lines.add(temp);
            }
            temp = br.readLine();
        }
        
        
        for (String s:lines)
        {
            System.out.println(s);
        }
    }
}
