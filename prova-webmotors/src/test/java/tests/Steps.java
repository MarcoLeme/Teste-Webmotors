package tests;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import elementos.ElementosWeb;
import pages.Metodos;

public class Steps extends Metodos {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Dado("^que esteja no site \"([^\"]*)\"$")
	public void que_esteja_no_site(String appUrl) throws Throwable {
		metodos.abrirNavegador(appUrl, "CHROME", "Abrindo site para realizar busca");
		metodos.pausa(3000, "Tempo de espera para abrir página");
		metodos.clicar(el.getBotaoOk(), "Clicar no botao Ok dos Cookies");
	    
	}

	@Quando("^informar a marca Honda na barra de busca$")
	public void informar_a_marca_Honda_na_barra_de_busca() throws Throwable {
		metodos.preencher(el.getPesquisar(), "Honda", "Pesquisar o nome da marca");
		metodos.pausa(2000, "Pausa para clicar na marca");
		metodos.clicar(el.getClicarMarca(), "Clicar na Marca do carro");
		metodos.pausa(4000, "Pausa para clicar em modelos");
	    
	}

	@Quando("^selecionar o modelo City$")
	public void selecionar_o_modelo_City() throws Throwable {
		metodos.clicar(el.getClicarModelo(), "Clicar nos modelos");
		metodos.pausa(1000, "Pausa para clicar no modelo");
		metodos.clicar(el.getClicarCity(), "Clicar no modelo City");
	    
	}

	@Entao("^deve aparecer os carros disponiveis$")
	public void deve_aparecer_os_carros_disponiveis() throws Throwable {
		metodos.pausa(2000, "Pausa para print");
		metodos.screnShoot("Validar City");
		metodos.fecharBrowser("Fechar navegador");
	  
	}

	@Quando("^informar a marca do veiculo$")
	public void informar_a_marca_do_veiculo() throws Throwable {
		metodos.clicar(el.getUsadosHonda(), "Clicar na marca dentro de lojaConecessionaria e estoqueMazola");
	    
	}

	@Entao("^deve aparecer os carros disponiveis na concessionaria$")
	public void deve_aparecer_os_carros_disponiveis_na_concessionaria() throws Throwable {
		metodos.pausa(2000, "Pausa para print");
		metodos.screnShoot("Validar City Concessionaria");
		metodos.fecharBrowser("Fechar navegador");
	   
	}

	@Entao("^deve aparecer os carros disponiveis em estoque$")
	public void deve_aparecer_os_carros_disponiveis_em_estoque() throws Throwable {
		metodos.pausa(2000, "Pausa para print");
		metodos.screnShoot("Validar City EstoqueMazola");
		metodos.fecharBrowser("Fechar navegador");
	   
	}


}
