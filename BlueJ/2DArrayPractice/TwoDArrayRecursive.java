import java.util.Random;

public class TwoDArrayRecursive {

    // Entry method students are asked to write
    public static void sumArr(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Random rand = new Random();

        fillArray(array, rand, 0, 0);
        printArray(array, 0, 0);
        int sum = sumArray(array, 0, 0);

        System.out.println("Sum of all elements: " + sum);
    }

    // Recursively fill the 2D array with random numbers (1–9)
    private static void fillArray(int[][] array, Random rand, int row, int col) {
        if (row == array.length) {
            return; // done
        }

        array[row][col] = rand.nextInt(9) + 1;

        if (col == array[0].length - 1) {
            fillArray(array, rand, row + 1, 0);
        } else {
            fillArray(array, rand, row, col + 1);
        }
    }

    // Recursively print the 2D array
    private static void printArray(int[][] array, int row, int col) {
        if (row == array.length) {
            return;
        }

        System.out.print(array[row][col] + "\t");

        if (col == array[0].length - 1) {
            System.out.println();
            printArray(array, row + 1, 0);
        } else {
            printArray(array, row, col + 1);
        }
    }

    // Recursively calculate the sum
    private static int sumArray(int[][] array, int row, int col) {
        if (row == array.length) {
            return 0;
        }

        if (col == array[0].length - 1) {
            return array[row][col] + sumArray(array, row + 1, 0);
        } else {
            return array[row][col] + sumArray(array, row, col + 1);
        }
    }

    public static void main(String[] args) {
        sumArr(3, 4);
    }
}