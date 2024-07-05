
public class RECURSION11 {

    public static int friendPairing(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return friendPairing(n - 1) + (n - 1) * friendPairing(n - 2);  // EVERY PERSON CAN BE EITHER ALONE OR CAN PAIR UP WITH (people-1) REMAINING PERSON 
    }

    public static void main(String[] args) {

        // FRIENDS PAIRING PROBLEM 
        int people = 3;
        System.out.println("TOTAL NUMBER OF WAYS TO PAIR " + people + " PEOPLE IS : " + friendPairing(people));

    }
}
