import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operations {
   public static void main(String[] args) {

       List<Character> list = new ArrayList<>();
       String word = "HELLO-WORLD!";
       for(int i = 0; i < word.length(); i++){
           // Simply add only one element
           list.add(word.charAt(i));
       }

       List<Character> newList =  new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
       // Adds another Collection 
       list.addAll(newList);

       System.out.println(list);

       // Checks for the occurance of a obj
       if(list.contains('A')){
           System.out.println("List contains element A");
       }
       else{
           System.out.println("Does not contain element");
       }

       // Return element at index 0
       System.out.println(list.get(0));

       // Returns the index of an obj if it contains, else it'll return -1
       System.out.println(list.indexOf('M'));

       // Returns last index of a re-occuring element
       System.out.println(list.lastIndexOf('O')); 

       // Sorts the list
       list.sort((a, b) -> a.compareTo(b));
       System.out.println(list);
       // Splicing list
       list.subList(1, 3);

       // Removes all common elements
       // eg: [A, B, C] [C, D, E]
       // returns [A, B]
       list.removeAll(newList);

       // Retains all common elements
       // eg: [A, B, C] [C, D, E]
       // return s [C, C, D, E]
       list.retainAll(newList);

   }
}
