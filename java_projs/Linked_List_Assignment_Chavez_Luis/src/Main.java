import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the values: ");
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            linkedList.push(t);
        }
        System.out.print("List before removing repeating numbers: ");
        linkedList.displayList();
        System.out.println();
        linkedList.deleteDuplicate();
        System.out.print("List after removing repeating numbers: ");
        linkedList.displayList();
        System.out.println();

    }
}
