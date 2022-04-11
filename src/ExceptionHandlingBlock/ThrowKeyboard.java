package ExceptionHandlingBlock;

public class ThrowKeyboard {

	public static void main(String[] args) {
          
		String data = null;
		
		 if (data ==null) {
			 try {
			 throw new Exception("Data not found exception");
		 }
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		 
	}

}
}