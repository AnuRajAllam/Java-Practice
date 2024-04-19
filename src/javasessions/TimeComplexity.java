package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TC is represented by Big O
		
		int i=1;
		System.out.println(i);
// here the TC is O(1)
		
		// for loops TC is O(n) which is a linear eq
		for(int k=1;k<=5;k++) {// for this lin tc is(1+n+n)
			System.out.println(k);//here tc is n
			//1+n+n+n=1+3n=3n=n=O(n)
			
			int p=0;//this will exec 1 tym
		while(p>=5) {//this is n times
			System.out.println(p);//this is n tymes
			p++;//this is n tymes
			//1+n+n+n=1+3n which is linear equ simplified to O(n)
		}
			
		int x[]= {1,2,3,4,5};//1
		for(int e : x) {//n
			System.out.println(e);//n
			//1+n+n=2n+1=which is linear eq=O(n)
		}
		
		//for nested for loop TC is O(n^2) which is quadratic equ
		
		for(int a=1;a<=5;a++) {//1+n+n
			for(int b=1;b<=5;b++) {//1+n+n+n
				System.out.println(a+ " "+b);
				
				//(1+2n)(1+3n)=1+2n+3n+6n^2=1+5n+6n^2
				//n(5+6n)=n^2=0(n^2)
			}
			
			//for two times nested loop TC is O(n^3)
			for(int c=1;c<=5;c++) {//1+n+n
				for(int d=1;d<=5;d++) {//1+n+n
					for(int e=1;e<=5;e++) {//1+n+n+n
						System.out.println(c+ " "+d+" "+e);
				//(1+2n)(1+2n)(1+3n)
			//(1+2n+2n+4n^2)(1+3n)=(1+4n+4n^2)(1+3n)=1+4n+4n^2+3n+12n+12n^3
						//1+19n+4n^2+12n^3=n(19+4n+12n^2)==this is cubic equ
						//n(n+n^2)=//n^3==O(n^3)
						
					}
				}
					
				}
					
				
		}
			
		}
		
	}

}
