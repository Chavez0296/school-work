    class Student {
        int id;
        String firstName;
        String lastName;
        String email;
        Student next;

        Student(int id,String fname,String lname,String mail) {
            this.id = id;
            this.firstName = fname;
            this.lastName = lname;
            this.email = mail;
        }
    }
    class StudentsLinkedList {

        Student head;

        public boolean insertStudent(Student s){
            if (this.head == null) {
                this.head = s;
                return true;
            }
            else {
                Student last = this.head;
                while (last.next != null) {
                    if(last.id == s.id){
                        return false;
                    }
                    last = last.next;
                }

                last.next = s;
            }

            return true;
        }


        public boolean deleteStudent(int id){

            Student currNode =this.head ;
            Student prev = null;

            if (currNode != null && currNode.id == id) {
                this.head = currNode.next; // Changed head
                // Return true, after deletion
                return true;
            }

            // If the id is somewhere other than at head

            while (currNode != null && currNode.id != id) {
                // If currNode does not hold key
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
            }
            // If the id was present, it should be at currNode
            // Therefore the currNode shall not be null
            if (currNode != null) {
                // Since the id is at currNode
                // Unlink currNode from linked list
                prev.next = currNode.next;
                return true;
            }
            // id is not present in the linked list
            return false;
        }

        //function to search the student
        public Student search(String info){
            // If the Linked List is empty,
            // return null
            if(this.head == null) {
                return null;
            }
            else {
                Student currNode = this.head;
                while (currNode.next != null) {
                    if(currNode.firstName.equals(info)||
                            currNode.lastName.equals(info)||
                            currNode.email.equals(info)
                    )
                    {
                        return currNode;
                    }
                    currNode = currNode.next;
                }
                if(currNode.firstName.equals(info)||
                        currNode.lastName.equals(info)||
                        currNode.email.equals(info)
                )
                {
                    return currNode;
                }
                return null;
            }
        }

        public void printList()
        {
            Student currNode = this.head;

            System.out.print("\nLinkedList: ");

            // Traverse through the LinkedList
            while (currNode != null) {
                // Print the data at current node
                System.out.print("("+currNode.id +","+currNode.firstName+ ")" +" ---> ");
                // Go to next node
                currNode = currNode.next;
            }

            System.out.println();
        }

    }

    public class Main
    {
        public static void main(String[] args) {

            Student s1 = new Student(1,"Andrew","Cane","cbs@mail");
            Student s2 = new Student(2,"Rey","Jimenez","cst@mail");
            Student s3 = new Student(5,"Alex","Rodriguez","cas.mail");
            Student s4 = new Student(1,"Joe","Rogan","jojorogan@mail");
            Student s5 = new Student(6,"Mojo","Geo","geo@mail");
            Student s6 = new Student(1, "Luis", "Chavez", "luis@gmail.com");

            StudentsLinkedList mylist = new StudentsLinkedList();

            mylist.insertStudent(s1);
            mylist.insertStudent(s2);
            mylist.insertStudent(s3);
            mylist.insertStudent(s4);
            mylist.insertStudent(s5);
            mylist.insertStudent(s6);
            //print linked list
            mylist.printList();


            //search in the linked list and print search result
            Student result_student = mylist.search("Mojo");
            if(result_student!=null)
                System.out.println("\nFOUND STUDENT = "+result_student.id + "," + result_student.firstName + " " + result_student.lastName + ", "+ result_student.email);
            else
                System.out.println("\nNo data found");

            mylist.deleteStudent(5);
            mylist.printList();

        }
}
