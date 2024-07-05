
public class STRINGS6 {

    public static void main(String[] args) {

        // FIND THE LARGEST STRING IN LEXICOGRAPHIC ORDER 
        String fruits[] = {"banana", "apple", "strawberry", "mango"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) { // RETURNS NEGATIVE WHEN "largest" is lexo small as compared to "fruits[i]"

                largest = fruits[i];
            }
        }

        System.out.println("LARGEST LEXOGRAPHICALLY STRING IS: " + largest);

    }
}
