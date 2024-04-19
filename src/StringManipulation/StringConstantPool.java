package StringManipulation;

public class StringConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tr="Hello";
		tr.concat("selenium");
		System.out.println(tr);
		
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1==s2);//SCP===SCP//true
		
		String s3=new String("World");//1-Heap 1-SCP
		String s4=new String("World");////1HEap 0-SCP
		System.out.println(s3==s4);//Heap===Heaap//false
		System.out.println(s3.equals(s4));//true
		
		String s5="selenium";//1-SCP
		String s6=new String("selenium");//1-Heap
		System.out.println(s5==s6);//SCP==Heap//False
		System.out.println(s5.equals(s6));//true
		
		String s7="Testing";
		String s8="testing";
		System.out.println(s7==s8);//falkse
		System.out.println(s7.equals(s8));//false

	}

}
