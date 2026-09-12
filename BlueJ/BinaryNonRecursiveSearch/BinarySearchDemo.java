import java.util.Arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {

        // Create an array of 20 integers
        int[] numbers = {
            42, 7, 19, 3, 25,
            8, 31, 14, 2, 50,
            27, 10, 6, 18, 1,
            35, 22, 9, 16, 4
        };

        Arrays.sort(numbers);
        
        // Choose a number to search for
        int target = 999;
        System.out.println("\nSearching for: " + target);

        // Binary Search
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2; // middle index

            System.out.println(
                "Checking index " + mid + " (value " + numbers[mid] + ")"
            );

            if (numbers[mid] == target) {
                found = true;
                System.out.println("Number found at index " + mid);
                break;
            } else if (target < numbers[mid]) {
                high = mid - 1; // search left half
            } else {
                low = mid + 1;  // search right half
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}