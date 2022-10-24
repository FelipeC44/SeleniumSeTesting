package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    //Mapping
    By mensagemField = By.className("subheader");

    //actions

    public String retornaMensagem() {
        return driver.findElement(mensagemField).getText();

    }

}
