package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;


public class AssertSamples extends Base {
	
	@Test
	public void verifyBackgroundcolorOfGetTotalButton()
	{
		String expectedBackgroundColor="#007bff";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Boolean isGetTotalButtonDisplayed=getTotalButton.isDisplayed();
		assertTrue(isGetTotalButtonDisplayed,"GetTotal button is not available");
		String getTotalBackgroundcolor=getTotalButton.getCssValue("background-color");
		String convertedToHex=Color.fromString(getTotalBackgroundcolor).asHex();
		assertEquals(expectedBackgroundColor,convertedToHex,"Background color of GetTotal button is not"+expectedBackgroundColor);
	}
	
	@Test
	public void verifyBorderColorOfGetTotalButton()
	{
		String expectedBorderColor="#007bff";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
        String getTotalBorderColor=getTotalButton.getCssValue("border-color");
		String convertedToHex=Color.fromString(getTotalBorderColor).asHex();
		assertEquals(expectedBorderColor,convertedToHex,"Bordercolor of GetTotal button is not"+expectedBorderColor);
	}
	
	@Test
	public void verifyFontSizeOfGetTotalButton()
	{
		String expectedFontSize="16px";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Boolean isGetTotalButtonIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(isGetTotalButtonIsDisplayed,"GetTotal button is not available");
	    String getTotalFontSize=getTotalButton.getCssValue("font-size");
	    assertEquals(expectedFontSize,getTotalFontSize,"Fontsize of GetTotal button is not"+expectedFontSize);
	}
	@Test
	public void assertExample()
	{
		int a=5,b=6;
		String c=null;
		String d="abc";
		assertNotEquals(a,b,"a and b are equal");
		assertNull(c,"c is not null"); 
		assertNotNull(d,"d is null");
	}
	

}
