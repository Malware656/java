import java.util.PriorityQueue;

public class CollectionQueue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue<>();
        String word = "OCCURRENCE";
        for(int i = 0; i < word.length(); i++){
            queue.add(word.charAt(i));
        }
        System.out.println(queue);
        System.out.println("First Item :" + queue.peek());
        System.out.println("First Item Removed:" + queue.poll());
        System.out.println(queue);
    }
}
