public class Warehouse
{
    /**
     * Part (a)
     * Creates a boolean grid indicating which temperatures meet or exceed
     * the given threshold.
     */
    public static boolean[][] aboveThresholdGrid(int[][] temperatures, int threshold)
    {
        boolean[][] result = new boolean[temperatures.length][temperatures[0].length];

        for (int r = 0; r < temperatures.length; r++)
        {
            for (int c = 0; c < temperatures[r].length; c++)
            {
                // the entry of the result array becomes the result of the comparison (T/F)
                result[r][c] = (temperatures[r][c] >= threshold);
            }
        }

        return result;
    }

    /**
     * Part (b)
     * Sorts each row of the grid in ascending order using insertion sort.
     */
    public static void sortRows(int[][] temperatures)
    {
        for (int r = 0; r < temperatures.length; r++)
        {
            // Pass through each row for sorting
            insertionSort(temperatures[r]);
        }
    }

    private static void insertionSort(int[] elements)
    {
        // Code given
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }

    }

    /**
     * Part (c)
     * Recursively returns the maximum value in a single row.
     */
    public static int maxTempInRow(int[] row, int index)
    {
        // If the index is as far as you can go, return that value
        if (index == row.length - 1)
        {
            return row[index];
        }

        int maxOfRest = maxTempInRow(row, index + 1);
        return Math.max(row[index], maxOfRest);
    }

    /**
     * Part (d)
     * Returns the maximum temperature in the entire warehouse.
     */
    public static int maxTemperatureInWarehouse(int[][] temperatures)
    {
        int max = maxTempInRow(temperatures[0], 0);

        for (int r = 1; r < temperatures.length; r++)
        {
            int rowMax = maxTempInRow(temperatures[r], 0);
            if (rowMax > max)
            {
                max = rowMax;
            }
        }

        return max;
    }

    /**
     * Part (e)
     * Determines whether the sensor at (row, col) is a local maximum.
     */
    public static boolean isLocalMaximum(int[][] temperatures, int row, int col)
    {
        // get value in question
        int current = temperatures[row][col];

        /** look at the values in the "square" surrounding the value
         *  
         *  X | X | X
         *  X | O | X
         *  X | X | X
         */
        
        for (int r = row - 1; r <= row + 1; r++)
        {
            for (int c = col - 1; c <= col + 1; c++)
            {
                // Don't check yourself
                if (r == row && c == col)
                    continue;

                // As long as we're still in bounds, compare to adjacent
                if (r >= 0 && r < temperatures.length && c >= 0 && c < temperatures[r].length)
                {
                    // if a higher or equal temp found, return false
                    if (current <= temperatures[r][c])
                    {
                        return false;
                    }
                }
            }
        }

        // if you make it this far, return true because it's a local max
        return true;
    }
}