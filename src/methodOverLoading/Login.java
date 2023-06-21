package methodOverLoading;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void login() {
		System.out.println("Genaral Login");
	}
	public void login(String username, String password) {
		System.out.println("Login with user name and passsword");
	}
	
	public void login(String Mobile, int OTP) {
		System.out.println("Login with mobile number and OTP");
	}
	
	public void login(String username, String password, String Notification) {
		System.out.println("Login with notification");
	}
	
	public void login(String email) {
		System.out.println("Login with Email");
	}
	
	//cab booking
	public void booking() {
		System.out.println("genaral Booking");
	}

	public void booking(String Location) {
		
	}
	
	public void booking(String location, int pincode) {
		
	}
	public void booking(String from, String to, String carType) {
		
	}
	
	//product search in flipcart/Amazon
	//product name
	//Product name with price
	//product name with brand name
	//Product name, brand, price
	//produt name, Brand, price and color
}
