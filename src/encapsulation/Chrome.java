package encapsulation;

public class Chrome {

	public void launchChromeBrowser() {
		browserVersion();
		browserMode();
		browserOSVersion();
		ramSpace();
		
		System.out.println("chrome browser loaunched");
	}
	
	
	
	
	private void browserVersion() {
		System.out.println("Check browser version....");
	}
	
	private void browserOSVersion() {
		System.out.println("Check browser OS Version....");
	}
	
	private void ramSpace() {
		System.out.println("Check RAM Space....");
	}
	
	private void browserMode() {
		System.out.println("Check Browser Mode...");
	}
}
