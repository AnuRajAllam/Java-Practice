package MapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> empMap=new HashMap<String,Integer>();
		empMap.put("Tom", 101);
		empMap.put("Lisa", 200);
		
		System.out.println(empMap.size());
		
		System.out.println(empMap.get("Tom"));
		empMap.put("Lisa", 300);
		System.out.println(empMap.get("Lisa"));
		
		
		HashMap<String,String> empData=new HashMap<String,String>();
		
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDETManager");
		System.out.println(empData.get(null));
		System.out.println(empData);
		
		System.out.println(empData.get("Lisa"));
		
		

	}

}
