package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//to avoid illegal state exception
		FirefoxDriver driver = new FirefoxDriver();//to launch firefox browser
	

	}

}
