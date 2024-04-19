package StringManipulation;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//immutable
		String str="Hello";
		str.concat("Selenium");
		System.out.println(str);
		//mutable
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("selenium");
		System.out.println(sb);

	}

}
