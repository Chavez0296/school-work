import java.util.Scanner;
/*
@version 3/27/2022
@author luis chavez
*/
public class Exercise08_11 {

    public static void main(String[] args) {

        int[][] m = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int n = input.nextInt();
        String binary = decimalToBinaryModified(n);

        // put 1's and 0's using binary string
        int bIndex = 0; // binary string index
        for (int i = 0; i < m.length; i++) {

            for (int k = 0; k < m[i].length; k++) {
                int coinSide = (binary.charAt(bIndex++) == '0') ? 0 : 1;
                m[i][k] = coinSide;
            }
        }
        for (int i = 0; i < m.length; i++) {

            for (int k = 0; k < m[i].length; k++) {
                char ch = (m[i][k] == 0) ? 'H' : 'T';
                System.out.print(ch + " ");
            }
            System.out.println("");
        }

    }

    public static String decimalToBinaryModified(int n) {

        StringBuilder s = new StringBuilder();
        while (n != 0) {
            s.append(n & 1);
            n = n >> 1;
        }
        while (s.length() < 9) {
            s.insert(0, "0");
        }
        return s.toString();
    }


}

/*
command>javac Exercise08_11.java
Compiled successful

command>java Exercise08_11
Enter a number between 0 and 511: 7
H H H 
H H H 
T T T 


command>
*/