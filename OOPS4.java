
public class OOPS4 {

    static class Student {

        String name;

        Student(String name) {                                                            // PARAMETERISED CONSTRUCTOR ( constructor1 )
            this.name = name;
        }

        Student() {                                                                       //  NON-PARAMETERISED CONSTRUCTOR ( constructor2 )
            System.out.println("Constructor is called...");
        }
    }

    public static void main(String[] args) {

        // CONSTRUCTORS 
        Student s = new Student("kartik");                                                // constructor 1 is called 
        System.out.println("A STUDENT NAME IS CREATED WITH NAME PASSED AS: " + s.name);

        Student s1 = new Student();                                                       // constuctor 2 is called 
    }
}
