package encapsulation;

public class WebDriver {
	
	
	public void launchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			launchCrome();
		}else if(browser.equals("firefox")) {
			launchFireFox();
		}else {
			System.out.println("please pass the correct browser name ");
		}
		
	}
	
	
	private void launchCrome() {
		System.out.println("checking browser version");
		System.out.println("Checking OS Version");
		System.out.println("Launch Chrome");
	}
	
	private void launchFireFox() {
		System.out.println("checking browser version");
		System.out.println("Checking OS Version");
		System.out.println("Launch Firefox");
	}

}
