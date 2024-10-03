package fb_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class fb_registration {
     WebDriver driver;
	//Step 1
    
     @FindBy(xpath = "(//a[@role = 'button'])[2]")
	WebElement createnewaccount;
	
	
     @FindBy(name="firstname")
	WebElement FirstName;

   @FindBy(name="lastname")
	WebElement Lname;
	
   @FindBy(name =("reg_email__"))
	WebElement emailOrPhnNumber;
	
   @FindBy(id="password_step_input")
	WebElement password;
	
   @FindBy(id ="month")
	WebElement birthMonth;
	
	@FindBy(name = "birthday_day")
	WebElement birthDay;
	
	@FindBy(id = "year")
   WebElement BirthYear;	
	
   @FindBy(xpath = "//input[@value = '1']")
	WebElement female;
	
    @FindBy(xpath = "//input[@value = '2']")
	WebElement male;
	
    @FindBy(name = "websubmit")
	WebElement signup;
	
	
	//Step 2 
	
	public void CreateNewAccount()
	{
		createnewaccount.click();
	}
	
	public void firstName() {
		FirstName.sendKeys("sdf");
	}
	

    public void lastName() {
    	Lname.sendKeys("dadddf");
  }
   public void emailOrphone() {
   	emailOrPhnNumber.sendKeys("hkhj@gmail.com");
    }
   public void pwd() {
    	password.sendKeys("sfsdfdsf");
   }
   public void birthmonth() {
       Select s1 = new Select(birthMonth);
       s1.selectByIndex(3);
    }
    public void birthday() {
    	Select s1 = new Select(birthDay);
        s1.selectByIndex(3);
    }
    public void birthYear() 
    {Select s1 = new Select(BirthYear);
     s1.selectByIndex(25);	
    }
   public void female() {
    	female.click();
   }
    public void male() {
    	 male.click();
   }
    public void signup() {
   	 signup.click();
     }     
    //Step 3 
    
    


	public fb_registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	

 	
}



