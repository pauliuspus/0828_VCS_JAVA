package lt.vcs.andrius.enumpvz;



enum Puodeliai{
	Latte, Capuccino, Black;
}

public class Main {
	public static void main(String[] args) {
		System.out.println(Puodeliai.valueOf("Black"));
		
		

	}
}
