package javasessions;

public class ConditionalOpeAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Q1.a : Find out the greatest number out of three different given numbers:
		int i1 = 100, i2 = 104, i3 = 87, i4=97;
		//************method 1:
		if ((i1 > i2) && (i1 > i3)) {
			System.out.println("The greatst number is: " + i1);

		} else if ((i2 > i3)) {
			System.out.println("The greatest number is: " + i2);
		} else {
			System.out.println("The greatest number is: " + i3);
		}
		
		//***********method 2:
	/*	if (i1 > i2) {
			if (i1 > i3) {
				if(i1>i4) {
				System.out.println("The greatst number is: " + i1);
				}
			}
		} else if (i2 > i3) {
			if(i2>i4) {
			System.out.println("The greatest number is: " + i2);
			}

		} else if(i3>i4) {
			System.out.println("The greatest number is: " + i3);

		}
		else {
			System.out.println("The greatest number is: " + i4);

		}*/
		
		
		//1b. Find out the greatest number out of four different given numbers:
		
		if ((i1>i2) && (i1>i3) && (i1>i4))
		{
			System.out.println("The greatst number is: " + i1);
		}
		else if((i2>i3) && (i2>i4)) {
			System.out.println("The greatest number is: " + i2);
		}
		else if((i3>i4)) {
			System.out.println("The greatest number is: " + i3);
		}
		else {
			System.out.println("The greatest number is: " + i4);
			
		}
		
		//2. Write a Java program to test a number is positive or negative.
		int num1=35, num2=-11;
		if(num1>=0) {
			System.out.println("The positive number is: "+num1);
		}
		else {
			System.out.println("The negative number is: "+num1);
		}
		if(num2>=0) {
			System.out.println("The positive number is: "+num2);
		}
		else {
			System.out.println("The negative number is: "+num2);
		}

		//3. WAP to check number is odd or even using If - Else
		int n=1068;
		if(n%2==0)
		{
			System.out.println(n+ " is even number");
		}
		else {
			System.out.println(n+ " is odd number");
		}
		
		//4.WAP to check given alphabet character is Vowel or Consonant using Switch - Case
	    char c1='S';
		switch (c1) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		case 'A':
			System.out.println("A is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;
			

		default:
			System.out.println(c1 +" is a consonant");
			break;
		}
		
		//5. WAP to run your test cases in a specific environment like:
		//QA, Stage, Dev, UAT, Prod using switch
		
		String env="Prod";
		switch (env) {
		case "QA":
			System.out.println("QA enviornment");
			break;
		case "Stage":
			System.out.println("Stage enviornment");
			break;
		case "Dev":
			System.out.println("Dev enviornment");
			break;
		case "UAT":
			System.out.println("UAT enviornment");
			break;
		case "Prod":
			System.out.println("Prod enviornment");
			break;

        default:
        	System.out.println("Please pass the right environment");
			break;
		}
		
		//6a. WAP to book the specific type of car from the Uber app using Switch - Case.
		//a.Car Type: Mini, Sedan, SUV, Premium
        //b.If user passes wrong car type, print please select the right car type
		String carType="sedan";
		//String c=cartype.to(cartype);
		switch (carType) {
		case "Mini":
			System.out.println("Type of the car is Mini");
			break;
		case "Sedan":
			System.out.println("Type of the car is Sedan");
			break;
		case "SUV":
			System.out.println("Type of the car is SUV");
			break;
		case "Premium":
			System.out.println("Type of the car is Premium");
			break;


		default:
			System.out.println("please select the right car type");
			break;
		}
		
		//7.WAP to launch browsers using If-ElseIf and Switch Case.
        //a.Browser: Chrome/Firefox/IE/Safari
        //b.If user passes wrong browser, print please pass the right browser name
		//**********switch case************
		String browser = "advf";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome browser is launched");

			break;
		case "firefox":
			System.out.println("Firefox browser is launched");

			break;
		case "ie":
			System.out.println("IE browser is launched");

			break;
		case "safari":
			System.out.println("Safari browser is launched");

			break;

		default:
			System.out.println("please pass the right browser name");
			break;
		}
		
		//*******************If- elseif********
		//String browser1="chrome";

			if(browser=="chrome") {
				System.out.println("chrome is launched");
			}else if(browser=="firefox") {
				System.out.println("FF is launched");
			}else if(browser=="ie") {
				System.out.println("IE is launchd");
			}else if(browser=="safari") {
				System.out.println("safari is launchd");
			}else{
				System.out.println("please enter valid browser");
			}
		
		
		
		//we can apply switch case on int, string, byte and long.
		//we cannot apply on boolean and floating points,long
		short lnum=20;
		switch (lnum) {
		case 20:
			System.out.println("20 is short");
			break;

		default:
			break;
		}
		
		//8.WAP to define the interest rate on the basis of Loan type using Switch Case
          //a.Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
            //i.For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR
		String loanType="cg Loan";
		//String loan=loanType.equalsIgnoreCase(loanType);
		int salary=4000;
		double interestRate=0;
		switch (loanType) {
		case "Car Loan":
			interestRate = 6.5;

			break;
		case "Housing Loan":
			if (salary < 35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
				break;
				//return;
			} else {
				interestRate = 10.5;
			}

			break;
		case "Personal Loan":
			interestRate = 8.5;

			break;
		case "Education Loan":
			interestRate = 9.5;

			break;

		default:
			System.out.println("please select the valid loan");
			break;
			//return;
		}
		System.out.println("The interest rate for "+ loanType + " is " + interestRate +"%");
	}
}
