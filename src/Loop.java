import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Loop {
	WebDriver driver;
	public void hooverOverloop(List<WebElement> element) {
		int msize =element.size();
		Actions action = new Actions(driver);
		for(int i=1;1<=msize;i++) {
			action.moveToElement(element.get(i)).build().perform();
		
		
		
//		action.moveToElement(element)
//		WebElement element=driver.findElement(By.xpath("//nav[@class='MegaMenu_nav__1vWhM ravenDesktopNav']/ol/li"));
//	action.moveToElement(element).build().perform();
	}
	}
}

