package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is my java code and iam so happy and i am expert";
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));String index ou of bound exception-SIOB
		//System.out.println(str.charAt(-1));SIOB
		
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("i"));//1st occurence of i
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));//2nd occurene of i
		
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));//3rd
		
 
		System.out.println(str.indexOf("i",str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1 ));//4th
		
		String msg="thisis my java code";
		System.out.println(msg.indexOf("java"));
		System.out.println(msg.indexOf("anu"));
		
		String m="welcome null";
		
		if(m.indexOf("admin")==8) {
			System.out.println("correct msg");
		}
		else {
			System.out.println("incorrect msg");
		}
		
		String test="   Hello     World   ";
		//System.out.println(test.trim());
		System.out.println(test.replace(" ", ""));
		
		String dob="01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		String mg="Java phyton Ruby";
		System.out.println(mg.replaceAll(" ", ","));
		System.out.println(mg.replace("Java", "Js"));
		
		String pop="javascipt;java;python;ruby" ;
		String pop1[]=pop.split(";");
		for(int i=0;i<=pop1.length-1;i++) {
			System.out.println(pop1[i]);
		}
		System.out.println(Arrays.toString(pop1));
		
		
		String rest="xXseleniumxxXpythonxXxautomationXxXlabs";
		String r[]=rest.split("xX");
		System.out.println(r[0]);
		System.out.println(r[1]);
		System.out.println(r[2]);
		System.out.println(r[3]);
		System.out.println(r[4]);
		
		
		
		String domain="      hello          world    ";
		System.out.println(domain.replaceAll("\\s+", ""));
		
		
		String order="ypur order id is 12345";
		System.out.println(order.replaceAll("\\D+", ""));
		ArrayList<String> ar=new ArrayList<String>();
		String t2="user id is 9090 and order id is 12345";
		Pattern p=Pattern.compile("\\d+");
		Matcher matcher=p.matcher(t2);
		while(matcher.find()) {
			System.out.println(matcher.group());
			ar.add(matcher.group());
		}
		System.out.println(ar);
		
		String tr="Hello!! this is my value .$123345*";
		String finalValue=tr.replaceAll("[^a-zA-Z0-9\\s$]","");
		System.out.println(finalValue);


		}
	

		
	

	}


