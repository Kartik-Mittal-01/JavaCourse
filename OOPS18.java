
public class OOPS18 {

    static class Student {

        String name;
        static String school;            // --> if the school is declared for 1 object of this class the school will remain same for other objects of this class 

        void setname(String name) {
            this.name = name;
        }

        void setschool(String school) {
            this.school = school;
        }

        String getname() {
            return this.name;
        }

        String getschool() {
            return this.school;
        }
    }

    public static void main(String[] args) {

        // STATIC KEYWORDS ( CREATED ONLY ONCE IN A MEMORY)
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setname("kartik");
        s1.setschool("SIS");
        s2.setname("Shubh");
        System.out.println("THE NAME OF THE STUDENT 1 IS: " + s1.getname());
        System.out.println("THE NAME OF THE STUDENT 2 IS: " + s2.getname());
        System.out.println("THE SCHOOL OF " + s1.name + " is : " + s1.getschool());
        System.out.println("THE SCHOOL OF " + s2.name + " is : " + s2.getschool());

    }
}
