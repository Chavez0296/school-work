
public class Main {
    class Student
    {
        String firstname;
        String lastname;
        String emailid;
        public Student(String f,String l,String e)
        {
            firstname=f;
            lastname=l;
            emailid=e;
        }
    }

    class Node
    {
        int id;
        Student student;
        Node left, right;

        public Node(int item,String f,String l,String e)
        {
            student=new Student(f,l,e);
            id = item;
            left = right = null;
        }
    }

    Node root;

    Main()
    {
        root = null;
    }


    void insert(int id,String f,String l,String e)
    {
        root = insertRec(root, id,f,l,e);
    }

    Node insertRec(Node root, int id,String f,String l,String e)
    {

        if (root == null)
        {
            root = new Node(id,f,l,e);
            return root;
        }

        if (id < root.id)
            root.left = insertRec(root.left, id,f,l,e);
        else if (id > root.id)
            root.right = insertRec(root.right, id,f,l,e);

        return root;
    }


    Student findRec(Node temp,int id)
    {
        if(temp.id==id)
            return temp.student;
        else if(temp.id>id)
            return findRec(temp.left,id);
        else
            return findRec(temp.right,id);
    }
    Student find(int id)
    {
        return findRec(root,id);
    }



    // Driver Code
    public static void main(String[] args)
    {
        Main tree = new Main();


        tree.insert(101,"Carl","Verse","renoverse@xxa");
        tree.insert(102,"saif","B","saif@xxa");
        tree.insert(100,"shoaib","leri","shoaib@xxa");
        Student s=tree.find(101);
        System.out.println(s.firstname);

    }

}
