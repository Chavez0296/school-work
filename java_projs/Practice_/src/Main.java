import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select an item:");
        System.out.println("1- Draw a dot");
        System.out.println("2- Draw a line");
        System.out.println("3- Draw a square");
        System.out.println("4- Draw a rectangle");
        System.out.println("5- Draw a right triangle");
        System.out.println("6- Draw an isosceles triangle");
        System.out.println("7. Rectangle pattern");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter number of empty spaces: ");
            int spaces = sc.nextInt();
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");  //draw a dot
            }
            System.out.print("*");
        }
        if (choice == 2) {
            System.out.print("Enter the length: ");
            int line = sc.nextInt();
            for (int i = 0; i < line; i++) {
                System.out.print("*");// write your code here
            }
        }
        if (choice == 3) {
            System.out.print("Enter the length of the side: ");
            int side = sc.nextInt();

            for (int j = 0; j < side; j++) {
                for (int i = 0; i < side; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (choice == 4) {
            System.out.print("Enter the length of the side: ");
            int side = sc.nextInt();
            System.out.println();
            System.out.print("Enter the other side: ");
            int side2 = sc.nextInt();
            for (int j = 0; j < side2; j++) {
                for (int i = 0; i < side; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (choice == 5) {
            System.out.print("Enter the side length: ");
            int side3 = sc.nextInt();

            for (int j = 0; j < side3; j++) {
                for (int i = 0; i <= j; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (choice == 6) {
            System.out.print("Enter the length of the side: ");
            int side4 = sc.nextInt();

            for (int j = 0; j < side4; j++) {
                for (int i = 0; i < side4 - j; i++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < 2*j+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if(choice ==7){
            System.out.print("Enter the amount of rows: ");
            int n = sc.nextInt();
            Rectangle.rectangle(n);
        }



    }
}
