package javasessions;

import java.util.ArrayList;

public class FunctionTest {

	public int getStudentMarks(String name) {
		int marks = -1;
		System.out.println("Getting student marks for " + name);
		if (name.trim().equalsIgnoreCase("Anu")) {
			marks = 90;
			// return 90;
		} else if (name.trim().equalsIgnoreCase("Ravi")) {
			marks = 80;
			// return 80;
		} else if (name.trim().equalsIgnoreCase("Naveen")) {
			marks = 40;
			// return 40;
		} else {
			System.out.println("Please pass correct name");

		}
		return marks;
	}

	public int getMarks(String name) {
		int marks = -1;
		System.out.println("Getting student marks for " + name);
		switch (name.toLowerCase().trim()) {
		case "anu":
			return 90;
		// System.out.println("");
		// break;
		case "ravi":
			return 80;
		// break;
		case "naveen":
			return 40;

		// break;

		default:
			System.out.println("Please corect name");
			return -1;
		// FunctionTes;
		}
		// return.marks;
	}
	
	public boolean launchBowsr(String browserName) {
		//bolean flag =false;
		System.out.println("Browser name id :"+browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched");
		return true;
		case "safari":
			System.out.println("safari is launched");
			return true;
			//break;
		case "ie":
			System.out.println("ie is launched");
			return true;
			//break;

		default:
			System.out.println("Please enter correct browser");
			return false;
			//break;
		}
		
	}
	
	
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("Getting devices list for "+empName);
		ArrayList<String> devList=new ArrayList<String>();
		
		switch (empName.toLowerCase().trim()) {
		case "anu":
			devList.add("Macbook pro");
			devList.add("Macbook air");
			devList.add("air");
			break;

		case "raju":
			devList.add("Macbook pro");
			devList.add("Macbook air");
			//devList.add("air");
			break;

		case "mochu":
			devList.add("Macbook pro");
			//devList.add("Macbook air");
			//devList.add("air");
			break;

		default:
			System.out.println("Peae enter correct name");
			break;
		}
		return devList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionTest obj = new FunctionTest();
		int studentMarks = obj.getStudentMarks("dsa");
		System.out.println(studentMarks);
		if (studentMarks >= 0) {
			System.out.println("Print Mark sheet");
		} else {
			System.out.println("No need of Mark sheet");
		}
		
		int m=obj.getMarks("xcZ");
		System.out.println(m);
		boolean isLaunched=obj.launchBowsr("ie");
		if(isLaunched) {
			System.out.println("enter url");
		}
		
		ArrayList<String> edevlist=obj.getDevicesList("raju");
		System.out.println(edevlist);

	}

}
