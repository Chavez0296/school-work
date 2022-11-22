

public class LinkedList{
    Link head; //Initialize head of linked list
    class Link{
        int data; //Link Class
        Link next;
        Link(int d){
            data = d;    //Link constructor
            next = null;
        }
        public void displayLink(){
            System.out.print("{"+data+"}");
        }
    }
    public void push(int new_Data){ //Add to linked list
        Link newLink = new Link(new_Data);
        newLink.next = head;
        head = newLink;
    }
    void displayList(){ //Print linked list
        Link current = head;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
    void deleteDuplicate(){
        Link current = head;
        while(current != null){
            Link temp = current;
            while(temp != null && temp.data == current.data){
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

}
