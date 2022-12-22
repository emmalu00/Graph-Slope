/**
* Project3.java
* Emma Lucas
*
* This program takes two (x,y) coordiates, then displays the slope formula
* and graph of the slope based off both coordinates.
*/

import java.util.*;

public class Project3 {
    public static void main (String[] args)
    {
        System.out.println("Welcome to the Graph Program!");
        System.out.println();
        Scanner s = new Scanner(System.in);    
        char response = 'y';

        while (response == 'y')
        {
            System.out.print("Enter x1: ");
            int x1 = Integer.parseInt(s.nextLine());
            System.out.print("Enter y1: ");
            int y1 = Integer.parseInt(s.nextLine());
            System.out.print("Enter x2: ");
            int x2 = Integer.parseInt(s.nextLine());
            System.out.print("Enter y2: ");
            int y2 = Integer.parseInt(s.nextLine());
            boolean samePoints = (x1 == x2 && y1 == y2);
            boolean noSlope = (x1 == x2);
            boolean correctRange = (x1 >= 0 && x1 <= 9 && y1 >= 0 && y1 <= 9 && x2 >= 0 && x2 <= 9 && y1 >= 0 && y2 <= 9);

            while (samePoints || noSlope || !correctRange)
            {
                if (samePoints)
                {
                    System.out.println("Point values must be different");
                }
                else if (noSlope)
                {
                    System.out.println("Line between points must have a slope (i.e. x1 and x2 must differ)");
                }
                else if (!correctRange)
                {
                    System.out.println("All points must be between (0,0) and (9,9).");
                }
                System.out.println();         
                System.out.print("Re-enter x1: ");
                x1 = Integer.parseInt(s.nextLine());
                System.out.print("Re-enter y1: ");
                y1 = Integer.parseInt(s.nextLine());
                System.out.print("Re-enter x2: ");
                x2 = Integer.parseInt(s.nextLine());
                System.out.print("Re-enter y2: ");
                y2 = Integer.parseInt(s.nextLine());
                samePoints = (x1 == x2 && y1 == y2);
                noSlope = (x1 == x2);
                correctRange = (x1 >= 0 && x1 <= 9 && y1 >= 0 && y1 <= 9 && x2 >= 0 && x2 <= 9 && y1 >= 0 && y2 <= 9);
            }

            double slope = (y2-y1)/ (double)(x2-x1);
            double intercept = y1 - (slope*x1);
            System.out.printf("y = %.2fx + %.2f\n", slope, intercept);

            for (int i = 9; i > 0; --i)
            {
                System.out.print(i + "|");
                for (int j = 0; j <= 9; ++j)
                {
                    if ((i == y1 && j == x1) || (i == y2 && j == x2))
                    {
                        System.out.print("*");
                    }
                    else 
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0))
            {
                System.out.print("0 *");
            }
            else
            {
                System.out.print("0 -");
            }
            for (int k = 1; k <= 9; ++k)
            {
                if ((y1 == 0 && x1 == k) || (y2 == 0 && x2 == k))
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print("--");
                }
            }        
            System.out.println();
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            System.out.println();
            
            boolean playAgain = true;
            while (playAgain)
            {
                System.out.print("Run program again? (y/n): ");
                response = s.nextLine().toLowerCase().charAt(0);
                if (response != 'y' && response != 'n')
                {
                    System.out.println("Invalid response.");
                }
                else
                {
                    playAgain = false;
                }
                System.out.println();
            }
        }
    }
}