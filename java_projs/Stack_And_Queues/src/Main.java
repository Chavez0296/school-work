import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Stack instance = new Stack();

        System.out.println("Please select the menu.");

        boolean var = true;
        while(var) {
            System.out.println("1. Add element to stack(push)");
            System.out.println("2. Remove element from stack(pop)");
            System.out.println("3. Return the min of stack(min)");
            System.out.println("4. Display stack(Top to bottom.");
            System.out.println("5. Quit. ");

            int choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to be pushed: ");
                    data = sc.nextInt();
                    instance.push(data);
                    break;
                case 2:
                    System.out.println("Value popped: " + instance.pop());
                    break;
                case 3:
                    System.out.println(instance.min());
                    break;
                case 4:
                    instance.display();
                case 5:
                    var = false;
                    break;
                default:
                    System.out.println("Please select valid option");
                    break;
            }
        }
    }
}
