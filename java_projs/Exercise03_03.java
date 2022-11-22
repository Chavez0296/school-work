/* Paste your Exercise03_03 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long. */
/*
   author@ luis chavez
   version february 19,2022
*/

import java.util.Scanner;

public class Exercise03_03{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is %.1f and y id %.1f", x, y);
        }

    }
}
/*
command>javac Exercise03_03.java
Compiled successful

command>java Exercise03_03
Enter a, b, c, d, e, f: 9.0
4.0
3.0
-5.0
*/