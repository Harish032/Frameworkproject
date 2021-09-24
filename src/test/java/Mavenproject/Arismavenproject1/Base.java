package Mavenproject.Arismavenproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@Test
	public WebDriver BrowserCall() throws IOException
	{
		Properties Properties =new Properties ();
		FileInputStream fis= new FileInputStream("C:\\Users\\00004946\\eclipse-workspace\\Arismavenproject1\\Data.properties");
		Properties.load(fis);
		String vBrowser=Properties.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Chrome browser is running");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
			driver=new ChromeDriver();
	     
	     
		}
		else if (vBrowser.equalsIgnoreCase("Edge"))
		{
			System.out.println("Edge browser is running");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\msedgedriver.exe");
		     driver=new EdgeDriver();
		  			 
		}
		else
		{
			System.out.println("invalid  browser is running");
		}
		return driver;
	}
	

}
