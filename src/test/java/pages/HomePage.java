package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {
	
	By formulario = By.xpath("//a[text()='Formulário']");
	By homeBroker = By.xpath("//a[text()='HomeBroker']");
	
	Metodos metodo = new Metodos();
	
	
	public void acessarFormulario() {
metodo.clicar(this.formulario);
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/formulario.html");
		
		
		
		
	}
	public void acessarHomeBroker() {
		metodo.clicar(this.homeBroker);
		
		
		
		
	}
	
	

}
