public class Stack {
    private int top;
    private int max = 10;
    int[] arr = new int[max];
    Stack(){
        top = -1; //Account for underflow
    }
    public void push(int x){
        if(top >=(max-1)){
            System.out.println("Stack Overflow! Can't push any value.");
        }
        else{
            arr[++top] = x;
            System.out.println("Value Pushed Successfully.");
        }
    } //Push function
    public int pop(){
        int popped = 0;
        if(top < 0){
            System.out.println("-1");
        }
        else{
            popped = arr[top--];
            System.out.println("Value Popped Successfully.");
        }
        return popped;
    } //Pop function
    public void display() {
       for(int i = top; i >= 0; i--){
           if(!isEmpty()) {
               System.out.print(arr[i] + " ");
           }
       }
    } //Display stack from top to bottom
    public boolean isEmpty(){
        return(top == -1);
    }//Empty stack
}
