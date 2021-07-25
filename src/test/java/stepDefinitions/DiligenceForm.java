package stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import PageObjects.LoginForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class DiligenceForm {

    WebDriver driver;
    LoginForm lf;
    String URL  = "https://userinyerface.com/";

    @Given("Open Chrome")
    public void open_chrome() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lf = new LoginForm();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("Enter URL")
    public void enter_url() {driver.get(URL);        }

    @Then("Go To Form")
    public void go_to_form() throws InterruptedException {
        Thread.sleep(Long.parseLong("3000"));
       // loginForm.Go_LoginForm();
        driver.findElement(By.xpath("//a[contains(text(),'HERE')]")).click();
    }

    @Then("User Enter Password {string} And Email {string} And Dominio {string}")
    public void user_enter_password_and_email_and_dominio(String password, String email, String dominio) {
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(password);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(email);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(dominio);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[4]/div/div/div/div[3]/form/div/div[3]/div[4]/div/div/div[2]/span")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[4]/div/div/div/div[3]/form/div/div[3]/div[4]/div/div[2]/div[2]")).click();
    }

    @Then("Check Terms y Conditions")
    public void check_terms_y_conditions() throws InterruptedException {
        Thread.sleep(Long.parseLong("3000"));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[4]/div/div[1]/div/div[3]/form/div[2]/span/label/span/span")).click();
    }

    @Then("Click on Next")
    public void click_on_next() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
    }

    @Then("View Page of This is me")
    public void view_page_of_this_is_me() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[4]/div/div[1]/div/div[3]/h2")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("Choose Three interests")
    public void choose_three_interests() {
        driver.findElement(By.cssSelector(".avatar-and-interests__interests-list__item:nth-child(21) .icon")).click();
        driver.findElement(By.cssSelector(".avatar-and-interests__interests-list__item:nth-child(1) .checkbox__box")).click();
        driver.findElement(By.cssSelector(".avatar-and-interests__interests-list__item:nth-child(8) .checkbox__box")).click();
        driver.findElement(By.cssSelector(".avatar-and-interests__interests-list__item:nth-child(15) .checkbox__box")).click();
    }

    @Then("Upload Image")
    public void upload_image() throws InterruptedException {
        Thread.sleep(Long.parseLong("3000"));
        File file = new File("./src/test/resources/drivers/qa.jpg");
        String path = file.getAbsolutePath();
        driver.findElement(By.linkText("upload")).sendKeys(path);
        driver.findElement(By.cssSelector(".button--stroked")).click();
    }
}
