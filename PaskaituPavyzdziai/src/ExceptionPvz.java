
public class ExceptionPvz {

	public static void dalinkDuSkaicius(int a, int b) {
		try {

			System.out.println(a / b);

		} catch (ArithmeticException | NullPointerException e) {
			//
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dalinkDuSkaicius2(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Parametras yra nulis");
		}

		System.out.println(a / b);
	}

	public static void dalinkDuSkaicius3(int a, int b) {
		if (b == 0) {
			throw new RuntimeException("Parametras yra nulis");
		}

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		// dalinkDuSkaicius(5, 0);

		/*
		 * try { dalinkDuSkaicius2(8, 0); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		try {
			dalinkDuSkaicius3(5, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Pabaiga");

		/*
		 * try { if(true){ throw new Exception(); }
		 * 
		 * System.out.println("test"); } catch (Exception e) {
		 * System.out.println("Nutiko kazkas baisauss"); }
		 */

	}

}
