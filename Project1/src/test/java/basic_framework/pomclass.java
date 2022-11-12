package basic_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass 
{
	@FindBy(xpath = "//a[.='Register']")
	private WebElement reg;

	@FindBy(id = "gender-male")
	private WebElement radiobtn;

	@FindBy(id = "FirstName")
	private WebElement fname;

	@FindBy(id = "LastName")
	private WebElement lname;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement psswd;

	@FindBy(id = "ConfirmPassword")
	private WebElement cpsswd;

	@FindBy(id = "register-button")
	private WebElement rbtn;
	
	//---------------add cart ----------------------
	
	@FindBy(xpath = "(//a[@href='/books'])[3]")
	private WebElement book;
	
	@FindBy (xpath = "//a[.='Computing and Internet']/../../div[3]/div[2]/input")
	private WebElement cart;
	
	@FindBy (xpath = "//span[.='Shopping cart']")
	private WebElement shopping_cart;
	
	//---------------login--------------------------
	
	@FindBy (xpath = "//a[.='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement mail;
	
	@FindBy (xpath = "//input[@id='Password']")
	private WebElement pwd;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement log_btn;

	//----------------------------------------------------
	public pomclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//------------------------------------------------------

	public void reg_btn() {
		reg.click();
	}

	public void gender() {
		radiobtn.click();
	}

	public void fn(String f_name) {
		fname.sendKeys(f_name);
	}

	public void ln(String l_name) {
		lname.sendKeys(l_name);
	}

	public void mail(String e_mail) {
		email.sendKeys(e_mail);
	}

	public void password(String pass) {
		psswd.sendKeys(pass);
	}

	public void c_password(String pass) {
		cpsswd.sendKeys(pass);
	}

	public void btn() {
		rbtn.click();
	}
//**********************************************
	public void book_btn() 
	{
		book.click();
	}
	
	public void add_cart()
	{
		cart.click();
	}
	
	public void shop_cart()
	{
		shopping_cart.click();
	}
	//************************************************
	
	public void login()
	{
		login_btn.click();
	}
	public void email(String mailid)
	{
		mail.sendKeys(mailid);
	}
	
	public void pssword(String pwwd)
	{
		pwd.sendKeys(pwwd);
	}
	
	public void login_btn() {
		log_btn.click();
	}

}
