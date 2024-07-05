
public class STRINGS3 {

    public static double ShortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            }
            if (str.charAt(i) == 'S') {
                y--;
            }
            if (str.charAt(i) == 'E') {
                x++;
            }
            if (str.charAt(i) == 'W') {
                x--;
            }
        }
        int sqrddistance = (x * x) + (y * y);
        double distance = Math.sqrt(sqrddistance);
        return distance;

    }

    public static void main(String[] args) {

        // SHORTEST PATH
        String path = "WNEENESENNN";
        System.out.println("SHORTEST PATH IS: " + ShortestPath(path));
    }
}
