package Acti_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_class1 {
@FindBy(xpath="(//input[@class='textField'])[1]")private WebElement UName;
@FindBy(xpath = "(//input[@class='textField pwdfield'])[1]")private WebElement PWD;
@FindBy(xpath = "//div[text()='Login ']")private WebElement Loginbtn;

public Login_class1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void enterUName(String username ) {
	UName.sendKeys(username);
}
public void enterPWD(String password) {
	PWD.sendKeys(password);
}
public void clickLoginbtn() {
	Loginbtn.click();
}
}
