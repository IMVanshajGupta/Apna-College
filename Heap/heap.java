import java.util.*;

public class heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // ---------------------------------------------------------------------------------------------------------------------
        // min heap
        // function to add an new element in our heap
        public void add(int data) {
            // first we add it to the last
            arr.add(data);
            int x = arr.size() - 1;// index of child
            int par = (x - 1) / 2;// index of parent

            // set
            while (arr.get(x) < arr.get(par)) {// change {<}-->{>} for changing {min--->max} heap
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // swaping there index if parent child swap
                x = par;
                par = (x - 1) / 2;
            }
        } // tc--->O(logn)
          // --------------------------------------------------------------------------------------------------------------

        public int peek() {
            return arr.get(0);
        }

        // -------------------------------------------------------------------------------------------------------------
        private void heapify(int i) {
            int left = 2 * i + 1;// indexes
            int right = 2 * i + 2;
            int minIndx = i;
            // checking ki left or right me se koi chota toh nahi hai
            // agar koi chota hai toh midIndx ko update kardenge
            // ek chiz yeh bhi ki hum kahi leaf node pr toh nahi hai as uske left right nahi
            // hote
            if (left < arr.size() && arr.get(minIndx) > arr.get(left)) {// change {>}-->{<} for changing {min--->max}
                                                                        // heap
                minIndx = left;
            }
            if (right < arr.size() && arr.get(minIndx) > arr.get(right)) {// change {>}-->{<} for changing {min--->max}
                                                                          // heap
                minIndx = right;
            }
            // agar miljata hai koi chota toh midIndx ki value Update hojaegi
            // means change hojegi
            // hum swap kardenge humare heap ko shi karne ke liyeh
            if (minIndx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndx));
                arr.set(minIndx, temp);
                // heapify ko phirse call kardenge for the root
                heapify(minIndx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // remove last
            arr.remove(arr.size() - 1);

            // fix the heap
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String arg[]) {
        Heap h = new Heap();
        h.add(4);
        h.add(2);
        h.add(8);
        h.add(7);
        h.add(1);
        while (!h.isEmpty()) {
            System.out.println(h.remove());
        }
    }
}
