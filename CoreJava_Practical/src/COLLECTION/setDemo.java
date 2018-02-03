package COLLECTION;
import java.util.*;
public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // HashSet hset = new HashSet();
       //LinkedHashSet hset = new LinkedHashSet();
	   TreeSet hset = new TreeSet();
	   hset.add("cat");
       hset.add("attack");
       hset.add("kite");
       hset.add("bite");
       hset.add("dog");
       hset.add("bite");
       //hset.add(new Integer(5));
       Iterator itr = hset.iterator();
       while(itr.hasNext()){
    	   System.out.println(itr.next());
       }
	}

}
