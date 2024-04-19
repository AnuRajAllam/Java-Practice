package javasessions;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = { 1, 2, 3, 4, 5 };

		// index based loop

		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		// for each loop

		for (int e : i) {
			System.out.println(e);
		}

		double d[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		for (double e : d) {
			System.out.println(e);
		}

		String products[] = { "mac book", "ipad", "iphone" };
		for (String e : products) {
			System.out.println(e);
		}

		Object empData[] = { "Anu", 33, true, 'f' };
		for (Object e : empData) {
			System.out.println(e);
		}

		int num[] = { 10, 202, 30, 40, 50 };
		int count = 0;
		for (int e : num) {
			System.out.println(count + "---" + e);
			count++;
		}

		int arrsize = num.length - 1;
		for (int e : num) {
			System.out.println(num[arrsize]);
			arrsize--;
		}

		short sh[] = { 100, 120, 90 };
		for (short e : sh) {
			System.out.println(e);
		}

		// ForEachLoop Assignment
		// [a-z]97-122
		char smallAlpha[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (char e : smallAlpha) {
			System.out.println(e + " AscII Value is: " + (int) e);
		}

		// [A-Z]65-90
		char capitalAlpha[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for (char e : capitalAlpha) {
			System.out.println(e + " AscII Value is: " + (int) e);
		}
		
		//[0-9]48-57
		char digits[] = {'0', '1', '2', '3', '4', '5', '6', '7' ,'8','9'};
		for (char e : digits) {
			System.out.println(e + " AscII Value is: " + (int) e);
		}

	}

}
