
public class OOPS17 {

    public interface Herbivore {

        void EatsGrass();

    }

    public interface Carnivore {

        void EatsMeat();

    }

    static class Beer implements Herbivore, Carnivore {

        @Override
        public void EatsGrass() {
            System.out.println("beer eats grass");
        }

        @Override
        public void EatsMeat() {
            System.out.println("beer eats meat");
        }
    }

    public static void main(String[] args) {

        //     MULTIPLE INHERITANCE USING INTERFACES 
        /*
                       Class A       Class B
                          \             /
                           \           /
                              Class C 
         */
        Beer babu = new Beer();

        babu.EatsGrass();

        babu.EatsMeat();
    }
}
