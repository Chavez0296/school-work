public class Main {

    static class Queue {
        private static int front=0, rear=0, capacity=50;
        private static int queue[]=new int[50];;
        // function to insert an element
        // at the rear of the queue
        void enqueue(int data) {
            // check queue is full or not
            if (capacity == rear) {
                System.out.printf("\nQueue is full\n");
                return;
            }

            // insert element at the rear
            else {
                queue[rear] = data;
                rear++;
            }
            return;
        }

        boolean isEmpty() {
            return (front == rear);
        }



        // function to delete an element
        // from the front of the queue
        void dequeue() {
            // if queue is empty
            if (front == rear) {
                System.out.printf("\nQueue is empty\n");
                return;
            }

            else {
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }

                // store 0 at rear indicating there's no element
                if (rear < capacity)
                    queue[rear] = 0;

                // decrement rear
                rear--;
            }
            return;
        }

        public void display() {
            int i;

            for (i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }


        public static void main(String ar[]) {
            Queue q = new Queue();

            // inserting elements in the queue
            System.out.println(q.isEmpty());
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            q.display();
            q.dequeue();
            q.dequeue();
            q.display();
            System.out.println(q.isEmpty());
        }

}
