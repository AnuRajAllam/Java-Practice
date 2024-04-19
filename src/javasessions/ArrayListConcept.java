package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Load factor is PC/2
		// Virtual capacity at first is 10
		// physiCal capacity is 0
		// VC=PC/2 is the formula after filling the 10srgments if we want to add
		// another num then only load factor will come into picture
		// we cnnot check VC on console
		// we can get only size of PC
		// VC is the internal structue//
		// VC=1,PC=1, VC=PC/2=1/2=0 then the Load factor is 10 if it is 0
		ArrayList ar = new ArrayList(10);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.size());// it will give pccapacity
		// System.out.println(ar.get(4));//OP:IOB
		int i[] = new int[4];
		System.out.println(i.length);
		int k[] = { 1, 2 };
		System.out.println(k.length);

		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "ff", "ie"));
		System.out.println(browserList.size());// 3
		browserList.add("edge");
		System.out.println(browserList.size());// 3

		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("windows", "mac"));
		System.out.println(osList);// [windows, mac]

		browserList.addAll(osList);
		System.out.println(browserList);// [chrome, ff, ie, edge, windows, mac]

		browserList.removeAll(osList);
		System.out.println(browserList);// [chrome, ff, ie, edge]

		browserList.add("safari");
		System.out.println(browserList);// [chrome, ff, ie, edge, safari]
		browserList.add(0, "anusha");
		System.out.println(browserList);// [anusha, chrome, ff, ie, edge, safari]

		if (browserList.contains("chrome")) {
			System.out.println("Tesy passed");//
		} else {
			System.out.println("Test failed");
		}

		ArrayList<String> subList = new ArrayList<String>(Arrays.asList("ff", "chrome"));
		System.out.println(browserList.containsAll(subList));// true

		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10, 20, 11, 48, 23));
		System.out.println(numList);// [10, 20, 11, 48, 23]
		Collections.sort(numList);
		System.out.println(numList);// [10, 11, 20, 23, 48]
		Collections.swap(numList, 0, 1);
		System.out.println(numList);//[11, 10, 20, 23, 48]
		
		
		List<Object> emp=Collections.emptyList();
		System.out.println(emp.size());//0
		//emp.add("qa");//UnsupportedOperationException
		
		//ArrayList<Crickters> cricketList=new ArrayList<>();
	}

}
