package TreinamentoSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Guilda4 {

    @Test
    public void TesteSemWait(){
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[text()='Start']")).click();

        By localizador = By.xpath("//*[text()='Hello World!']");
        String resultado = driver.findElement(localizador).getText();
    }
    @Test
    public void TesteComWait() {

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[text()='Start']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By localizador = By.xpath("//*[text()='Hello World!']");
        String resultado = wait.until(ExpectedConditions.visibilityOfElementLocated(localizador)).getText();

    }
}
