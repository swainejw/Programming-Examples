import java.util.Random;
import java.util.Scanner;

public class TwoDArrayPractice {

    public static void arrSum(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Random rand = new Random();
        int sum = 0;
        Scanner s = new Scanner(System.in);

        // Fill the array with random integers (1–9)
        for (int r = 0; r < rows; r++) 
        {
            for (int c = 0; c < cols; c++) 
            {
                array[r][c] = rand.nextInt(9) + 1;
                sum += array[r][c];
            }
        }

        // Display the array
        System.out.println("2D Array:");
        for (int r = 0; r < rows; r++) 
        {
            for (int c = 0; c < cols; c++) 
            {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

        // Display the sum
        System.out.println("Sum of all elements: " + sum);
        
        System.out.println("What column do you want? ");
        int col = Integer.parseInt(s.nextLine());
        int colSum = 0;
        for (int r = 0; r < array.length; r++)
        {
            colSum += array[r][col];
        }
        System.out.println("Sum of column " + col + " is " + colSum);
        
        System.out.println("What row do you want? ");
        int row = Integer.parseInt(s.nextLine());
        int rowSum = 0;
        for (int c = 0; c < array[0].length; c++)
        {
            rowSum += array[row][c];
        }
        System.out.println("Sum of row " + row + " is " + rowSum);
    }

    
    public static void main(String[] args) {
        arrSum(3, 4);
    }
}
