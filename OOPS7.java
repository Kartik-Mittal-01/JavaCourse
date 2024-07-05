
public class OOPS7 {

    // CONCEPT OF SHALLOW COPY 
    static class Student {

        String name;
        int roll;
        int password;
        int marks[];

        Student(String name, int password, int roll, int marks[]) {
            this.name = name;
            this.password = password;
            this.roll = roll;
            this.marks = marks;
        }

        // COPY CONSTRUCTOR
        Student(Student s2) {
            this.name = s2.name;
            this.roll = s2.roll;
            marks = new int[s2.marks.length];
            for (int i = 0; i < s2.marks.length; i++) {  // -> This is called Deep Copy ( changes in the marks of s2 are not also reflected in s1)
                this.marks[i] = s2.marks[i];

            }

        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("kartik", 45455, 1123, new int[3]);
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);
        s2.password = 38628562;

        System.out.println("NAME OF STUDENT S2 IS : " + s2.name);
        System.out.println("ROLL OF STUDENT S2 IS : " + s2.roll);
        System.out.println("PASSWORD OF STUDENT S2 IS : " + s2.password);
        System.out.println("NAME OF STUDENT S1 IS : " + s1.name);
        System.out.println("ROLL OF STUDENT S1 IS : " + s1.roll);
        System.out.println("PASSWORD OF STUDENT S1 IS : " + s1.password);

        System.out.println("MARKS OF s2");
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i] + " ");
        }
        System.out.println();

        // CHANGING MARKS OF s1 
        s1.marks[0] = 85;
        s1.marks[1] = 95;
        s1.marks[2] = 99;

        System.out.println("MARKS OF s2 AFTER MARKS OF s1 ARE CHANGED");

        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i] + " ");
        }

    }

}
