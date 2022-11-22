import java.util.Scanner;
class LinkedList{
    Link head;
    class Link{
        int data;
        Link next;
        Link(int d){
            data = d;
            next = null;
        }
    }
    public void insertFront(int num){
        Link newLink = new Link(num);
        newLink.next = head;
        head = newLink;
    }
    public void insertBack(int num){
        Link newLink = new Link(num);
        if(head == null){
            head = new Link(num);
        }
        else {
            newLink.next = null;
            Link last = head;
            while (last.next != null)
                last = last.next;
            last.next = newLink;

        }
    }
    public int count(){
        Link current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public int sum(){
        Link cur = head;
        int sum = 0;
        while(cur != null){
            sum += cur.data;
            cur = cur.next;
        }
        return sum;
    }
    public void display(){
        Link current = head;
        if(current == null){
            System.out.println("Empty list.");
        }
        else{
            System.out.print("Elements of the list: ");
            while(current != null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        LinkedList list = new LinkedList();
        while(true)
        {
            System.out.println("1.Insert At Front");
            System.out.println("2.Insert At Back");
            System.out.println("3.Display list ");
            System.out.println("4.Count element of list");
            System.out.println("5.Sum elements of list");
            System.out.println("6.Exit");

            int choice;
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the element to push");
                    int n=sc.nextInt();
                    list.insertFront(n);
                    break;
                case 2:System.out.println("Enter the element to push");
                    int n1=sc.nextInt();
                    list.insertBack(n1);
                    break;
                case 3: list.display();
                    break;
                case 4: System.out.print("number of items in the list:"+list.count()+"\n");
                    break;
                case 5:System.out.print("sum of items in the list:"+list.sum()+"\n");
                    break;
                case 6: System.out.println("Exiting the application");
                    System.exit(0);
                default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }

        }
    }
}
