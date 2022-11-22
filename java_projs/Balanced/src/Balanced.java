class Balanced{
    public static boolean isBalanced(String exp)    //Function to check
// if parentheses are balanced
    {
        boolean flag = true;
        int count = 0;

        for(int i = 0; i < exp.length(); i++)
        {
            if (exp.charAt(i) == '(')
            {
                count++;
            }
            else
            {
                count--;
            }
            if (count < 0)
            {
                flag = false;
                break;
            }
        }
        if (count != 0)
        {
            flag = false;
        }
        return flag;
    }

    // Driver code
    public static void main(String[] args)
    {
        String array1 = "[ '(', '(', '(', ')', ')', ')']";     //we use String Array1(Character ("[ '(', '(', '(', ')', ')', ')']") of array;)

        if (isBalanced(array1))
            System.out.println("This is unbalanced expression");
        else
            System.out.println("This is correct expression");

        String array2 = "[ '(', ')', '(', ')', ')'] ";  // Testing second expression

        if (isBalanced(array2))
            System.out.println("This is a correct expression");
        else
            System.out.println("This is an unbalanced expression");
    }
}
