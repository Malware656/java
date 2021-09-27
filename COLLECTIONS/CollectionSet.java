import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionSet {
    public static void main(String[] args) {

        // Sets cannot have duplicates.
        
        String word = "OCCURRENCE";
        HashSet<Character> setList = new LinkedHashSet<>();
        for(int i =0; i < word.length(); i++){
            setList.add(word.charAt(i));
        }

        System.out.println(setList);

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("A");
        lhs.add("B");
        lhs.add("D");
        lhs.add("E");
        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+ " ");
        }
    }
}
