package COLLECTION;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //HashMap hp=new HashMap();                   // Not in Specific Order
		//LinkedHashMap hp=new LinkedHashMap();     // Specific order
		TreeMap hp=new TreeMap();                  //   Lexiographical Order
      hp.put("TV",new Double(15000.00));
      hp.put("REFRIGERATOR",new Double(15000.00));
      hp.put("LAPTOP",new Double(36000.00));
      hp.put("TAB",new Double(20000.00));
      hp.put("DESKTOP",new Double(25000.00));
      hp.put("MOBILE",new Double(12000.00));
      hp.put("TV",new Double(15000.00));
      hp.put("REMOTE",new Double(5000.00));
      Set set=hp.entrySet();
      Iterator itr=set.iterator();
      while(itr.hasNext())
      {
    	     Map.Entry me=(Map.Entry)itr.next();
    	     System.out.println(me.getKey()+"=====>"+me.getValue());
      }
	}

}
