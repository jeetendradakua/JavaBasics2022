package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		
      // builder pattern  (is method chaining also)
		
		ECommApp obj = new ECommApp();
		obj.login("jeetu@gmail.com","jete13")
		.search("Imac")
		 .addToCart("Imac")
		  .doPayment("452", 466)
		   .genarateId()
	        .logOut();
		
		//
		
		obj.login("jeetu@gmail.com","jete13")
		 .search("toy")
		  .addToCart("toy")
		   .logOut();
		
		//
		
		obj.login("jeetu@gmail.com","jete13")
		.logOut();
		
		//
		
		obj.login("jeetu@gmail.com","jete13")
		 .addToCart("toy")
		  .genarateId()
		   .search("shirt")
		    .logOut();
		
		
		
		
		
		
		
	}
}	
		