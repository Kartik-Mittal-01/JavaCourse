
public class OOPS19 {

    static class Animal {

        String color;

        Animal() {
            System.out.println("Animal constructor is called ..");
        }
    }

    static class Horse extends Animal {

        Horse() {
            super.color = "yellow";
            System.out.println("Horse constructor is called ..");
        }
    }

    public static void main(String[] args) {

        // SUPER KEYWORDS ( used to refer to the properties , functions  , and constructor of immediate parent )
        Horse h = new Horse();
        System.out.println(h.color);

    }

}
