package javasessions;

public class CallbyRefConcept {
	String name;
	int age;
	public static void getInfo(CallbyRefConcept t1) {
		System.out.println(t1.name);
		t1.name="Raju";
		System.out.println(t1.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyRefConcept obj=new CallbyRefConcept();
		obj.name="anu";
		obj.age=33;
		CallbyRefConcept.getInfo( obj);
		System.out.println(obj.name);
	}

}
