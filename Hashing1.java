
import java.util.HashMap;
import java.util.Set;

public class Hashing1 {

    public static void main(String[] args) {

        // HASH-MAP
        // Unordered key value pair 
        // size 
        // is Empty 
        // clear
        // put
        // containsKey
        // remove
        // get
        // Syso(hm)
        // keyset - return the set of the key 
        // 
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("kartik", 1);
        hm.put("vanshika", 2);
        hm.put("anshul", 3);
        hm.put("meenu", 4);
        System.out.println(hm);
        Set<String> keys = hm.keySet();

        // ITERATION ON HASH-MAP
        for (String k : keys) {
            System.out.print(k + " ");
            System.out.println(hm.get(k));
        }

    }

}
