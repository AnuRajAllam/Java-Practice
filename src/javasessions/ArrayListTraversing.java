package javasessions;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> footerLinksList = new ArrayList<String>();
		System.out.println(footerLinksList);// [ ]
		footerLinksList.add("Login");
		footerLinksList.add("Register");
		footerLinksList.add("WishList");
		footerLinksList.add("Forgot pwd");
		System.out.println(footerLinksList);// [Login, Register, WishList, Forgot pwd]
		System.out.println(footerLinksList.size());// 4

		// index based loop
		for (int i = 0; i < footerLinksList.size(); i++) {
			System.out.println(footerLinksList.get(i) + " inex is " + i);
		}

		// for each loop
		int k = 0;

		for (String e : footerLinksList) {

			System.out.println(e + " index is " + k);
			k++;
		}
		
		ArrayList<String> pageList=new ArrayList<String>();
		pageList.add("Login");
		pageList.add("Register");
		pageList.add("WishList");
		pageList.add("Forgot pwd");
	//	pageList.add(5, "Contact us");//IOB
		
		pageList.addAll(footerLinksList);
		System.out.println(pageList);
		//[Login, Register, WishList, Forgot pwd, Login, Register, WishList, Forgot pwd]
		
		footerLinksList.removeAll(footerLinksList);
		System.out.println(footerLinksList);//[]
		
		System.out.println(pageList);
		//System.out.println(pageList);
		
		

	}

}
