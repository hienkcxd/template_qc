package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingAdult {
    WebDriver webDriver;

    @Given("^den trang dat ve$")
    public void openPage() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://flight-vnbk.vercel.app/vi");
        webDriver.manage().window().maximize();
    }

    @When("^nhap thong tin$")
    public void inpInfo() {
    }

    @Then("^nhan tim kiem va den trang danh sach$")
    public void clickBtn() {
    }
}
