
public class OOPS15 {

    static class Animal {

        // Animal constructor 
        Animal() {
            System.out.println("Animal constructor is called..");
        }
    }

    static class Mammal extends Animal {

        // Mammal constructor 
        Mammal() {
            System.out.println("Mammal constructor is called ..");
        }
    }

    static class Dog extends Mammal {

        // Dog constuctor 
        Dog() {
            System.out.println("Dog constructor is called ..");
        }
    }

    public static void main(String[] args) {

        // CONSTRUCTOR HIERARCHY 
        /*

        when the object of the child is called 
        it first calls its parent constructor and then it's own constructor is called 
        
         */
        Dog dazy = new Dog(); // -> Animal constructor call then Mammal constructor call then Dog constructor call 

    }
}
