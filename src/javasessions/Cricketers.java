package javasessions;

public class Cricketers {
	//--name, age, team name, DOB, gender, Strike Rate
	
	String name;
	int age;
	String teamName;
	String DOB;
	char gender;
	double StrikeRate;
	
	public Cricketers(String name,int age,String teamName,String DOB,char gender,double StrikeRate) {
		this.name=name;
		this.age=age;
		this.teamName=teamName;
		this.DOB=DOB;
		this.gender=gender;
		this.StrikeRate=StrikeRate;
		
	}

	@Override
	public String toString() {
		return "Cricketers [name=" + name + ", age=" + age + ", teamName=" + teamName + ", DOB=" + DOB + ", gender="
				+ gender + ", StrikeRate=" + StrikeRate + "]";
	}
}
