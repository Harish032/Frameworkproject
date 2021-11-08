package Mavenproject.Arismavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demopush {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(500);
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
	        Thread.sleep(500);
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        Thread.sleep(500);
	        driver.close();
	}

}
