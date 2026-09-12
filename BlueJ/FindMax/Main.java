public class Main {
  public static void main(String[] args) {
    	
        int[] numbers = {-12, -45, -89, -89, -23};

        int max = 0;
        
        for (int i = 0; i < numbers.length; i++) 
        {
            if (numbers[i] > max) 
            {
                max = numbers[i];
            }
        }

        System.out.println("The maximum value is: " + max);
        
  }
}
