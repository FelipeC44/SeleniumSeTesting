package Tests;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LoginTests {

    public WebDriver driver;

    @BeforeTest
public void beforeTest() {

        String url = "https://the-internet.herokuapp.com/login";
        driver = new EdgeDriver();
        driver.navigate().to(url);
    }
    @AfterTest
    public void afterTest() {

        driver.quit();
    }

    @Test
    public void LoginComSucesso() {

        WebDriver driver = new EdgeDriver();
        LoginPage loginPage = new LoginPage(driver);
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

        String usuario = "tomsmith";
        String senha = "SuperSecretPassword!";
        String mensagemEsperada = "Welcome to the Secure Area. When you are done click logout below.";

        loginPage.digitarUsuario(usuario);
        loginPage.digitarSenha(senha);
        loginPage.clicarLogin();
        String mensagemRecebida = secureAreaPage.retornaMensagem();

        Assert.assertEquals(mensagemRecebida, mensagemEsperada);
    }
}
