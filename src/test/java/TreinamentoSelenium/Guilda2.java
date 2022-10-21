package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Guilda2 {

    @Test
    public void instanceDriver()
    {
        // Abre o browser
        WebDriver driver = new EdgeDriver();

    }

    @Test
    public void abrirGoogle() {

        // Abrir o browser e navegar até a página do Google
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
    }

    @Test
    public void atualizarOGoogle() {
        // Abrir o browser, navegar até o Google e atualizar a página do Google
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
    }
    @Test
    public void retornaParaPaginaGoogle() {
        //abrir o browser na página Google, ir para Gmail e voltar para o Google
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().forward();
    }
    @Test
    public void fechaBrowser() {
        // Abrir o browser, navegar até o Google e fechar o browser
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.quit();
    }
    @Test
    public void obtemTituloPagina() {
        /*Abrir o browser e navegar até a página
        obter o titulo
        realizar a validação se o titulo está correto */
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
        String titulo = driver.getTitle();
        driver.quit();

        Assert.assertEquals(titulo, "Google");
    }
    @Test
    public void obtemTituloPaginaFails() {
        /*Abrir o browser e navegar até a página
        obter o titulo
        realizar a validação se o titulo está correto */
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com/");
        String titulo = driver.getTitle();

        Assert.assertEquals(titulo, "google");
        driver.quit();
    }
    @Test
    public void obtemURLPagina()
    {
        /*Abrir o browser, navegar ate a pagina do Google
        obter Url atual
        realizar a validação se a Url está correta */

        String url = "https://www.google.com/";

        WebDriver driver = new EdgeDriver();
        driver.navigate().to(url);
        String urlRecebida = driver.getCurrentUrl();

        Assert.assertEquals(urlRecebida, url);
        driver.quit();
    }
    @Test
    public void obtemURLPaginaFails()
    {
        /*Abrir o browser, navegar ate a pagina do Google
        obter Url atual
        realizar a validação se a Url está correta */

        String url = "https://www.google.com/";
        String urlEsperada = "https://www.google.com.br/";

        WebDriver driver = new EdgeDriver();
        driver.navigate().to(url);
        String urlRecebida = driver.getCurrentUrl();

        Assert.assertEquals(urlRecebida, urlEsperada);
        driver.quit();
    }
    @Test
    public void obtemPageSourceDaPagina(){
        /* abrir o browser, navegar ate a pagina do Google
        obtem o resources da pagina
        exibir no log o PageSource */

        String url = "https://www.google.com/";

        WebDriver driver = new EdgeDriver();
        driver.navigate().to(url);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }
}
