
public class SwitchSakinioPavyzdys {
	
	public static void spausdinkPatogiai(int sk){
		System.out.println("  Ivestas skaicius " + sk);
	}

	public static void main(String[] args) {

		int sk = 7;

		switch (sk) {
		case 1:
			spausdinkPatogiai(1);
			break;
		case 2:
			spausdinkPatogiai(2);
			break;
		case 3:
			spausdinkPatogiai(3);
			break;
		case 5:
			spausdinkPatogiai(5);
			break;
		default:
			System.out.println("Skaicius nezinomas");
		}

		if (sk == 5) {
			System.out.println("Penki");
		} else if (sk == 10) {
			System.out.println("Desimt");
		} else {
			System.out.println("Skaicius nezinomas");
		}

		String s = "abc";
		switch (s) {
		case "abc":
			System.out.println("abecele");
			break;
		case "test":
			System.out.println("test pavyko");
			break;
		default:
			break;
		}
		
		
		

		//
		//
	}
}
