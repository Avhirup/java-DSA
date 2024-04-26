public class Circular_Queue_using_Array {
    static class CQueue {
        int f = -1;
        int r = -1;
        private int size = 0;
        int[] arr;
        CQueue(int size) {
            arr = new int[size];
        }

        int size() {
            return this.size;
        }

        void add(int element) {
            if(size() == arr.length) {
                System.out.println("Queue is full.");
                return;
            }
            if(size() == 0) {
                f = r = 0;
                arr[0] = element;
            } else if (r == arr.length-1) {
                r = 0;
                arr[0] = element;
            }
            else {
                arr[++r] = element;
            }
            size++;
        }

        int remove() throws Exception{
           if(size() == 0) {
               System.out.print("Queue is empty ");
               return Integer.MIN_VALUE;
//               throw new Exception("Queue is Empty.");
           }
           int element = arr[f];
           size--;
           if(f==r) {
               f = r = 0;
           }
           else if(f==arr.length-1) {
               f = 0;
           }
           else {
               f++;
           }
           return element;
        }

        int peek() throws Exception{
            if(size() == 0) {
                System.out.print("Queue is empty ");
                return Integer.MIN_VALUE;
//                throw new Exception("There's no element present in the Queue");
            }
            return arr[f];
        }

        void display() {
            System.out.print("[ ");
            int count = 0;
            int idx = f;
            while(count < size()) {
                if(idx == arr.length) {
                    idx = 0;
                }
                System.out.print(arr[idx++] + " ");
                count++;
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) throws Exception {
        CQueue cq = new CQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        System.out.println("Removed element from the CQueue: " + cq.remove());
        System.out.println("Removed element from the CQueue: " + cq.remove());
        cq.add(6);
        cq.add(7);
        System.out.println("Removed element from the CQueue: " + cq.remove());
        System.out.println("Removed element from the CQueue: " + cq.remove());
        System.out.println("Removed element from the CQueue: " + cq.remove());
//        cq.add(8);
//        cq.add(9);
//        cq.add(10);
        System.out.println("Size of the Circular Queue: " + cq.size());
        System.out.println("In the Circular Queue the front element is " + cq.peek());
        cq.display();
    }
}
