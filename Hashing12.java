
import java.util.HashMap;

public class Hashing12 {

    public static String GetStart(HashMap<String, String> map) {
        HashMap<String, String> rev = new HashMap<>();
        for (String key : map.keySet()) {
            rev.put(map.get(key), key);   // stores destination to start 
        }
        for (String start : map.keySet()) {
            if (!rev.containsKey(start)) {
                return start;

            }
        }
        return null;
    }

    public static void main(String[] args) {

        // FIND ITINERARY FROM TICKETS 
        HashMap<String, String> map = new HashMap<>();   // stores start to destination 
        map.put("C", "B");
        map.put("M", "D");
        map.put("G", "C");
        map.put("D", "G");

        String start = GetStart(map);
        System.out.print(start);
        for (String key : map.keySet()) {
            System.out.print(" -> " + map.get(start));
            start = map.get(start);

        }

    }
}
