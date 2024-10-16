package teste;

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
		pages.acessarFormulario();
		pages.validarAlert("Pop-up aberto após 5 segundos!");

	}

	//@AfterEach
	public void depoisDoTest() {
		Executa.depoisDoTest();

	}

	@Test
	public void formulario() {
		pages.preencherFormulario(dados.gerarNome(), dados.gerarEmail(), "35998715506000", dados.gerarEndereco(),
				"Alfenas", "C:\\Program Files");

	}

	@Test
	public void clicarTermos() {
		pages.concordarTermos();

	}

	@Test
	public void clicarTermosNao() {
		pages.naoConcodarTermos();

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
