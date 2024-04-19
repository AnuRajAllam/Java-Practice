package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {
	
	public void test() {
		System.out.println("Testmethod");
		
	}
	
	public void getBill(int days) {
		System.out.println("Getting bill amount");
		int amount=days*1000;
		System.out.println(amount);
	}
	
	public int sum(int a,int b) {
		System.out.println("adding two numbers");
		int s=a+b;
		return s;
	}
	
	public String getInfo() {
		System.out.println("Getting info");
		String s="Hello APP";
		return s;
	}
	
	public boolean isAppExist() {
		return true;
	}
	
	public Object[] getMarks(int marks,int extraMarks, int descMarks) {
		int finalMarks=marks+extraMarks-descMarks;
		boolean flag=true;
		String schoolName="Joseps";
		Object finalInfo[]= {finalMarks,schoolName,flag};
		return finalInfo;
	}
	
	public int testing() {
		System.out.println("testing done");
		return 100;
	}
	
	public void printName() {
		System.out.println("Anu");
		return;//blank return
	}
	
	public void launchUrl(String url) {
		System.out.println(url);
	}
	
	public String[] getDevices() {
		System.out.println("Gettin devices");
		String devices[]= {"Macbook pro","Macbook air","iphone"};
		return devices;
	}
	
	public ArrayList<String> getUersList() {
		System.out.println("Getting Users List");
		ArrayList<String> userList=new ArrayList<String>();
		userList.add("Anu");
		userList.add("Mksha");
		return userList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call a funct
		
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		
		ArrayList<String> usr=obj.getUersList();
		System.out.println(usr);
		
		String dev[]=obj.getDevices();
		System.out.println(Arrays.toString(dev));
		obj.getBill(7);//call by value
		//objSystem.out.println(obj.sum(10, 20));
		int res=obj.sum(10, 20);
		System.out.println(res);
		
		obj.launchUrl("http://www.google.com");
		
		int res1=obj.sum(10, 20);
		System.out.println(res1-20);
		//obj.sum(18);
		
		String info=obj.getInfo();
		System.out.println(info);
		
		if(obj.isAppExist()) {
			System.out.println("Login to APP");
		}
		
		Object f1[]=obj.getMarks(20, 30, 10);
		System.out.println(Arrays.toString(f1));
		

	}

}
