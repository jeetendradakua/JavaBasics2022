package ExceptionHandlingBlock;

public class TryCatchBlock {

	 int age;

	public static void main(String[] args) {

		System.out.println("A");

		System.out.println("A");

		System.out.println("A");

		int a[] = new int[3];
		TryCatchBlock obj= new TryCatchBlock();
		obj = null;

		try {
			int i = 9 / 0;// AE
			a[5] = 10; // AIOB
			obj.age = 10; // NPE
			System.out.println("Hello");
			System.out.println("Hello");
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB exception is coming...");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		
		catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

}
