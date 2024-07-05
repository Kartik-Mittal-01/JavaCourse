
public class OOPS12 {

    static class Calculator {

        int Sum(int a, int b) {
            return (a + b);
        }

        int Sum(int a, int b, int c) {
            return (a + b + c);
        }

        float Sum(float a, float b) {
            return (float) (a) + (float) (b);
        }
    }

    public static void main(String[] args) {

        // POLYMORPHISM (OVERLOADING -> MULTIPLE FUNCTION WITH SAME NAME BUT DIFFERENT PARAMETER)
        Calculator casio = new Calculator();
        System.out.println(casio.Sum(1, 2));
        System.out.println(casio.Sum(1, 2, 3));
        System.out.println(casio.Sum(1.1f, 2.4f));
    }
}
