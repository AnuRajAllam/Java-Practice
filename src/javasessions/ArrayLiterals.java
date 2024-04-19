package javasessions;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]= {10,20,30,40};
		System.out.println(i.length);//4
		System.out.println(i[2]);//30
		//System.out.println(i[4]);//AIOB
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}

		//char
		char ch[]= {'a','e','i'};
		System.out.println(ch[1]);//e
		
	String products[]= {"mac book","ipad","iphone"};
	System.out.println(Arrays.toString(products));//[mac book, ipad, iphone]
	Object empData[]= {"Anu",33,true,'f'};
	}

}
