
public class OOPS3 {

    static class Student {

        String name;

        Student(String name) {
            System.out.println("Constructor is called...");
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // CONSTRUCTORS 
        Student s = new Student("kartik");
        System.out.println("A STUDENT NAME IS CREATED WITH NAME PASSED AS: " + s.name);

    }
}
