package StringAssignments;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StingManipulations {
	// .1.  Write a program to check two different strings equality.

	public static void stringEquality(String s1, String s2) {

		System.out.println(s1.equals(s2));
	}
	// 2,Remove all  spaces in a String

	public static void RemoveSpaces(String s1) {
		System.out.println(s1.replaceAll(" ", ""));
	}

	// 5.Write a function/ method to reverse your own name.
	public static void reverseString(String sr) {
		int len = sr.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			char ch = sr.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
	}

	// 8.Write a method which gives an index of (-1) if string is not available. .
	// it should return integer. if String is present, then it should return the
	// specific index.
	public static int returnIndex(String msg, String s1) {
		int indx = -1;
		// String s1 = "to";
		if (msg.contains(s1)) {
			indx = msg.indexOf(s1);
		}

		return indx;
	}

	public static void main(String[] args) {
		stringEquality("Anusha", "Anusha");
		RemoveSpaces("       Hello   Everyone     ");

		// 3.Write a program that will  print out the last character and first character
		// of a word.
		String s = "Happy";
		System.out.println("The first character of Happy is : " + s.charAt(0));
		int l = s.length();
		System.out.println("The last characyer of Happy is: " + s.charAt(l - 1));

		// 4.Write a program to verify a word or a character contained in the sentence.
		String sen = "This is my java code";
		System.out.println(sen.contains("java"));
		System.out.println(sen.contains("k"));

		// 5.
		reverseString("Anusha");

		// 6.Write a program that gives you the last half of the string.
		String str = "selenium";
		int l1 = str.length();
		System.out.println(l1);
		System.out.println(str.substring(l1 / 2, l1));

		// 7.Write a program to get the 3rd  “ e “ of the string .
		String msg = "Welcome to Naveen Automation Labs";
		System.out.println(msg.indexOf('e'));
		System.out.println(msg.indexOf('e', msg.indexOf('e') + 1));
		int thirde = msg.indexOf('e', msg.indexOf('e', msg.indexOf('e') + 1) + 1);
		System.out.println("The index of third e is: " + thirde);
		System.out.println(msg.charAt(thirde));

		// 8.
		System.out.println(returnIndex("Welcome to Naveen Automation Labs", "to"));
		System.out.println(returnIndex("Welcome to Naveen Automation Labs", "in"));

		// 9.Write a program that breaks a whole string into small strings, and prints
		// out its all values .
		String subStr[] = msg.split(" ");
		for (int i = 0; i <= subStr.length - 1; i++) {
			System.out.println(subStr[i]);
		}

		// 10.Assume that a string consists of 3 words, print out the middle one.
		String msg1 = "Java training sessions";
		String subStr1[] = msg1.split(" ");
		System.out.println(subStr1[1]);

		// 11.get only numeric part from this String:
		String numStr = "your transaction id is: 12345 and reference id is 34567";
		Pattern p = Pattern.compile("\\d+");
		Matcher matcher = p.matcher(numStr);
		if (matcher.find()) {
			String transcId = matcher.group();
			System.out.println(transcId);
		}

		if (matcher.find()) {
			String refId = matcher.group();
			System.out.println(refId);
		}

		// HW
		String hw = "This is my java code iam so happy iam expert and iam busy";

		for (int i = hw.indexOf("i"); i <= hw.length() - 1;) {

			if (hw.indexOf("i", i) != -1) {
				System.out.println(hw.indexOf("i", i));
				i = hw.indexOf("i", i) + 1;
			} else {
				break;
			}
		}

		String mesg = "this is my java code";
		String m[] = mesg.split(" ");
		String msg2 = "";
		for (int i = 0; i <= m.length - 1; i++) {
			String word = m[i];
			String firstLet = (m[i].charAt(0) + "").toUpperCase();
			//System.out.println(word.replace(word.charAt(0) + "", firstLet));
			msg2 = msg2 + word.replace(word.charAt(0) + "", firstLet) + " ";

		}
		System.out.println(msg2);

		String empdata = "pallavi||Sharma||30||pune||india||9989898989";
		String emp[]=empdata.split("\\|\\|");
		for(int i=0;i<=emp.length-1;i++) {
			System.out.println(emp[i]);
		}
		System.out.println(Arrays.toString(emp));

	}

}
