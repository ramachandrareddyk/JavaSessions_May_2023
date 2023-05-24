package javaSessions;

public class Login {
	
	String URL;
	String Username;
	String Password;

	public static void main(String[] args) {
		
		Login fb= new Login();
		
		fb.URL="https://www.facebook.com";
		fb.Username="TestUser";
		fb.Password="Test@123";
		
		Login amazon= new Login();
		
		amazon.URL="https://www.amazon.in";
		amazon.Username="AmazonTestUser";
		amazon.Password="Test@123";
		
		Login flipkart= new Login();
		
		flipkart.URL="https://www.flipkart.com";
		flipkart.Username="FlipkartTestUser";
		flipkart.Password="Test@123";

	}

}
