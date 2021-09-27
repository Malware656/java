// import java.sql.Array;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.List;

// public class ArrList {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<String>();
//         list.add("A");
//         list.add("B");
//         list.add("C");
        
//         Iterator it = list.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }

//         // Linked List
//         ArrayList linkedList = new LinkedList<>();
//         list.add("C");
//         list.add("D");
//         list.add("E");

//         linkedList.iterator();
        
//     }// Java program to demonstrate the
// working of a HashSet

import java.util.*;
public class CollectionList {
	public static void main(String args[])
	{
		int count = 10;
		// ArrayList
		List<Integer> list = new ArrayList<>();
		long startTime = System.nanoTime();

		for(int i = 0; i < count; i++){
			list.add(i);
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		System.out.println("TIME TOOK FOR APPENDING DATA INTO ARRAY_LIST:" + duration);

		// LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>();
		startTime = System.nanoTime();

		for(int i = 0; i < count; i++){
			linkedList.add(i);
		}

		endTime = System.nanoTime();
		duration = endTime - startTime;

		System.out.println("TIME TOOK FOR APPENDING DATA INTO LINKED_LIST:" + duration);
		Iterator linkedIt = linkedList.iterator();
		while(linkedIt.hasNext()){
			System.out.print(linkedIt.next() + " ");
		}
		
	}
}

