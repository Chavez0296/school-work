import java.util.Scanner;

    public class Main {
        public static class Contact {
            String firstname;
            String lastname;
            String phoneNo;

            Contact next;

            public Contact(String firstname, String lastname, String phoneNo) {
                this.firstname = firstname;
                this.lastname = lastname;
                this.phoneNo = phoneNo;
            }

        }

        static class PhonebookLinkedList {

            Contact head;
            public boolean insertContact(Contact s) {
                // If the Linked List is empty,
                // then make the new node as head
                if (this.head == null) {
                    this.head = s;
                    return true;
                } else {
                    // Else traverse till the last node
                    // check if the id already exists
                    // and insert the new_node at last
                    Contact last = this.head;
                    while (last.next != null) {
                        if (last.phoneNo == s.phoneNo) {
                            return false;
                        }
                        last = last.next;
                    }

                    // Insert the new_node at last node after all checks
                    last.next = s;
                }

                // Return the true
                return true;
            }


            // function to delete the Contact
            public boolean deleteContact(String phoneNo) {
                // Store head node
                Contact currNode = this.head;
                Contact prev = null;


                // If head node itself holds the id to be deleted
                if (currNode != null && currNode.phoneNo == phoneNo) {
                    this.head = currNode.next; // Changed head
                    // Return true, after deletion
                    return true;
                }


                // Search for the phoneno to be deleted,
                // keep track of the previous node
                // as it is needed to change currNode.next
                while (currNode != null && currNode.phoneNo != phoneNo) {
                    // If currNode does not hold key
                    // continue to next node
                    prev = currNode;
                    currNode = currNode.next;
                }


                if (currNode != null) {
                    // Since the id is at currNode
                    // Unlink currNode from linked list
                    prev.next = currNode.next;
                    return true;
                }


                return false;
            }


            public Contact search(String info) {

                if (this.head == null) {
                    return null;
                } else {
                    Contact currNode = this.head;
                    while (currNode.next != null) {
                        if (currNode.firstname.equals(info) ||
                                currNode.lastname.equals(info)

                        ) {

                            return currNode;
                        }
                        currNode = currNode.next;
                    }
                    if (currNode.firstname.equals(info) ||
                            currNode.lastname.equals(info)

                    ) {

                        return currNode;
                    }
                    return null;
                }
            }

            public void printList() {
                Contact currNode = this.head;

                System.out.print("\nLinkedList: ");

                // Traverse through the LinkedList
                while (currNode != null) {
                    // Print the data at current node
                    System.out.print("(" + currNode.phoneNo + "," + currNode.firstname + ")" + " ---> ");
                    // Go to next node
                    currNode = currNode.next;
                }

                System.out.println();
            }

        }


        public static void main(String[] args) {
            PhonebookLinkedList mylist = new PhonebookLinkedList();
            int choice;
            String firstname, lastname, phoneNo, searchword;

            Scanner sc = new Scanner(System.in);
            while (true) {
                //Getting the input entered by the user
                System.out.println("\n:: MENU ::");
                System.out.println("1.Add Contact");
                System.out.println("2.Display All Contacts");
                System.out.println("3.Search Contact");
                System.out.println("4.Delete Contact");
                System.out.println("5.Exit");
                System.out.print("Enter Choice :");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter First Name :");
                        firstname = sc.next();
                        System.out.print("Enter Last Name :");
                        lastname = sc.next();
                        System.out.print("Enter Mobile :");
                        phoneNo = sc.next();



                        Contact c = new Contact(firstname, lastname, phoneNo);
                        mylist.insertContact(c);
                        System.out.println("** Contact Added Successfully **");


                        continue;
                    case 2:
                        System.out.println("Displaying all Contacts :");
                        mylist.printList();
                        continue;
                    case 3:
                        System.out.print("Enter Search word :");
                        searchword = sc.next();
                        Contact result_student = mylist.search(searchword);
                        if (result_student != null)
                            System.out.println("\nFOUND CONTACT = " + result_student.phoneNo + "," + result_student.firstname + " " + result_student.lastname);
                        else
                            System.out.println("\nNo data found");

                    case 4:

                        break;
                    default:
                        System.out.println("** Invalid Choice **");
                        continue;
                }
                break;
            }
        }
    }
}

