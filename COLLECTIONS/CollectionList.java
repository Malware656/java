import java.util.*;
public class CollectionList {
	static{
		System.out.println("Message from static block");
	}
	static public void main(String args[])
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
		Iterator<Integer> linkedIt = linkedList.iterator();
		while(linkedIt.hasNext()){
			System.out.print(linkedIt.next() + " ");
		}
		
	}
}

