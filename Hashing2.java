
import java.util.ArrayList;
import java.util.LinkedList;

public class Hashing2 {

    static class HashMap<K, V> {

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; // nodes 
        private int N; // buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashfunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;

        }

        public int searchinLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")

        private void rehash() {
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashfunction(key);     // bucket indx
            int di = searchinLL(key, bi);  // data index 

            if (di == -1) {
                Node newnode = new Node(key, value);
                buckets[bi].add(newnode);
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }

        }

        public boolean isEmpty() {
            return n == 0;
        }

        public boolean containsKey(K key) {
            int bi = hashfunction(key);
            int di = searchinLL(key, bi);
            return di != -1;

        }

        public V remove(K key) {
            // RETURN THE VALUE OF THE REMOVED KEY 

            int bi = hashfunction(key);
            int di = searchinLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                V data = node.value;
                buckets[bi].remove(di);

                return data;

            } else {
                return null;
            }
        }

        public V get(K key) {
            // RETURN THE VALUE OF THE KEY

            int bi = hashfunction(key);
            int di = searchinLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                V data = node.value;

                return data;

            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }

            }
            return keys;
        }

    }

    public static void main(String[] args) {

        // IMPLEMENTATION OF HASH MAP 
        // Put function -> key -> hashfunction -> buckett index -> iterate on LL in that bucket -> found -> update the value 
        //          -> not found -> add new node in that LL
        // (number of nodes)/(number of buckets)[lambda] <= threshold value(A constant value)
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("kartik", 1);
        hm.put("vanshika", 2);
        hm.put("anshul", 3);
        hm.put("meenu", 4);

        System.out.println(hm.keySet());

        hm.remove("kartik");
        System.out.println("KARTIK IS REMOVED FROM HASH MAP");

        System.out.println(hm.keySet());

    }
}
