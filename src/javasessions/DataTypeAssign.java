package javasessions;

public class DataTypeAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Write a Java program to add two strings:
		String a = "Hello";
		String b = "Naveen K";
		String c = a + " " + b;
		System.out.println(c);// Hello Naveen K

		// 2. Write a Java program to print the sum of two numbers.
		byte b1 = 74;
		byte b2 = 36;
		int sum = b1 + b2;
		System.out.println(sum);// 110

		// 3.Write a Java program to print the division of two numbers.
		byte b3 = 50;
		byte b4 = 3;
		int div = b3 / b4;
		System.out.println(div);// 16

		// 4. Write a Java program to compute the specified expressions and print the
		// output.
		// Test Data ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		float f1 = 25.5f, f2 = 3.5f, f3 = 40.5f, f4 = 4.5f;
		float res = ((f1 * f2 - f2 * f2) / (f3 - f4));
		System.out.println(res);// 2.1388888

		// 5. Try to concat "Hello Selenium" with a character 't'.
		String s1 = "Hello Selenium";
		char ch = 't';
		String ct = s1 + ch;
		System.out.println(ct);// Hello Seleniumt

		// 6. Create three int variables having values like : 100, 200, 3400.
		// Add them and concatenate and generate this output String : 
		// "Your Total amount is. 3700".
		int i1 = 100, i2 = 200, i3 = 3400;
		int total = i1 + i2 + i3;
		System.out.println("\"Your Total  amount is." + " " + total + "\"");// "Your Total amount is. 3700"

		// 7. Print the ASCII value of the character 'h'.
		char ch1 = 'h';
		System.out.println((byte) ch1);// 104

		// 8. Write a program to add 3 to the ASCII value of the character 'd' and print
		// the equivalent character.
		int i4 = 3;
		char ch2 = 'd';
		char add = (char) (i4 + ch2);
		System.out.println(add);// g

		// 9. Write a program to find the square of the number 3.9.
		float f5 = 3.9f;
		float square = f5 * f5;
		System.out.println(square);// 15.210001

		
		
		

	}

}
