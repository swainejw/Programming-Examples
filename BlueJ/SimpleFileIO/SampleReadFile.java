import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SampleReadFile 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner file = new Scanner(new File("DATA11.txt"));

        while (file.hasNextLine()) 
        {
            // read the lines - shift value first
            int shift = Integer.parseInt(file.nextLine());
            // encryted word second
            String line = file.nextLine();
            // below the word up into an array of letters
            char[] chars = line.toCharArray();
            
            System.out.print(line + " ... ");
            
            for (int z = 0; z < chars.length; z++)
            {
                // get the numeric value for the char
                int ascVal = (int) chars[z];
                
                // subtract by the shift value, but loop to 122 at 97
                for (int s = 0; s < shift; s++)
                {
                    ascVal--;
                    if (ascVal < 97)
                    {
                        ascVal = 122;
                    }
                }
                
                // print the char version of the numeric value
                System.out.print((char) ascVal);
            }
            
            System.out.println();
        }

        file.close();
    }
}