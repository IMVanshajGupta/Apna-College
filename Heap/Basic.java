import java.util.*;

public class Basic {
    // priority queue for objects
    static class Student implements Comparable<Student> {// overriding concept
        // here made a class in which we implements the comparable {means we are going
        // to compare students}
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override // here we define on what basis we are going to compare
        public int compareTo(Student s2) {
            return this.rank - s2.rank;

        }
    }

    // ----------------------------------------------------------------------------------------------->
    public static void main(String arg[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(5);
        pq.add(4);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();

        System.out.println("we reverse the priority from {min-first}--> {maxfirst} ");
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(1);
        pq1.add(3);
        pq1.add(2);
        pq1.add(5);
        pq1.add(4);
        while (!pq1.isEmpty()) {
            System.out.print(pq1.peek() + " ");
            pq1.remove();
        }
        System.out.println();

        PriorityQueue<Student> stud = new PriorityQueue<>();
        stud.add(new Student("A", 6));
        stud.add(new Student("b", 3));
        stud.add(new Student("c", 9));
        stud.add(new Student("d", 2));
        stud.add(new Student("e", 1));
        stud.add(new Student("f", 7));

        while (!stud.isEmpty()) {
            System.out.println(stud.peek().name + " ->" + stud.peek().rank);// output is compared on the basis of rank
            stud.remove();
        }
    }
}
