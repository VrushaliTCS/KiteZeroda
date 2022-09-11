package Fb_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Sign_up {
	//declare
@FindBy(xpath = "//input[@id='u_b_b_7B']")private WebElement Fname;
@FindBy(xpath = "//input[@id='u_b_d_zy']")private WebElement Lname;
@FindBy(xpath = "//input[@id='u_b_g_5T']")private WebElement MobNo;
@FindBy(xpath = "//input[@id='password_step_input']")private WebElement PWD;

@FindBy(xpath = "//select[@id='day']")private WebElement DD;
@FindBy(xpath = "//select[@id='month']")private WebElement MM;
@FindBy(xpath = "//select[@id='year']")private WebElement YY;

@FindBy(xpath = "(//label[@class='_58mt'])[1]")private WebElement Fmale;
@FindBy(xpath = "(//button[@id='u_b_s_0k'])[1]")private WebElement SignUP;

//initialize
public FB_Sign_up(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//utilization
public void enterFname(String firstname) {
	Fname.sendKeys(firstname);
}
public void enterLname(String lastname) {
	Lname.sendKeys(lastname);
}

public void enterMobNo(String mobile) {
	MobNo.sendKeys(mobile);
}

public void enterPWD(String password) {
	PWD.sendKeys(password);
}


public void enterDD(String date) {
	DD.sendKeys(date);
}

public void enterMM(String month) {
	MM.sendKeys(month);
}

public void enterYY(String year) {
	YY.sendKeys(year);
}

public void enterFmale(String gender) {
	Fmale.sendKeys(gender);
}

public void clickSignUP() {
	SignUP.click();
}

}
