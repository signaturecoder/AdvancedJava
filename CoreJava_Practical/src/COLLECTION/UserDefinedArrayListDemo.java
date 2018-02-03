package COLLECTION;
import java.util.*;

 class Product {
	     String name;
	     double price;
	    
	    public Product(String name, double price){
	    	this.name=name;
	    	this.price=price;
	    }
	    public String toString()
	    {
	    	return name+"===>"+price;
	    }
	}
public class UserDefinedArrayListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList arr = new ArrayList();
       arr.add(new Product("Tv",15000.00));
       arr.add(new Product("Refrigerator",20000.00));
       arr.add(new Product("Mobile",10000.00));
       System.out.println(arr);
       Iterator itr =arr.iterator();
       while(itr.hasNext()){
    	   System.out.println(itr.next());
	}

	}

}
