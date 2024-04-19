package javasessions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println("Hello ");
		
		//*******DATA TYPES********
		
		//   %%primitive data types%%
		//1. boolean : true/ false
		//2. numric data types: byte, short, int , long, char
		//3. floating points: float , double
		
		//1.
		//byte: Range: -128 to 127, size: 1byte=8 bits
		byte b1=10;
		byte b2='a';
		byte b3='$';
		byte b4=-128;
		byte b5=127;
		byte b6='1';
		System.out.println(b2);//97 generating ascii code for cahr 'a'
		System.out.println(b3);//36 generating ascii code for cahr '$'
		System.out.println(b6);//49 generating ascii code for cahr '1'
		System.out.println(b5+b1);//137
		System.out.println(b2+b3);//97+36=133
		System.out.println(b5+b6);//127+49=176
		//byte b7=b5+b6; we cannot assgn sum of two bytes to another byte
		int b7=b5+b6;
		//short sumb=b5+b6; we cannot assgn sum of two bytes to short
		long sumb=b5+b6;//the sum of two bytes should b assign either to int or long data type
		
		System.out.println(b7);//176
		
		//2.
		//short: Range: -32768 to 32767, size: 2bytes=16bits
		short s1=10;
		short s2=-32768;
		short s3=32767;
		short s4='a';
		short s5='$';
		short s6='A';
		short s7=1;
		short s8='1';
		System.out.println(s4);//97 generating ascii code for cahr 'a'
		System.out.println(s5);//36 generating ascii code for cahr '$'
		System.out.println(s6);//65 generating ascii code for cahr 'A'
		System.out.println(s8);//49 generating ascii code for cahr '1'
		System.out.println(s8+s7);//49+1=50
		System.out.println(s5+s6);//36+65=101
		System.out.println(s3+s4);//32767+97=32864
		//short sums=s5+s6; we cannot assign sum of two shorts to another short
		int sums=s5+s6;
		long sums1=s5+s6;
		System.out.println(sums1);
		
		//3.
		//int: Range 2^31 to 2^31-1 size 4 bytes=32 bits
		int i=10;
		int i1=-10;
		int i2='1';
		int i3=1;
		int i4='a';
		int i5='$';
		System.out.println(i5);//36 generating ascii code for cahr '$'
		System.out.println(i1+i+i2+i3);//-10+10+49+1=50
		int sumi6=i4+i5;// w can assign the sum of two int to int or long
		long sumi7=i4+i5;
		//byte sumi8=i4+i5;
		
        //4.
		//long: Range 2^63 to 2^63-1 size 8 bytes=64 bits
		long l=10;
		long l1=-10;
		long l2='1';
		long l3=1;
		long l4='a';
		long l5='$';
		//long l6="A";
		System.out.println(l5);//36 generating ascii code for cahr '$'
		System.out.println(l1+l+l2+l3);//-10+10+49+1=50
		long suml=l+l1;
		//int suml1=l+l1;we cannot do this
		
		//5.
		/*char: Range 0-9: 48-57  size= 2bytes=16bits
		              A-Z: 65-90
		              a-z: 97-122*/
		char c='a';
		char c1=1;//it will take without single quotes but it wii not show in output
		char c2='A';
		char c3='1';
		//char c4='ab';we can give only sinle char inside single quotes
		char c4=10;
		//char c5=10;
		
		System.out.println(c);//output is a as it is caharacter type
		System.out.println(c1);//output is special symbol
		System.out.println(c3);//output is 1
		System.out.println(c1+c3);//1+49=50 while using arthimatic operations it will
		System.out.println(c+c2);//97+65=162 take the ascii values
		System.out.println((byte)c);// it will give the ascii value
		System.out.println('3'+'C');//51+67=118
		System.out.println(100+'4');//100+52=152
		System.out.println(c+""+c2);//aA bcoz we are concatinating with string type
		
		
		// %%Floating poits%%
		//1. float size: 4bytes= 32 bits
		//range will 7 numbers after .
		float f=12.0f;// in ouput f will be ignoed by JVM
		float f1=15.12345677888f;//though it accept more than 7 numbrs
		System.out.println(f1);// while printing the output is 15.123457 only 6nos after.
		
		//2. double sixe 8bytes=64bits
		//range will b 15 nos after .
		
		double d= 12.897;
		double d1=13.123456789012345678;
		System.out.println(d1);// in output we will get only 15 nos after .
		
					
		
		

	}

}
