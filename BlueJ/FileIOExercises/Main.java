
import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        // Scanner s = new Scanner(System.in);

        // // //#3
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("oneword.txt"));
            String currLine = br.readLine();
            br.close();
            System.out.println(currLine);
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong.");
        }

        // // #4
        // System.out.println("What is your name?");
        // String name = s.nextLine();
        // try
        // {
            // BufferedWriter bw = new BufferedWriter(new FileWriter("usernames.txt", true));
            // bw.write(name + "\n");
            // bw.close();
        // }

        // catch (IOException e)
        // {
            // //JOptionPane.showMessageDialog(new JInternalFrame(), "No file by that name.");
        // }

        // //#5
        // String[] myWords = new String[10];
        // int x = 0;
             
        // try
        // {
            // BufferedReader br = new BufferedReader(new FileReader("tenwords.txt"));
            // String line = br.readLine();
            // while (line != null)
            // {
                // myWords[x] = line;
                // x++;
                // line = br.readLine();
            // }
            // br.close();
        // }
        // catch (IOException e)
        // {
            // //JOptionPane.showMessageDialog(new JInternalFrame(), "No file by that name.");
        // }
        
        // for (int y = myWords.length - 1; y >= 0; y--)
        // {
            // System.out.println(myWords[y]);
        // }

        // #6
        // try
        // {
        // BufferedReader br = new BufferedReader(new FileReader("password.txt"));
        // String pWord = br.readLine();
        // br.close();

        // System.out.println("What is the password?");
        // String uWord = s.nextLine();
        // int count = 1;

        // while (uWord.compareTo(pWord) != 0)
        // {
        // System.out.println("Nope.  Try again!");
        // uWord = s.nextLine();
        // count++;
        // }

        // System.out.println("It took you " + count + " times to get the password right.");

        // }

        // catch (IOException e)
        // {
        // JOptionPane.showMessageDialog(new JInternalFrame(), "No file by that name.");
        // }

        // #7
        // try
        // {
        // BufferedWriter bw = new BufferedWriter(new FileWriter("multiples.txt"));
        // using a for loop
        // for (int i = 12; i <= 24000; i += 12)
        // {
        // bw.write(i + "\n");
        // }

        // // using a while loop
        // int x = 12;
        // while (x <= 24000)
        // {
        // bw.write(x + "\n");
        // x += 12;
        // }

        // CHALLENGE
        // System.out.println("What number do you want 2000 multiples of?");
        // int num = Integer.valueOf(s.nextLine());
        // using a while loop
        // for (int j = 1; j <= 2000; j++)
        // {
        // bw.write(num*j + "\n");
        // }

        // bw.close();
        // }

        // catch (IOException e)
        // {
        // JOptionPane.showMessageDialog(new JInternalFrame(), "No file by that name.");
        // }

        // #8
        // try
        // {
            // System.out.println("What word do you want to search for?");
            // String targetWord = s.nextLine();
        
            // BufferedReader br = new BufferedReader(new FileReader("flanders.txt"));
            // String currLine = br.readLine();
            // int lineNumber = 1;
            // int count = 0;
            // while (currLine != null)
            // {
                // String[] arr = currLine.split(" ");
                // for (String w : arr)
                // {
                    // if (w.compareToIgnoreCase(targetWord) == 0)
                    // {
                        // count++;
                        // System.out.println(targetWord + " found on line " + lineNumber);
                    // }
                // }
                // currLine = br.readLine();
                // lineNumber++;
            // }
            // br.close(); 
            // System.out.println("The word " + targetWord + " was found " + count + " times.");
        // }
        // catch (IOException e)
        // {}

        // // #9
        // try
        // {
            // System.out.println("Input the first name: ");
            // String fname = s.nextLine();
            
            // System.out.println("Input the last name: ");
            // String lname = s.nextLine();
            
            // BufferedReader br = new BufferedReader(new FileReader("scorers.txt"));
            // String currLine = br.readLine();
            // boolean isFound = false;
            
            // while (currLine != null)
            // {
                // String[] arr = currLine.split(" ");
                // if ( (arr[1].compareToIgnoreCase(fname) == 0) && (arr[2].compareToIgnoreCase(lname) == 0) )
                // {
                    // System.out.println(fname + " " + lname + " was found. He had " + arr[3] + " points.");
                    // isFound = true;
                    // break;
                // }
                
                // currLine = br.readLine();
            // }
            // br.close(); 
            
            // if (!isFound)
            // {
                // System.out.println(fname + " " + lname + " was not found.");               
            // }
        // }
        // catch (IOException e)
        // {}
        
        // #10
        // try
        // {
            // System.out.println("Welcome to NHL Guessing Game!  What is your name?");
            // String userName = s.nextLine();
            // System.out.println("Hi " + userName + ", thanks for coming to play!");
           
            // String[] arrScorers = new String[100];
            // BufferedReader br = new BufferedReader(new FileReader("scorers.txt"));
            
            // String currLine = br.readLine();
            // int x = 0;
            // while (currLine != null)
            // {
                // arrScorers[x] = currLine;
                // currLine = br.readLine();
                // x++;
            // }
            // br.close(); 
            
            // int userGuess = 0;
            // int count = 0;
            // while (userGuess != -1)
            // {
                // int rn = (int) (Math.random() * 100);
                // String hp = arrScorers[rn];
                // String[] vals = hp.split(" ");
                
                // String fname = vals[1];
                // String lname = vals[2];
                // int points = Integer.valueOf(vals[3]);
                
                // System.out.println("How many points did " + fname + " " + lname + " have?");
                // userGuess = Integer.valueOf(s.nextLine());
                // count++;
                
                // int difference = Math.abs(points - userGuess);
                // System.out.println("You were off by " + difference + ".");
            // }
            
            // BufferedWriter bw = new BufferedWriter(new FileWriter("players.txt", true));
            // bw.write(userName + " - " + (count - 1) + "\n");
            // bw.close();
        // }
        // catch (IOException e)
        // {}
    }
}
