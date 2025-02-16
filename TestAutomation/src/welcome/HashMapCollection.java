package welcome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCollection {
	
	public static void main(String[] args) {
		HashMap<Integer, String> employeeIdNameMap = new HashMap<Integer, String>();
		employeeIdNameMap.put(101, "Raisul");
		employeeIdNameMap.put(102, "Islam");
		employeeIdNameMap.put(103, "Hridoy");
		
		Iterator ite = employeeIdNameMap.entrySet().iterator();
		
		while(ite.hasNext()) {
			
			Map.Entry<Integer, String> keyvalue = (Entry<Integer, String>) ite.next();
			System.out.println(keyvalue.getKey()+ " " + keyvalue.getValue());
		}
		
		System.out.println();
		
		
		for(Map.Entry<Integer, String> entry : employeeIdNameMap.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
			 
		}
	}

}
