package TreinamentoSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guilda3 {

    @Test
    public void testeId(){

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("Teste Guilda");
    }
    @Test
    public void testeName(){

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("checkBoxOption2")).click();
    }
    @Test
    public void testeTagName(){

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.tagName("select")).click();
    }
    @Test
    public void testeLinkText(){

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.partialLinkText("Free Access")).click();
    }
    @Test
    public void testeClassName() {

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Alguma coisa");
    }
    @Test
    public void testeXpath(){
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@class='inputs ui-autocomplete-input']")).sendKeys("Teste Xpath");
    }
    @Test
    public void testeCssSelector(){
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("teste css selector");
    }

    @Test
    public void testeComboBox(){
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement elemento = driver.findElement(By.id("dropdown-class-example"));
        Select comboBox = new Select(elemento);

        comboBox.selectByValue("option3");
    }
}
