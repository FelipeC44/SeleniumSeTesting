package TreinamentoSelenium;

import org.junit.Assert;
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
    @Test
    public void loginComSucesso(){
        /* acessar pagina de login do heroku app
           realizar login com usuario e senha
           clicar no botao sing in
           validar mensagem de area restrita
         */
        String url = "https://the-internet.herokuapp.com/login";
        String usuario = "tomsmith";
        String senha = "SuperSecretPassword!";
        String mensagemEsperada = "Welcome to the Secure Area. When you are done click logout below.";
        String parteAlertaEsperado = "logged";

        WebDriver driver = new EdgeDriver();
        driver.navigate().to(url);
        driver.findElement(By.id("username")).sendKeys(usuario);
        driver.findElement(By.id("password")).sendKeys(senha);
        driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']")).click();
        String mensagemRecebida = driver.findElement(By.className("subheader")).getText();
        //ou
        String alertaRecebido = driver.findElement(By.id("flash")).getText();
        driver.quit();

        Assert.assertEquals(mensagemRecebida, mensagemEsperada);
        //ou
        Assert.assertTrue(alertaRecebido.contains(parteAlertaEsperado));

    }

}
