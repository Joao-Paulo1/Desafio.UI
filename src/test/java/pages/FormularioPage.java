package pages;

import elementos.ElementosFormulario;
import metodos.Metodos;

public class FormularioPage {

	Metodos metodo = new Metodos();
	ElementosFormulario el = new ElementosFormulario();

	public void acessarFormulario() {
		metodo.clicar(el.formulario);

	}

	public void preencherFormulario(String nome, String email, String telefone, String endereco, String cidade,
			String upload) {

		metodo.escrever(el.nome, nome);
		metodo.escrever(el.email, email);
		metodo.escrever(el.telefone, telefone);
		metodo.escrever(el.endereco, endereco);
		metodo.escrever(el.cidade, cidade);
		metodo.uploadDeArquivo(el.upload, upload);
		metodo.clicar(el.btnEnviarForm);
		metodo.validarTexto(el.msgDadosEnviados, "Dados Enviados");

	}

	public void concordarTermos() {
		try {

			metodo.clicar(el.concordatermos);
			System.out.println("Concordar Termos Executado com sucesso");
		} catch (Exception e) {
			System.out.println("Concordar termos Não executado: " + e.getMessage());
		}

	}

	public void naoConcodarTermos() {
		try {

			
			metodo.clicar(el.naoconcordaTermos);
			System.out.println("Não Concordar Termos foi  executado Com Sucesso");
		} catch (Exception e) {
			System.out.println("Não concordar Termos Não foi  executado com sucesso:" + e.getMessage());
		}
	}

	public void validarAlert(String texto) {
		try {

			metodo.validarAlertDe5Segundos(texto);
			System.out.println("Validar Alert  foi executado com Sucesso");

		} catch (Exception e) {
			System.out.println("Validar Alert não foi executado com sucesso" + e.getMessage());
		}

	}

	public void passarMouse(String texto) {
		try {

			metodo.mouseOver(el.passarMOuse);
			metodo.validarAlert(texto);
			System.out.println("Passar o mouse foi executado com sucesso");
		} catch (Exception e) {
			System.out.println("Passar o mouse nao foi executado com sucesso" + e.getMessage());

		}

	}

	// sera usado para clicar duas vezes
	public void clicarDuasVezes(String texto) {
		try {

			metodo.duploClique(el.clicarduasVezes);
			metodo.validarAlert(texto);
			System.out.println("Clicar Duas vezes Executado com Sucesso");

		} catch (Exception e) {
			System.out.println("Clicar Duas Vezes Não Foi Executado com Sucesso");
		}
	}

	public void abrirNovaAba() {
		
		
		
		
	}

	public void abrirNovaAb() {


	}
}
