
public class OOPS8 {

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

        void swims() {
            System.out.println("CAN SWIMS");
        }
    }

    public static void main(String[] args) {

        // SINGLE LEVEL INHERITANCE  (ANIMAL -> FISH)
        Fish shark = new Fish();
        shark.fins = 2;
        shark.color = "blue";
        shark.Breath();
        shark.swims();
        shark.Eats();
        System.out.println("NUMBER OF FINS OF THE SHARK IS: " + shark.fins);
        System.out.println("COLOR OF THE SHARK IS : " + shark.color);
    }
}
