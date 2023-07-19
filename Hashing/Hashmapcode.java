import java.util.LinkedList;

public class Hashmapcode {
    static class HashMap<K,V>{  // K and V i.e key and value can be generic 
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value; 
            }
        }

        private int n;  //no of node
        private int N;  //size of array bucket
        private LinkedList<Node> bucket[];  // we have created array named bucket of type linkedlist which can store data in for of Node


        @SuppressWarnings("uncheacked")
        public HashMap(){
            this.N =4;
            this.bucket = new LinkedList[4]; // array created of size 4
            for (int i = 0; i < 4; i++) {
                this.bucket[i]= new LinkedList<>();  // at each bucket empty linkedlist is initialised 
            } 
        }


        private int hashfunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;

        }

        private int SearchinLL(K key ,int bi){
            LinkedList<Node> ll = bucket[bi];   //nameing that particular bucket's as ll
            int di=0;
            for (int j = 0; j < ll.size(); j++) {
                if (key == ll.get(di)) {
                    return di;
                }
                di++;
            }
            return -1;

        }

        public void rehash() {
            LinkedList<Node> oldBucket[] = bucket; //creating new array oldbucket and stroing old data in it
            bucket = new LinkedList[N*2];
            N = N*2;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i]= new LinkedList<>();  // initialising empty ll
            }

            // node -> to bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll =oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key , V value) {
           int bi = hashfunction(key);
           int di = SearchinLL(key,bi);
           if (di != -1 ) {    // key alredy exist in bucket's ll
                Node node  =  bucket[bi].get(di);
                node.value = value;
           } else{              //adding new Node 
                bucket[bi].add(new Node(key, value));
                n++;
           }

           double lambda =(double) n / N;
           if (lambda> 2) {
            rehash();
           }
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india", 1000);
        hm.put("Chian", 100);   
        hm.put("Srilanka", 10);
    }
}
