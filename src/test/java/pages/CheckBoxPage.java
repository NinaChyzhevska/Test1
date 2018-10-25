package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nina_Chyzhevska on 10/25/2018.
 */
public class CheckBoxPage extends BasePage {

    public CheckBoxPage(WebDriver driver) {
        super(driver, "https://seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(id = "txtAge")
    private WebElement ageText;

    public String singleCheckBox(){
        singleCheckBox.click();
        return ageText.getText();
    }
}
