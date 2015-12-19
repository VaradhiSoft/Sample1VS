
public class ExHandling {
	public static void main(String[] args) {

		System.out.println("Program started");

		int a = 30;

		int b = 0;

		try {
			int c = a / b;

			System.out.println("Result:" + c);
		} catch (Exception e) {
           System.out.println(" Ex occurred ");
		}

		System.out.println("Program Finished");

	}
}
