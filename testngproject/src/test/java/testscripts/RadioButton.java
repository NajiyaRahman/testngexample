package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base {
	
	@Test
	public void verifyRadioButtonDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		Boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		assertFalse(isMaleRadioButtonSelected,"Male radio button is selected");
		maleRadioButton.click();
		Boolean isMaleRadioButtonSelectedLater=maleRadioButton.isSelected();
		assertTrue(isMaleRadioButtonSelectedLater,"Male radio button is not selected");
		
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		Boolean isFemaleRadioButtonSelected=femaleRadioButton.isSelected();
		assertFalse(isFemaleRadioButtonSelected,"Female radio button is selected");
		
		String gender="'Male'";
		String expected=("Radio button ")+gender+(" is checked");
		WebElement showSelectValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectValueButton.click();
		WebElement messageText=driver.findElement(By.xpath("//div[@id='message-one']"));
		String selectedMessageText=messageText.getText();
		Boolean isMessageTextDisplayed=messageText.isDisplayed();
		assertTrue(isMessageTextDisplayed,"Show selected value text is not displayed");
		assertEquals(expected,selectedMessageText,"Message of show selected value is not" +expected);
		
		
	}

}
