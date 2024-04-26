public class Queue_Implementation_Using_Array {
    public static class queue{
        int f = -1;
        int r = -1;
        private int size = 0;
        int[] arr;
        queue(int size) {
            arr = new int[size];
        }
        void add(int element) {
            if(f == -1) {
                r=1;
                arr[++f] = element;
                size++;
                return;
            }
            if(r == arr.length) {
                System.out.println("Queue is full, " + element + " cannot be added.");
                return;
            }
            arr[r++] = element;
            size++;
        }

        int remove() {
            if(f==-1 || f==arr.length) {
                System.out.print("The Queue is already empty ");
                return Integer.MIN_VALUE;
            }
            size--;
            return arr[f++];
        }

        void display() {
            if(f==-1) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("[ ");
            for(int i=f ; i<r ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }

        int peek() {
            if(f==-1 || f==arr.length) {
                System.out.print("The Queue is empty ");
                return Integer.MIN_VALUE;
            }
            return arr[f];
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.print("Original Queue: ");
        q.display();
        System.out.println(q.remove() + " is removed");
        System.out.println(q.remove() + " is removed");
        System.out.println(q.remove() + " is removed");
        System.out.println(q.remove() + " is removed");
        System.out.println(q.remove() + " is removed");
        System.out.println(q.remove());
        q.add(60);
        System.out.println("Current size of the Queue: " + q.size());
        q.display();
    }
}
