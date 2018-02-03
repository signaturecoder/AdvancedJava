package COLLECTION;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUsingPOJO {
	
	public static void main(String Args[]){
		HashMap hp = new HashMap();
		Mapping m1 = new Mapping();
		Mapping m2 = new Mapping();
		Mapping m3 = new Mapping();
        ChooseKey ck1 = new ChooseKey();
        ChooseKey ck2 = new ChooseKey();
        ChooseKey ck3 = new ChooseKey();
        ck1.setK1("d1");
        ck1.setK2("a1");
        ck2.setK1("d2");
        ck2.setK2("a2");
        ck3.setK1("d3");
        ck3.setK2("a3");
        m1.setState("Bihar");
        m1.setCapital("Patna");
        m2.setState("Jharkhand");
        m2.setCapital("Ranchi");
        m3.setState("West Bengal");
        m3.setCapital("Kolkata");
        hp.put(ck1,m1);
        hp.put(ck2,m2);
        hp.put(ck3,m3);
        Set set = hp.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
        	     Map.Entry me=(Map.Entry)itr.next();
        	     ChooseKey ckObj = (ChooseKey)me.getKey();
        	     Mapping pm=(Mapping)me.getValue();
        	     System.out.println(ckObj.getK1()+"==>"+ckObj.getK2()+"==>"+pm.getState()+"==>"+pm.getCapital());
        }
        
	}

}
