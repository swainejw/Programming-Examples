import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //9
        double[][] aDubs = new double[5][4];

        for (int x = 0; x < aDubs.length; x++)
        {
            for (int y = 0; y < aDubs[x].length; y++)
            {
                aDubs[x][y] = 4*x+y;
            }
        }

        for (int x = 0; x < aDubs.length; x++)
        {
            for (int y = 0; y < aDubs[x].length; y++)
            {
                System.out.print(aDubs[x][y] + " ");
            }
            System.out.println();
        }
        
        //8
        // char[][] achrLetters = new char[2][4];

        // for (int x = 0; x < achrLetters.length; x++)
        // {
            // for (int y = 0; y < achrLetters[x].length; y++)
            // {
                // achrLetters[x][y] = 'X';
            // }
        // }

        // for (int x = 0; x < achrLetters.length; x++)
        // {
            // for (int y = 0; y < achrLetters[x].length; y++)
            // {
                // System.out.print(achrLetters[x][y]);
            // }
            // System.out.println();
        // }

        //7
        // Integer[] aNums2 = new Integer[10];

        // for (int x = 0; x < aNums2.length; x++)
        // {
        // aNums2[x] = 100-10*x;
        // }

        // for (int x = 0; x < aNums2.length; x++)
        // {
        // System.out.println(aNums2[x]);        
        // }

        //6
        // Integer[] aNums1 = new Integer[8];

        // for (int x = 0; x < aNums1.length; x++)
        // {
        // aNums1[x] = 9*(x+1);
        // }

        // for (int x = 0; x < aNums1.length; x++)
        // {
        // System.out.println(aNums1[x]);        
        // }

        // 5
        // double[] aDecs = new double[5];

        // for (int x = 0; x < aDecs.length; x++)
        // {
        // aDecs[x] = x/2.0;
        // }

        // for (int x = 0; x < aDecs.length; x++)
        // {
        // System.out.println(aDecs[x]);        
        // }

        //4
        // int[] aMyIntsAgain = new int[20];

        // for (int x = 0; x < aMyIntsAgain.length; x++)
        // {
        // aMyIntsAgain[x] = x;
        // }

        // for (int x = 0; x < aMyIntsAgain.length; x++)
        // {
        // System.out.println(aMyIntsAgain[x]);        
        // }

        //3
        // int[] aMyInts = new int[20];

        // for (int x = 0; x < aMyInts.length; x++)
        // {
        // aMyInts[x] = 88;
        // }

        // for (int x = 0; x < aMyInts.length; x++)
        // {
        // System.out.println(aMyInts[x]);        
        // }

        //2
        // String[] aWords = new String[5];

        // aWords[0] = "whatever1";
        // aWords[1] = "whatever2";
        // aWords[2] = "whatever3";
        // aWords[3] = "whatever4";
        // aWords[4] = "whatever5";

        // for (int x = 0; x < aWords.length; x++)
        // {
        // System.out.println(aWords[x]);        
        // }

    }
}
