
public class OOPS5 {

    static class Student {

        String name;
        int roll;
        int password;

        Student(String name, int password, int roll) {
            this.name = name;
            this.password = password;
            this.roll = roll;
        }

        // COPY CONSTRUCTOR
        Student(Student s2) {
            this.name = s2.name;
            this.roll = s2.roll;

        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("kartik", 45455, 1123);

        Student s2 = new Student(s1);
        s2.password = 38628562;

        System.out.println("NAME OF STUDENT S2 IS : " + s2.name);
        System.out.println("ROLL OF STUDENT S2 IS : " + s2.roll);
        System.out.println("PASSWORD OF STUDENT S2 IS : " + s2.password);
        System.out.println("NAME OF STUDENT S1 IS : " + s1.name);
        System.out.println("ROLL OF STUDENT S1 IS : " + s1.roll);
        System.out.println("PASSWORD OF STUDENT S1 IS : " + s1.password);

    }

}
