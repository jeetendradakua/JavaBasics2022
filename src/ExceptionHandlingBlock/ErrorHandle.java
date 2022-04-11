package ExceptionHandlingBlock;

public class ErrorHandle {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
			int i = 9 / 0; //AE

		} 
//		catch (Error e)
		catch (Throwable e)
		
		{
			e.printStackTrace();
		}
		System.out.println("Bye");

	}

}
