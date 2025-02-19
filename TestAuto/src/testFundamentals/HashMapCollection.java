package testFundamentals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapCollection {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> empIdName = new HashMap<Integer, String>();
		
		empIdName.put(111, "Raisul");
		empIdName.put(222, "Islam");
		empIdName.put(333, "Hridoy");
		
		Iterator itrt = empIdName.entrySet().iterator();
		
		while(itrt.hasNext()) {
			Map.Entry<Integer, String> keyValue = (Entry<Integer, String>) itrt.next();
			
			System.out.println(keyValue.getKey() + " and " + keyValue.getValue());
			
		}
		
		System.out.println();
		
		
		for(Map.Entry<Integer, String> entry : empIdName.entrySet()) {
			
			System.out.println(entry.getKey() + " and " + entry.getValue());
		}
	}

}
