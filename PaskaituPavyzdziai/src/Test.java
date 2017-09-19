
public class Test {
	
	public int skaicius = 5;

	
	public static Test pakeiskTest(Test test){
		test = new Test();
		test.skaicius = 1000;
		return test;
	}
	
	public static void pakeiskInt(int sk){
		sk++;
	}

	public static void main(String[] args) {
		//int skaicius = 5;
		//pakeiskInt(skaicius);
		
		Test t = new Test();
		
		System.out.println(t.skaicius);
		
		t = pakeiskTest(t);
		
		System.out.println(t.skaicius);

	}

}
