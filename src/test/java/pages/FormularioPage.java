package pages;

import elementos.ElementosFormulario;
import metodos.Metodos;

public class FormularioPage {

	Metodos metodo = new Metodos();
	ElementosFormulario el = new ElementosFormulario();

	public void preencherFormulario(String nome, String email, String telefone, String endereco, String cidade) {

		metodo.clicar(el.formulario);
		metodo.escrever(el.nome, nome);
		metodo.escrever(el.email, email);
		metodo.escrever(el.telefone, telefone);
		metodo.escrever(el.endereco, endereco);
		metodo.escrever(el.cidade, cidade);

		}

	public void concordarTermos() {
		try {
			metodo.clicar(el.formulario);
			metodo.clicar(el.concordatermos);
			System.out.println("Concordar Termos Executado com sucesso");
		} catch (Exception e) {
			System.out.println("Concordar termos Não executado: " + e.getMessage());
		}

	}

	public void naoConcodarTermos(String texto) {
		try {
			metodo.clicar(el.formulario);
			metodo.validarAlertDe5Segundos(texto);
			metodo.clicar(el.naoconcordaTermos);
			System.out.println("Não Concordar Termos foi  executado Com Sucesso");
		} catch (Exception e) {
			System.out.println("Não concordar Termos Não foi  executado com sucesso:" + e.getMessage());
		}
	}

	public void validaralert(String texto) {
		try {
			metodo.clicar(el.formulario);
			metodo.validarAlertDe5Segundos(texto);
			System.out.println("Validar Alert  foi executado com Sucesso");

		} catch (Exception e) {
			System.out.println("Validar Alert não foi executado com sucesso" + e.getMessage());
		}

	}

	public void passarMouse(String texto) {
		try {
			metodo.clicar(el.formulario);
			metodo.mouseOver(el.passarMOuse);
			metodo.validarAlert(texto);
			System.out.println("Passar o mouse foi executado com sucesso");
		} catch (Exception e) {
			System.out.println("Passar o mouse nao foi executado com sucesso" + e.getMessage());

		}

	}

	public void clicarDuasVezes(String texto) {
		try {

			metodo.clicar(el.formulario);
			metodo.duploClique(el.clicarduasVezes);
			metodo.validarAlert(texto);
			System.out.println("Clicar Duas vezes Executado com SUcesso");

		} catch (Exception e) {
			System.out.println("Clicar Duas Vezes Não Foi Executado com Sucesso");
		}
	}
	public void abrirNovaAba() {
		
		
		
		
		
	}
}
