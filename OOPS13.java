
public class OOPS13 {

    static class Animal {

        void Eats() {
            System.out.println("EATS");
        }
    }

    static class Deer extends Animal {

        @Override

        void Eats() {
            System.out.println("EATS GRASS");
        }
    }

    public static void main(String[] args) {

        // POLYMORPHISM (OVERRIDING -> PARENT AND CHILD CLASS BOTH CONTAIN THE SAME FUNCTION WITH DIFFERENT DEFINITION)
        Animal mammal = new Animal();
        mammal.Eats(); // --> function in the animal class is called !

        Deer d = new Deer();
        d.Eats(); // --> function in the deer class is called !

    }
}
