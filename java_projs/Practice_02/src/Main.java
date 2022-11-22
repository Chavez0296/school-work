

    class Student {
        int id;
        String firstName;
        String lastName;
        String email;
        Student next;

        Student(int id, String fname, String lname, String email) {
            this.id = id;
            this.firstName = fname;
            this.lastName = lname;
            this.email = email;
        }
    }

    class LinkedList {

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

        // function to delete the Student
        public boolean deleteStudent(int id){
            Student Node =this.head ;
            Student prev = null;

            //CASE 1:
            if (Node != null && Node.id == id) {
                this.head = Node.next;
                return true;
            }
            // CASE 2:
            while (Node != null && Node.id != id) {
                prev = Node;
                Node = Node.next;
            }
            if (Node != null) {
                prev.next = Node.next;
                return true;
            }
            return false;
        }

        public Student search(String info){
            if (this.head != null) {
                Student Node = this.head;
                while (Node.next != null) {
                    if (Node.firstName.equals(info) ||
                            Node.lastName.equals(info) ||
                            Node.email.equals(info)
                    ) {
                        return Node;
                    }
                    Node = Node.next;
                }
                if (Node.firstName.equals(info) ||
                        Node.lastName.equals(info) ||
                        Node.email.equals(info)
                ) {
                    return Node;
                }
            }
            return null;
        }

        // Method to print the LinkedList.
        public void printList()
        {
            Student Node = this.head;
            System.out.print("\nLinkedList: ");
            while (Node != null) {
                System.out.print(Node.id +")" + Node.firstName + " " + Node.lastName + "  ");
                Node = Node.next;
            }
            System.out.println();
        }

    }

    public class Main
    {
        public static void main(String[] args) {
            Student s1 = new Student(15,"Emanuel","Mahmood","Mahmood12@student.laccd.edu");
            Student s2 = new Student(22,"Bernard","Tucker","Tucker15@student.laccd.edu");
            Student s3 = new Student(15,"Maurice","Smith","Smith34@student.laccd.edu");
            Student s4 = new Student(18,"Antonio","Guzman","Guzman06@student.laccd.edu");
            Student s5 = new Student(30,"Robert","Wagner","Wagner23@student.laccd.edu");

            LinkedList studentList = new LinkedList();

            studentList.insertStudent(s1);
            studentList.insertStudent(s2);
            studentList.insertStudent(s3);
            studentList.insertStudent(s4);
            studentList.insertStudent(s5);

            studentList.printList();

            Student data = studentList.search("Mahmood");
            if(data!=null)
                System.out.println("\nStudent data found ---> ID:"+data.id + "  First Name:" + data.firstName + "  Last Name:" + data.lastName + "  Email:"+ data.email);
            else
                System.out.println("\nNo data found");

            System.out.println("\nLinked List after deletion: ");
            studentList.deleteStudent(30);
            studentList.printList();
        }
    }

