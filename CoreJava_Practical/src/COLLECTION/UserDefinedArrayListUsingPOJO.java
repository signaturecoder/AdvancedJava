package COLLECTION;

import java.util.*;

public class UserDefinedArrayListUsingPOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList arr =new ArrayList();
       Product_master p1 = new Product_master();
       Product_master p2 = new Product_master();
       Product_master p3 = new Product_master();
       Product_master p4 = new Product_master();
       p1.setPname("Tv");
       p1.setPrice(15000.00);
       p2.setPname("Refrigerator");
       p2.setPrice(20000.00);
       p3.setPname("Mobile");
       p3.setPrice(12000.00);
       p4.setPname("Tab");
       p4.setPrice(5000.00);
       arr.add(p1);
       arr.add(p2);
       arr.add(p3);
       arr.add(p4);
       Iterator itr = arr.iterator();
       while(itr.hasNext()){          
    	   //Create an obj of list to access each value of the elements of list(typecasting)
    	   Product_master pm =(Product_master)itr.next(); 
    	   System.out.println(pm.getPname()+"==>"+pm.getPrice());
       }
	}

}
