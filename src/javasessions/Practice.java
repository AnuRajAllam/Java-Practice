package javasessions;

public class Practice {

	public static void main(String[] args) {
		//char c='l';
		String loanType="Housing Loan";
		int salary=35000;
		double interestRate=0.0;
		switch (loanType) {
		case "Car Loan": {
			interestRate=2.5;
			System.out.println(loanType + " interset rate is" +interestRate);
break;
		}
		case "Housing Loan": {
			if(salary<35000) {
				System.out.println("Not applicable for housing loan");
				break;
			}
			else {
				interestRate=3.5;
			System.out.println(loanType + " interset rate is" +interestRate);
			break;
			}

		}

		case "Personal Loan": {
			interestRate=4.5;
			System.out.println(loanType + " interset rate is" +interestRate);
break;
		}

		case "Education Loan": {
			interestRate=5.5;
			System.out.println(loanType+ " interset rate is" +interestRate);
break;
		}

				
		default:
			System.out.println(loanType + " Please enter the correct loan type");
			break;
		}
			
		
}
}
