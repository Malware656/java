import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {
    public static void main(String[] args) {
        
        // ArrayList 
        ArrayList<String> arrList = new ArrayList<>();

        /*

            Why ArrayList ?

            Array has fixed length so we cannot add anymore data;
            Supports Consumer;

            int[] some = new int[5];
            int some[] = {1, 2, 3, 4, 5}
            some.add() // Can't do

            Grows dynamically and Shrink

            ArrayList<T> some = new ArrayList<T>();
            some.add() // Can do
            some.set(index, value)

        */

        // Returns Size
        System.out.println(arrList.size());

        // Checks for availability
        if(arrList.contains("Sentence")){
            // TODO implementation
        }

        // Checks whether the list is empty
        if(!arrList.isEmpty()){
            // Return element at index 0
            arrList.get(0);
        }

        // Add element to arrList at end
        arrList.add("DATA_0");

        // Inserts item at specified index
        arrList.add(0, "DATA_1");

        // Replaces element at given index
        arrList.set(0, "DATA_2");

        // Removes
        arrList.remove("SOME");
        
        // Returns sublist
        arrList.subList(0, 1);

        // clears the list
        arrList.clear();

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        /*
            Similar to ArrayList but each element is considers as Node
            Each node has a HEAD and TAIL

            Why LinkedList ?

            If we want to insert element or to delete an element from ArrayList we have to shift all elements to right to 
            allocate memory for the insertion.

            So it consumes more memory and performance

            To overcame this things we are going for LinkedLists

            LinkedList does not require contiguous memory locations, because elements are linked with each other with refs
            So but just changing refs we can insert or del an element (i.e Node)

            LinkedList<String> list=new LinkedList<String>();

            list.addLast("Rick");

            Adding an element to the 3rd position

            list.add(2, "Malware"); // No need to shift position just changing refs is required

            list.remove(index)

        */

        // Adding data to LinkedList
        linkedList.add("TWO");
        linkedList.addFirst("ONE");
        linkedList.addLast("THREE");

        // New methods exclusive for LinkedList
        // Returns just the First element;
        System.out.println(linkedList.peek());

        // Pushes data to LinkedList to the start
        linkedList.push("FOUR");

        // Removes first element
        linkedList.pop();
        System.out.println("POP:" + linkedList);
        
        // Returns First element and removes it from List
        linkedList.pollFirst();
        System.out.println(linkedList);

        // Returns Last element and removes it from List
        linkedList.pollLast();
        System.out.println(linkedList);

        // Vector
        Vector<String> vectorList = new Vector<>(0, 5);

        /*

            Why Vector ?

            Vector is Similar to ArrayList but Vector creates a Sized ArrayList
            Empty vector size is 10, so when we insert a value above the size of vector.
            The size of the vector doubles.

            Usage:

                Vector vec = new Vector(); // creates an ArrayList with the size of 10
                Vector vec = new Vector(3); // creates an ArrayList with the size of 30

                Vector vec = new Vector(2, 5); // creates an ArrayList with the size of 20 and when increaments it increases by 5

                vec.capacity()
                vec.size()

                Enumeration en = vec.elements();
                while(en.hasMoreElements())
                    System.out.print(en.nextElement() + " ");

        */

        vectorList.addElement("ONE");
        vectorList.addElement("TWO");
        vectorList.addElement("THREE");
        vectorList.addElement("FOUR");
        vectorList.addElement("FIVE");
        vectorList.addElement("SIX");
        vectorList.addElement("SEVEN");
        vectorList.addElement("EIGHT");
        vectorList.addElement("NINE");
        vectorList.addElement("TEN");

        System.out.println("Vector Capactity Before:" + vectorList.capacity());
        vectorList.addElement("ELEVEN");
        vectorList.addElement("TWELVE");
        System.out.println("Vector Capactity After:" + vectorList.capacity());

        // As Vector list is synchrosized we are using enumeration
        Enumeration<String> vIterator = vectorList.elements();
        while(vIterator.hasMoreElements()){
            vIterator.nextElement();
        }

        // Sets
        HashSet<DataModel> hashSet = new HashSet<>();
        /*

            Set cannot contain duplicates. But allows null to be stored.
            HashSet does not maintain order. HashSet gives better performance than TreeSet.

            HashSet vs HashMap

            HashSet<T> set = new HashSet<T>(); // can contain only value

            HashMap<T,T> set = new HashSet<>(); // can contain only key and value as a pair

        */
        hashSet.add(new DataModel("THREE", 3));
        hashSet.add(new DataModel("NINE", 9));
        hashSet.add(new DataModel("FOUR", 4));
        hashSet.add(new DataModel("ONE", 1));

        Iterator<DataModel> hashIterator = hashSet.iterator();
        while(hashIterator.hasNext()){
            System.out.print(hashIterator.next().name + " ");
        }
        System.out.println("\n");

        // LinkedHashSet
        LinkedHashSet<DataModel> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new DataModel("ONE", 1));
        linkedHashSet.add(new DataModel("TWO", 2));
        linkedHashSet.add(new DataModel("THREE", 3));

        linkedHashSet.forEach(
            i -> System.out.println("LinkedHashSet : " + i.name));
        System.out.println("\n");

        // TreeSet
        TreeSet<DataModel> treeSet = new TreeSet<>();

        /*

            Why TreeSet ?
            
            TreeSet stores data in sorted order.

            Usage:

            TreeSet<E> treeSet = new TreeSet<>(); // E must be a child of Comparable class

            eg: TreeSet<CustomModel> treeSet = new TreeSet<>(); // Throws error as CustomModel is not a child of Comparable

            To overcome this CustomModel should be like

            class CustomModel implements Comparable{
                 TODO IMPLEMENTATIONS;
            }
            
        */
        
        treeSet.add(new DataModel("ONE", 1));
        treeSet.add(new DataModel("TWO", 2));
        treeSet.add(new DataModel("THREE", 3));
        // treeSet.addAll(Arrays.asList("ONE", "TWO", "THREE"));
        Iterator<DataModel> treeIterator = treeSet.descendingIterator();
        while(treeIterator.hasNext()){
            System.out.println("Iterator : " + treeIterator.next().name);
        }

        System.out.println("\n");
        // Alter
        treeSet.forEach(
            data -> System.out.println("Consumer : " + data.name));

        // Queue, to be implemented soon
    }
}

class DataModel implements Comparable{
    String name;
    Integer num;

    public DataModel(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {
        return this.num.compareTo(((DataModel) o).num);
    }
}