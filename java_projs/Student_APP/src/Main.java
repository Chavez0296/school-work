import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CS136 student app.");
        System.out.print("Enter student's first name: ");
        String fname = sc.nextLine();

        System.out.print("Enter student's last name: ");
        String lname = sc.nextLine();

        System.out.print("Enter student's ID: ");
        String id = sc.nextLine();

        System.out.println("Enter address info: ");
        System.out.print("Address 1: ");
        String add1 = sc.nextLine();

        System.out.print("Address 2: ");
        String add2 = sc.nextLine();

        System.out.print("City: ");
        String add3 = sc.nextLine();

        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Zipcode: ");
        String zipcode = sc.nextLine();

        Address add = new Address(add1, add2, add3, state,zipcode);
        Student st = new Student(fname, lname, id, add);

        System.out.print(st.getStudentInfo());
    }


}
