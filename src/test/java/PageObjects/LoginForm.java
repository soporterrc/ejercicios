package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LoginForm {

    public WebDriver driver;

    // Declaracion de Objetos

    @FindBy(xpath = "//a[contains(text(),'HERE')]")
    @CacheLookup
    WebElement Link_GoForm;

    @FindBy(xpath = "//input[@type='text']")
    @CacheLookup
    WebElement password;

    //Creating a custom function
    public void highLigh(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

    public void Go_LoginForm() throws InterruptedException {
     //   highLigh(driver,Link_GoForm);

        Link_GoForm.click();
    }

    public void Form_LoginForm (String pass) {
        //   highLigh(driver,Link_GoForm);

        password.click();
        password.clear();
        password.sendKeys(pass);

    }

}
