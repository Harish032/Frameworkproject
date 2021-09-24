package Mavenproject.Arismavenproject1;

import java.io.IOException;

import org.testng.annotations.Test;

public class GoogleTC extends Base{
	
	 @Test
	    public void TS001() throws IOException
	    {
	       driver=BrowserCall();
	        driver.get("https://www.google.com/");
	    }
}
