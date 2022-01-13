package luminoree;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjectspackage.CurrencyRatesPageObjects;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.screenshot;
@Listeners(luminoree.Listeners.class)
public class CurrencyRatesTest {
static  String path=System.getProperty("user.dir");

@Test
public void getBuyValue() throws IOException, InterruptedException {
    CurrencyRatesPageObjects po=new CurrencyRatesPageObjects();
    FileInputStream fis=new FileInputStream(path +"/src/main/java/Utilities/testdata.properties");
    Properties prop=new Properties();
    prop.load(fis);
open(prop.getProperty("URL"));
po.iselltextbox.shouldBe(visible, Duration.ofSeconds(120));
po.iselltextbox.sendKeys(prop.getProperty("Amount"));
po.currencyselectdropdown.click();
    List<WebElement>countries= WebDriverRunner.getWebDriver().findElements(By.xpath("//div[@class='currency-select-menu']/button"));
    for(WebElement country:countries)
    {
        if (country.getText().equalsIgnoreCase(prop.getProperty("Currency")))

        {
country.click();
        }
    }
System.out.println("The I Buy Value for the Inserted I Sell Value is " +po.ibuytextbox.getValue());

    String pngFileName = screenshot("CurrencyRatesPageScreenshot");

}
}
