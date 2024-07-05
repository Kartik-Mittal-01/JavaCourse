
import java.util.PriorityQueue;

public class Heaps2 {

    static class Student implements Comparable<Student> {

        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {             // sort the student object in ascending order acc to their rank
            return this.rank - s2.rank;                //       (student with smaller rank has more priority)
        }
    }

    public static void main(String[] args) {

        // PRIORITY QUEUE FOR OBJECTS!
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("kartik", 1));
        pq.add(new Student("vansh", 2));
        pq.add(new Student("pushkar", 30));
        pq.add(new Student("shubh", 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + ": " + pq.peek().rank);
            pq.remove();
        }

    }
}
