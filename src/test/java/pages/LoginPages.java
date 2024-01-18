package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {

    private WebDriver driver;
    private String url = "https://www.saucedemo.com/";
    private By username = By.cssSelector("*[data-test=\"username\"]");
    private By password = By.cssSelector("*[data-test=\"password\"]");
    private By btnLogin = By.cssSelector("*[data-test=\"login-button\"]");
    private By mochila = By.id("add-to-cart-sauce-labs-backpack");
    private By carrinho = By.id("shopping_cart_container");
    private By verificarProdutoNoCarrinho = By.cssSelector(".inventory_item_name");
    private By checkout = By.id("checkout");
    private By cmpFirstName = By.id("first-name");
    private By cmpLastName = By.id("last-name");
    private By cmpZip = By.id("postal-code");
    private By btnContinue = By.id("continue");
    private By btnFinish = By.id("finish");
    private By msg = By.xpath("//h2[normalize-space()='Thank you for your order!']");

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void url() {

        driver.get(url);
    }

    public void inserirUsuarioSenha(String usuario, String senha) {
        driver.findElement(username).click();
        driver.findElement(username).sendKeys(usuario);
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(senha);

    }

    public void btnLogin() {

        driver.findElement(btnLogin).click();
    }

    public void addMochila() {

        driver.findElement(mochila).click();
    }

    public void verCarrinho() {

        driver.findElement(carrinho).click();
    }

    public void verificarProdutoNoCarrinho() {
        Assert.assertTrue(driver.findElement(verificarProdutoNoCarrinho).isDisplayed());
    }

    public void btnCheckout() {
        driver.findElement(checkout).click();
    }

    public void preenchimentoDosCampos(String firstName, String lastName, String zip) {
        driver.findElement(cmpFirstName).sendKeys(firstName);
        driver.findElement(cmpLastName).sendKeys(lastName);
        driver.findElement(cmpZip).sendKeys(zip);
        driver.findElement(btnContinue).click();

    }

    public void btnFinish(){
        driver.findElement(btnFinish).click();
    }

    public void mensagemSucesso(){
        Assert.assertEquals("Thank you for your order!", driver.findElement(msg).getText());
    }
}
