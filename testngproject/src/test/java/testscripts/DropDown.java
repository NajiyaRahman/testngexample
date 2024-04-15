package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base {
	
	
	@Test
	public void verifySelectInputDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
	}
	
	@Test
	public void verifyTwoInputFields()
	{
		WebElement multipleDropDown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectForMultiple=new Select(multipleDropDown);
		List <WebElement> options=selectForMultiple.getOptions();
		int size=options.size();
		Boolean isMultipleSelectPosssible=selectForMultiple.isMultiple();
		selectForMultiple.selectByValue("Red");
		selectForMultiple.selectByValue("Yellow");
		
		
	}

}
