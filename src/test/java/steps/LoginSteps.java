package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseTest;
import pages.LoginPages;
import pages.Utils;
import java.io.IOException;


public class LoginSteps extends BaseTest {

    private LoginPages loginPages;

    private Utils utils;

    @Before
    public void setUp() {
        super.setUp();
        loginPages = new LoginPages(driver);
        utils = new Utils(driver);


    }
    @After
    public void tearDown() {

        super.tearDown();
    }


    @Given("que acesso a tela do login")

    public void queAcessoATelaDoLogin() {

        loginPages.url();

    }


    @When("preencho {string} e {string}")
    public void preenchoE(String usuario, String senha) {

        loginPages.inserirUsuarioSenha(usuario, senha);
        loginPages.btnLogin();
    }

    @Then("devo ver a tela de dashboard")
    public void devoVerATelaDeDashboard() throws IOException{
        utils.imprimirEvidencia("screenshot1");

    }

    @And("adiciono mochila")
    public void adicionoMochila() {
        loginPages.addMochila();

    }

    @Then("devo ver a mochila no carrinho")
    public void devoVerAMochilaNoCarrinho() throws IOException{
        loginPages.verCarrinho();
        loginPages.verificarProdutoNoCarrinho();
        utils.imprimirEvidencia("screenshot2");

    }
    // CT03

    @Given("acesso a minha conta com {string} e {string}")
    public void acessoAMinhaContaComE(String usuario, String senha) {
        loginPages.url();
        loginPages.inserirUsuarioSenha(usuario, senha);
        loginPages.btnLogin();
    }

    @When("entro no meu carrinho")
    public void entroNoMeuCarrinho() {
        loginPages.verCarrinho();
        loginPages.btnCheckout();
    }

    @And("preencho {string} , {string} e {string}")
    public void preenchoE(String firstName, String lastName, String zip) {
        loginPages.preenchimentoDosCampos(firstName, lastName, zip);

    }

    @And("finalizo minha compra")
    public void finalizoMinhaCompra() {
        loginPages.btnFinish();
    }

    @Then("devo ver a seguinte mensagem Thank you for your order !")
    public void devoVerASeguinteMensagemThankYouForYourOrder() throws IOException {
        loginPages.mensagemSucesso();
        utils.imprimirEvidencia("screenshot3");
    }
}
