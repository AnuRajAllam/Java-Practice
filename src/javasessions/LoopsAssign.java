package javasessions;

public class LoopsAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		for(int i=1; i<=5; i++) {
			System.out.println("I am Batman");
		}
		
		//2.
		for(int i=1; i<10; i++) {
			System.out.println("I am Batman "+i);
		}
		
		//3.WAP to print 10 to 1 using for, while and do-while loop
		//For loop
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		//while loop
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		//do while loop
		int j=10;
		do {
			System.out.println(j);
			j--;
		}
		while(j>=1);
		
		//4.Write a program in Java to print "Hello World" ten times using while loop
		int p=1;
		while(p<=10) {
			System.out.println("Hello World");
			p++;
		}
		
		//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using
		//while /for/do-while loop
		int m=5;
		while(m<=100) {
			System.out.println(m);
			m=m+5;
		}
		//for loop
		System.out.println("Print using For loop");
		for(int f=5;f<=100;) {
			System.out.println(f);
			f=f+5;
		}
		//do-while loop
		System.out.println("print using do-while");
		int d=5;
		do {
			System.out.println(d);
			d=d+5;
		}
		while(d<=100);
		
		
		//6.Print all odd and even numbers between 1 to 100
		for(int o=1; o<=100; ) {
			System.out.println("Odd numbers are "+o);
			o=o+2;
		}
		/*for(int e=2; e<=100; ) {
			System.out.println("Odd numbers are "+e);
			e=e+2;
		}*/
		for(int e=1;e<=100;e++) {
			if(e%2==0)
			{
				System.out.println(e+" is a even number");
			}
			}
		
		
		//7. What will be the output of this program:
        /*  int i = 1;
         while (i <= 1) {
          System.out.println("Hi Java");
           }*/
		//infinite loop will get generated
		
		
		//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers
		//the console one using while and for loop.
		//while loop
		char ch1='A', ch2='a', ch3='0';
		while(ch1<='Z') {
			System.out.println(ch1+" Ascii value is: "+(byte)ch1);
			ch1++;
		}
		while(ch2<='z') {
			System.out.println(ch2+" Ascii value is: "+(byte)ch2);
			ch2++;
		}
		while(ch3<='9') {
			System.out.println(ch3+" Ascii value is: "+(byte)ch3);
			ch3++;
		}
		System.out.println("***********");
		//for loop
		for (char ch='A'; ch<='Z';ch++) {
			System.out.println(ch+" Ascii value is: "+(byte)ch);
		}
		for (char ch='a'; ch<='z';ch++) {
			System.out.println(ch+" Ascii value is: "+(byte)ch);
		}for (char ch='0'; ch<='9';ch++) {
			System.out.println(ch+" Ascii value is: "+(byte)ch);
		}
		
		
		//9. Print the following series: 
          //1.0 2.0 3.0  ...... 10.0 
          //0 9 18 27 36 …99
		for(float f=1.0f; f<=10.0f; f++) {
			System.out.println(f);
		}
		
		for(int i1=0;i1<=99;) {
			System.out.println(i1);
			i1=i1+9;
		}
		
		//10. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		for(char ch='a';ch<='z';ch++) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+ ": is a vowel");
			}
		}
		//****using while
		char vowel='a';
		while(vowel<='z') {
			if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u') {
				System.out.println(vowel+ ": is a vowel");
			}
			vowel++;
		}
		
		
		//11.Print 1 to 10 and break the loop once you find the multiplication of 7 
		//with a message "bye, see you tomorrow".
		for(int i=1; i<=10; i++) {
			if(i%7==0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
			System.out.println(i);
		}
		int x=1;
		while(x<=10) {
			
			if(x%7==0) {
			System.out.println("bye, see you tomorrow");
			break;
			}
			System.out.println(x);
			x++;
			
		}
		
		/*int y = 1;
		while (y <= 10) {
			System.out.println(y);
			if (y % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;

			}

		}*/
	}

}
