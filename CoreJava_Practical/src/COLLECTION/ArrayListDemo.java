package COLLECTION;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		//Using Vector to make a list
		//Vector arr = new Vector();
		arr.add("Sanu");
		arr.add("Sumit");
		arr.add("Shashi");
		/*Integer n = new Integer(4);
		arr.add(n);*/
		arr.add(new Integer(5));
		arr.add(new Double(5.09));
		arr.add("Sumit");
		//System.out.println(arr);
		/*Iterator itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		ListIterator itr = arr.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Traversing backward using listiterator");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}

}
