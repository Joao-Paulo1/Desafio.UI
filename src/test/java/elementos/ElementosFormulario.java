package elementos;

import org.openqa.selenium.By;

public class ElementosFormulario {

	public By formulario = By.xpath("//a[text()='Formulário']");
	public By nome = By.xpath("//label[1]//input[@type='text']");
	public By email = By.xpath("//input[@type='email']");
	public By telefone = By.xpath("//input[@type='tel']");
	 public By endereco = By.xpath("//label[4]//input[@type='text']");
	public By cidade = By.xpath("//label[text()='Cidade: ']//input[@type='text']");
	public By enviarArquivo = By.xpath("//label[text()='Faça upload de um arquivo: ']");
	public By concordatermos = By.xpath("//input[@value='sim']");
	public By naoconcordaTermos = By.xpath("//input[@value='nao']");
	public By clicarduasVezes = By.xpath("//button[text()='Clique duas vezes aqui']");
	public By passarMOuse = By.xpath("//span[@class='hover-alert']");
}
