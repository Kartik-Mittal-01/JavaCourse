
public class OOPS10 {

    static class Animal {

        String color;

        void Eats() {
            System.out.println("CAN EAT");
        }

        void Breath() {
            System.out.println("CAN BREATH");
        }
    }

    static class Fish extends Animal {

        int fins;

        void walks() {
            System.out.println("can not walk on land but swims in water");
        }

        void medium() {
            System.out.println("swims through fins");
        }
    }

    static class Dog extends Animal {

        int legs;

        void medium() {
            System.out.println("LEGS");
        }

        void walks() {
            System.out.println("can walk on the land");
        }
    }

    public static void main(String[] args) {

        // HIERARCHIAL LEVEL INHERITANCE  (ANIMAL -> FISH and ANIMAL -> DOG) 
        Dog dazy = new Dog();
        dazy.medium();
        dazy.walks();
        dazy.Eats();
        dazy.Breath();
        dazy.legs = 4;
        dazy.color = "white";
        System.out.println("COLOR OF DAZY IS: " + dazy.color);
        System.out.println("DAZY HAS : " + dazy.legs + " legs");

        Fish shark = new Fish();
        shark.walks();
        shark.Eats();
        shark.Breath();
        shark.medium();
        shark.fins = 2;
        shark.color = "blue";
        System.out.println("COLOR OF SHARK IS: " + shark.color);
        System.out.println("SHARK HAS : " + shark.fins + " FINS");

    }
}
