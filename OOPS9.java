
public class OOPS9 {

    static class Animal {

        String color;

        void Eats() {
            System.out.println("CAN EAT");
        }

        void Breath() {
            System.out.println("CAN BREATH");
        }
    }

    static class Mammals extends Animal {

        void walks() {
            System.out.println("CAN walk on land");
        }
    }

    static class Dog extends Mammals {

        int legs;

        void medium() {
            System.out.println("LEGS");
        }
    }

    public static void main(String[] args) {

        // MULTI LEVEL INHERITANCE (ANIMAL-> MAMMALS -> DOG)
        Dog dazy = new Dog();
        dazy.medium();
        dazy.walks();
        dazy.Eats();
        dazy.Breath();
        dazy.legs = 4;
        dazy.color = "white";
        System.out.println("COLOR OF DAZY IS: " + dazy.color);
        System.out.println("DAZY HAS : " + dazy.legs + " legs");
    }
}
