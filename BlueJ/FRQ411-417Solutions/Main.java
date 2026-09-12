public class Main
{
    public static void main(String[] args)
    {
        int[][] temperatures = {
            {18, 21, 19, 22, 20, 17},
            {16, 25, 24, 23, 21, 19},
            {14, 17, 20, 18, 16, 15},
            {13, 15, 14, 12, 11, 10}
        };

        // Display threshold grid (threshold = 20)
        boolean[][] thresholdGrid = Warehouse.aboveThresholdGrid(temperatures, 20);
        System.out.println("Above Threshold Grid (≥ 20):");
        for (int r = 0; r < thresholdGrid.length; r++)
        {
            for (int c = 0; c < thresholdGrid[r].length; c++)
            {
                System.out.print(thresholdGrid[r][c] + " ");
            }
            System.out.println();
        }

        // Display maximum temperature in warehouse
        int maxTemp = Warehouse.maxTemperatureInWarehouse(temperatures);
        System.out.println("Maximum Temperature in Warehouse: " + maxTemp);

        // Check for local maximum at (1, 1)
        boolean isLocalMax = Warehouse.isLocalMaximum(temperatures, 1, 1);
        System.out.println("Sensor at (1, 1) is a local maximum: " + isLocalMax);
    }
}