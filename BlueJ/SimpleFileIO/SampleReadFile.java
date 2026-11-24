import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SampleReadFile 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner file = new Scanner(new File("input.txt"));

        int x = 0;
        while (file.hasNextLine()) 
        {
            String line = file.nextLine();
            System.out.println(line);
        }

        file.close();
    }
}