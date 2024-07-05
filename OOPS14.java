
public class OOPS14 {

    // this is a ABSTRACT CLASS
    static abstract class Animal {

        String color;

        // constructor of abstract class 
        Animal() {
            color = "white";
        }

        // this is a non-abstract function ( implementation as well as idea )
        void Eats() {
            System.out.println("eats!");
        }
        // this is a abstract function ( no implementation only idea )

        abstract void walk();
    }

    static class Horse extends Animal {

        void ChangeColor() {
            color = "brown";
        }

        @Override
        void walk() {
            System.out.println("YES HORSE CAN WALK");
        }
    }

    static class Fish extends Animal {

        void ChangeColor() {
            color = "blue";
        }

        @Override
        void walk() {
            System.out.println("NO FISH CAN'T WALK");
        }
    }

    public static void main(String[] args) {

        // ABSTRACTION ( no implementation only idea )
        // ABSTRACT CLASS HAVE NO OBJECTS 
        // ABSTRACT AND NON-ABSTRACT METHODS CAN BE DEFINED IN A ABSTRACT CLASS
        // ABSTRACT CAN HAVE CONSTRUCTORS
        Horse h = new Horse();
        h.Eats();
        h.walk();
        System.out.println("color of the horse is: " + h.color);  // default color of the horse has been set to white as soon as horse constructor is called! as horse constuctor is called is first calls his parent constructor which is Animal constructor which set the color of horse to white
        h.ChangeColor();
        System.out.println("color of the horse is: " + h.color);

        System.out.println("-------------------------------------");

        Fish f = new Fish();
        f.Eats();
        f.walk();
        System.out.println("color of the fish is: " + f.color);
        f.ChangeColor();
        System.out.println("color of the fish is: " + f.color);

        // Animal A = new Animal(); --> this is not allowed ( a object of abstract class can not be created )
    }
}
