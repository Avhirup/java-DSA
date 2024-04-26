package OOPSinJAVA;

import java.util.Arrays;

public class arraylist {
    public static class Arraylist {
        int arr[] = new int[2];
        int idx = 0;
        int size = idx;
        public void add(int elem) {
            if(this.size() == this.arr.length) {
                int newArr[] = Arrays.copyOf(arr, arr.length*2);
                // copy of array by either next two line or from next comment
                arr = new int[newArr.length];
                arr = Arrays.copyOf(newArr, newArr.length);

                // my approach
//                arr = newArr;
            }
            arr[idx++] = elem;
            size = arr.length;
        }
        public int size() {
//            System.out.println(this.size);
            return idx;
        }

        public int get(int idx) {
            if(idx >= this.size)
                return 0;
            return arr[idx];
        }

        public void set(int idx, int val) {
            if(idx>=this.size) {
                int newArr[] = Arrays.copyOf(arr, idx+1);
                arr = newArr;
                size = arr.length;
                arr[idx] = val;
                this.idx=idx+1;
            }
            else {
                arr[idx] = val;
                this.idx = idx+1;
            }
        }

        public void print() {
            System.out.print("[ ");
            for(int i=0 ; i<idx ; i++) {
                if(i==idx-1) {
                    System.out.print(arr[i]);
                }
                else {
                    System.out.print(arr[i] + ", ");
                }
            }
            System.out.print(" ]");
        }

    }

    public static void main(String[] args) {
        Arraylist a1 = new Arraylist();
        a1.add(12);
        a1.add(21);
        a1.add(212);
        a1.add(121);
        a1.add(51215);
        a1.set(7, 700);
        a1.set(8, 800);
        a1.set(10, 1000);
        a1.add(1100);
        a1.set(50, 50000);
        a1.set(51, 51000);
        System.out.println(a1.get(11));
        System.out.println(a1.size());
        a1.print();
    }
}
