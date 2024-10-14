package teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.FormularioPage;
import pages.HomePage;
import runner.Executa;
import utils.MassaDeDados;

public class FormularioTest {
	HomePage page = new HomePage();
	FormularioPage pages = new FormularioPage();

	MassaDeDados dados = new MassaDeDados();

	@BeforeEach
	public void antesDoTest() {
		Executa.iniciarTest();

	}

	@AfterEach
	public void depoisDoTest() {

		Executa.depoisDoTest();

	}

	@Test
	public void formulario() {
		pages.preencherFormulario(dados.gerarNome(), dados.gerarEmail(), "35998715506000", dados.gerarEndereco(),
				"Alfenas");

	}

	@Test
	public void validarAlert() {
		pages.validaralert("Pop-up aberto após 5 segundos!");

	}

	@Test
	public void clicarTermos() {
		pages.concordarTermos();

	}

	@Test
	public void clicarTermosNao() {
		pages.naoConcodarTermos("Pop-up aberto após 5 segundos!");

	}

	@Test
	public void passarMousse() {

		pages.passarMouse("Você passou o mouse aqui!");

	}

	@Test
	public void clicarDuasVezes() {
		pages.clicarDuasVezes("Você clicou duas vezes!");

	}

}
