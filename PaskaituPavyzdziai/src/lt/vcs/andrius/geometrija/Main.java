package lt.vcs.andrius.geometrija;

public class Main {

	public static void main(String[] args) {
		Taskas taskas1 = new Taskas();
		
		int [] m = {8,9,6};
		int [] m2 = {8,9,6};
		
		System.out.println(m.equals(m2));
		
		
		for(int i = m.length-1;i>=0;i--){
			System.out.println(m[i]);
		}

	}

}
