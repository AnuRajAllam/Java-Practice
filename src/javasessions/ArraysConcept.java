package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays non-primitive data type.
		//Two major limitations
		//Arrays can store same kind of data. it can hold similar data type.
		//Arrays size is fixed: static Array
		//Use case:for static array
		//book my show--200 seats it is static
		//flight booking---300 seats
		//Months drop down
		//big basket: caegories
		//int p[]= {1,2,3};
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		//To fid the length of array
		System.out.println(i.length);
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);array index out of boundexception
		//System.out.println(i[-1]);array index out of boundexception
		System.out.println(i);//OP: is some random value the address od i
		System.out.println(Arrays.toString(i));//print all the values, but cannot write any logic
		
		//print the values of array
		for(int k=0;k<=3;k++) {
			System.out.println(i[k]);
		}
		
		//creating short array
		short sh[]=new short[3];
		System.out.println("length= "+sh.length);
		System.out.println("LowestIndex= "+0);
		System.out.println("HighestIndex= "+(sh.length-1));
		System.out.println(Arrays.toString(sh));//OP:[0,0,0]default it assumes 0
		sh[0]=10;System.out.println(Arrays.toString(sh));//OP:[10,0,0]default it assumes 0
		sh[1]=40;
		sh[2]=30;
		for(int p=0; p<=sh.length-1; p++) {
			System.out.println(sh[p]);
		}
		//int x[]=new int[];
		
		//char array
		char ch[]=new char[4];//range 0-2
		System.out.println(ch[0]);//OP: space , bcoz default value of char is empty space
		ch[0]='a';
		ch[1]='1';
		ch[2]='$';
		ch[3]=98;
		
		System.out.println(Arrays.toString(ch));//OP:[a,1,$,b]
		
		//float array:
		float fh[]=new float[2];
		fh[0]=12.33f;
		fh[1]=100;
		System.out.println(Arrays.toString(fh));//OP: [12.33, 100.0]
		
		//long array
		long l[]=new long[2];
		l[0]=123131;
		System.out.println(Arrays.toString(l));//[123131, 0]
		
		double d[]=new double[2];
		d[0]=12.33;
		//d[1]=100;
		System.out.println(Arrays.toString(d));//OP: [12.33, 0.0]
		
		
		//Object array: It can store any kind of data.
		//size is 
        Object empData[]=new Object[5];
        System.out.println(Arrays.toString(empData));//OP:[null, null, null, null, null]
        //The default value of object array is null
        
        empData[0]="Anusha";
        empData[1]=30;
        empData[2]=25.33;
        empData[3]='f';
        empData[4]=true;
        
        System.out.println(Arrays.toString(empData));//OP: [Anusha, 30, 25.33, f, true]
        System.out.println(empData.length);//OP:5
        
        for(int y=0;y<=empData.length-1;y++) {
        	System.out.println(empData[y]);
        }
        
        //String array
        String product[]=new String[3];
        product[0]="Mac pro";
        product[1]="Mac air";
        product[2]="ipad";
        for(int k=0; k<=product.length-1;k++) {
        	System.out.println(product[k]);//OP:
        	if(product[k]=="Mac air") {
        		System.out.println("Out of stock");
        	}
        	
        	}
        for(int y=product.length-1; y>=0; y--) {
        	System.out.println(product[y]);
        }
		
	}

}
