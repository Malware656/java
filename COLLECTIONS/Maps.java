import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        

        // HashTable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        /*
            K - Key
            V - Value
            E - Element
            T - Generic Type obj

            HashTable<K, V> hashTable = new HashTable<>();
            hashTable.put(K, V);
            | Can't do |
            hashTable.put(null, V);
            hashTable.put(K, null);
        */
        hashtable.put(1, "ONE");
        hashtable.put(2, "TWO");
        hashtable.put(3, "THREE");
        hashtable.put(4, "FOUR");
        hashtable.put(5, "FIVE");

        System.out.println("HashTable : " + hashtable);
        // Enumeration vs Set [ hasMoreElemnts, hasNext ]
        Set hashSet = hashtable.entrySet();
        Iterator hasHIterator = hashSet.iterator();
        while(hasHIterator.hasNext()){
            System.out.println(hasHIterator.next());
        }
        System.out.println("HashTable keys : " + hashtable.keys());
        System.out.println("HashTable : " + hashtable.keySet());
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(4, "FOUR");
        map.put(5, "FIVE");
        map.put(null, "ANOTHER DEFAULT");
        map.put(0, null);
        map.put(null, null);
        map.put(null, "DEFAULT");
        
        Set set = map.entrySet();
        System.out.println("Set : " + set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println("MAP : " + it.next());
        }
        // If duplicate key values are given only the last occurrence will be considered
        System.out.println("HashMap : " + map);
        System.out.println(map.get(0));
        System.out.println(map.get(null));
        // As out HashMap has null we can't merge it with the HashTable
        // hashtable.putAll(map);


        /*
            If duplicate key values are given only the last occurrence will be considered

            Hashtable<DataModel, String> hashtable2 = new Hashtable<>();
            hashtable2.put(new DataModel("ONE", 1), "ONE");
            System.out.println(hashtable2.get(new DataModel("ONE", 1)));
            
        */

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        /*
            Why TreeMap ?
            Stores values in Ascending order of its keys.
            Key cannot be null; But value can be null.
        */
        treeMap.put(0, null);
        treeMap.put(1, "ONE");
        treeMap.put(2, "TWO");
        treeMap.put(3, "THREE");
        treeMap.put(4, "FOUR");

        System.out.println(treeMap);

        TreeMap<DataModel, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put(new DataModel("ONE", 1), 0);
        treeMap2.put(new DataModel("TWO", 2), 1);
        treeMap2.put(new DataModel("THREE", 3), 2);
        // treeMap2.put(null, 3); throws NullPointerException

        System.out.println(treeMap2);
    }
}
