
import java.util.HashMap;
import java.util.Set;

public class Hashing6 {
    // METHOD 1 

    public static boolean ValidAnagram(String s1, String s2) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (hm1.containsKey(s1.charAt(i))) {
                hm1.put(s1.charAt(i), hm1.get(s1.charAt(i)) + 1);
            } else {
                hm1.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (hm2.containsKey(s2.charAt(i))) {
                hm2.put(s2.charAt(i), hm2.get(s2.charAt(i)) + 1);
            } else {
                hm2.put(s2.charAt(i), 1);
            }
        }

        Set<Character> set1 = hm1.keySet();
        Set<Character> set2 = hm2.keySet();
        if (set1.size() != set2.size()) {
            return false;
        }
        for (Character key : set1) {
            if ((int) hm1.get(key) != (int) hm2.get(key)) {
                return false;
            }
        }
        return true;

    }

    // METHOD 2 
    public boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);  // set or default -> if key found => set else set default value to zero 

            for (int j = 0; j < str2.length(); j++) {
                Character ch = str2.charAt(j);
                if (map.get(ch) != null) {
                    if (map.get(ch) == 1) {
                        map.remove(ch);
                    } else {
                        map.put(ch, map.get(ch) - 1);
                    }
                } else {
                    return false;
                }
            }
        }

        return map.isEmpty();

    }

    public static void main(String[] args) {

        // VALID ANAGRAMAS -> AB,BA || earth,heart
        System.out.println(ValidAnagram("kartik", "kitrak"));
        System.out.println(ValidAnagram("hardik", "kartik"));
        System.out.println(ValidAnagram("aabbccddee", "aabbccddeeff"));
    }
}
