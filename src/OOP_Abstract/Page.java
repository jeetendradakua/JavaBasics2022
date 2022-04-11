package OOP_Abstract;

public abstract class Page {

	//all the method in interface are abstract in nature by default 
	// cannot create the object of abstract class
	//CAN CREATE THE CONSTRUCTOR OF THE CLASS
	
	//can have no abstract method in abstract class -- 0% abstraction
	//can have only  abstract method -- 100% abstraction
	// abstract methods + non abstract methods --partial abstraction
	
	public Page() {
		System.out.println("Page Const...");
	}
	
	public Page(int a) {
		System.out.println("Page Const..."+a);
	}
	
	
	
	
	public abstract void title();
	
	public abstract void url();
	
	
	
	public void timeOut()
	{
		System.out.println("page time out is 10 seconds");
	}
	
	public final void logo()
	{
		System.out.println("page logo");
	}
	
	
}
