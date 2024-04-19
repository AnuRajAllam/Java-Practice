package javasessions;

public class IncreDecreAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=0;
        //  i = i++ - --i + ++i - i--;// System.out.println(i);
		//int i=0;
		//i=i++ - --i + ++i - i--;
		//System.out.println(i);

		// ******Incremental/Decremental Operators: ******//

				// 1. What will be the output of the following program?
				int i = 11;
		        i = i++ + ++i;
		        System.out.println(i);//24
		        
		        //2.
		        int a1=11, b5=22, c1;
				c1 = a1 + b5 + a1++ + b5++ + ++a1 + ++b5;
				System.out.println("a="+a1);//13
				System.out.println("b="+b5);//24
				System.out.println("c="+c1);//103
				
				//3.
				int j=0;
				j=j++ - --j + ++j - j--;
				System.out.println(j);//0
				
				//4.Incorrect program. cannot convert type boolean to int
				//boolean flg=true;
				//flg++;
				
				//5.
				int x=1,y=2,z=3;
				int m= x-- - y-- - z--;
				System.out.println("x="+x);//0
				System.out.println("y="+y);//1
				System.out.println("z="+z);//2
				System.out.println("m="+m);//-4
				
				//6.
				int p=1,q=2;
				System.out.println(--q - ++p + ++q - --p);//0
				
				//7.dbt in question forgot to initialise last value 	 	
				int r=19, s=29, t=0;
				int u=r-- -s-- - t--;
				System.out.println("r="+r);//18
		        System.out.println("s="+s);//28
		        System.out.println("t="+t);//-1
		        
		        //8.compilation error bcoz at a tym we cannot perform more than one operation.
		        //int  i=11;
		        //int j=--(i++);
		        
		        //9. Guess the value of p1 in the below program?
		        int m1=0,n1=0;
		        int p1=--m1 *--n1*n1--*m1--;
		        System.out.println(p1);//1
		        
		        //10.What will be the output of the following program?
		        int aa1=1;
		        aa1=aa1++ + ++aa1 * --aa1 - aa1--;
		        System.out.println(aa1);//5
		        
		        //11. What will be the output of the following program?
		        //int aa2=11++;
				//in this case it shows the compile tym error as we cannot operate inc/dec operator 
		        //directly on the valu.
		        
		        //12. What will be the output of the following program?
		        int cha='A';
		        System.out.println(cha++);//65
		        
		        //13. What will be the output of the following program?
		        int cha1='A';
		        System.out.println(++cha1);//66
		        
		        //14. What will be the output of the following program?
		        double d = 1.5, D = 2.5;
		        System.out.println(d++ + ++D);//1.5 + 3.5 = 5.0
		        
		        
				
				
				
			
			

	}

}
