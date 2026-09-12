import java.io.*;
import java.util.ArrayList;

public class TriviaExample
{
    public static void main(String[] args)
    {
        ArrayList<String> bayTriv = new ArrayList<String>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("TriviaQuestions.txt"));
            String currLine = br.readLine();
            while (currLine != null)
            {
                bayTriv.add(currLine);
                currLine = br.readLine();
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Uh oh. Something happened that was not good.");
        }
        
        for (int x = 0; x < bayTriv.size(); x++)
        {
            String[] bayLine = bayTriv.get(x).split(";");
            System.out.println("Category is " + bayLine[0]);
            System.out.println("Question is " + bayLine[1]);
            System.out.println("Answer is " + bayLine[2]);
            System.out.println("Fake Answer 1 is " + bayLine[3]);
            System.out.println("Fake Answer 2 is " + bayLine[4]);
            System.out.println("Fake Answer 3 is " + bayLine[5]);
            
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        }
        
    }
}
