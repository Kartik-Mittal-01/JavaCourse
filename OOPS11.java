
public class OOPS11 {

    static class Animal {

        String color;

        void Eats() {
            System.out.println("CAN EAT");
        }
    }

    // ----------------------------------------------
    static class Fish extends Animal {

        int fins;

        void medium() {
            System.out.println("swims");
        }
    }

    // ---------------------------------------------
    static class Mammals extends Animal {

        int legs;

        void medium() {
            System.out.println("walks");
        }
    }

    // ---------------------------------------------
    static class Tuna extends Fish {

        void BloodType() {
            System.out.println("COLD BLOODED");
        }
    }

    // ---------------------------------------------
    static class Shark extends Fish {

        void BloodType() {
            System.out.println("WARM BLOODED");
        }
    }

    // -----------------------------------------------
    static class Dog extends Mammals {

        void Talks() {
            System.out.println("Barks");
        }
    }

    // -----------------------------------------------
    static class Cat extends Mammals {

        void Talks() {
            System.out.println("Meows");
        }
    }

    public static void main(String[] args) {
        //           HYBRID INHERTITANCE 
        //                 ANIMAL
        //                /     \
        //             FISH     MAMMAL
        //            /  \       /  \               
        //         Tuna Shark  Dog Snake 

        System.out.println("----------------------------------");

        Tuna fish1 = new Tuna();
        fish1.color = "brown";
        fish1.fins = 3;
        fish1.Eats();
        fish1.medium();
        fish1.BloodType();
        System.out.println("color of Tuna is: " + fish1.color);
        System.out.println("number of fins of Tuna is: " + fish1.fins);

        System.out.println("----------------------------------");

        Shark fish2 = new Shark();
        fish2.color = "blue";
        fish2.fins = 2;
        fish2.Eats();
        fish2.medium();
        fish2.BloodType();
        System.out.println("color of Shark is: " + fish2.color);
        System.out.println("number of fins of Shark is: " + fish2.fins);

        System.out.println("----------------------------------");

        Dog dazy = new Dog();
        dazy.Eats();
        dazy.Talks();
        dazy.legs = 4;
        dazy.medium();
        dazy.color = "white";
        System.out.println("color of dazy is: " + dazy.color);
        System.out.println("legs of dazy is: " + dazy.legs);

        System.out.println("----------------------------------");

        Cat lada = new Cat();
        lada.Eats();
        lada.Talks();
        lada.legs = 4;
        lada.medium();
        lada.color = "cream";
        System.out.println("color of lada is: " + lada.color);
        System.out.println("legs of lada is: " + lada.legs);

        System.out.println("----------------------------------");

    }
}
