package pageobjectspackage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CurrencyRatesPageObjects {

   public SelenideElement iselltextbox=$(By.xpath("(//input[@class='control-input-input'])[1]"));
   public SelenideElement currencyselectdropdown=$(By.xpath("(//span[@class='currency-select-value'][text()='EUR'])[1]"));
   public SelenideElement ibuytextbox=$(By.xpath("(//input[@class='control-input-input'])[2]"));
}
