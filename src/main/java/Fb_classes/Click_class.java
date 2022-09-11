package Fb_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_class {
@FindBy(xpath = "//a[text()='Create New Account']")private WebElement newAcct;

public Click_class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void clicknewAcct() {
	newAcct.click();
}
}
