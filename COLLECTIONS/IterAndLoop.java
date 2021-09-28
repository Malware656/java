import java.util.*;
public class IterAndLoop {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        String word = "HELLOWORLD!";
        for(int i = 0; i < word.length(); i++){
            // Simply add only one element
            list.add(word.charAt(i));
        }
        System.out.println(list);
        // While using for loop to remove an element it throws ConcurrentModificationException
        try{
            for(Character i : list){
                list.remove(i);
            }
        }
        catch(ConcurrentModificationException e)
        {
            e.printStackTrace();
        }
        // So to overcome that we are using iterator
        Iterator<Character> it = list.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
            System.out.println(list);
        }

    }
}
