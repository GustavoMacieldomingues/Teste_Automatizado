package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.elementosDeTela;
import metodos.metodosPage;

public class teste {

	elementosDeTela e = new elementosDeTela();
	metodosPage m = new metodosPage();
	
	@Dado("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {
	   m.abrirNavegador(url);
	   
	 
	}

	@Quando("^clico na barra de pesquisa$")
	public void clico_na_barra_de_pesquisa() throws Throwable {
		m.clicar(e.getBtnClicarNaBarra());
	}

	@Quando("^pesquiso o produto desejado$")
	public void pesquiso_o_produto_desejado() throws Throwable {
		m.escrever(e.getBtnClicarNaBarra());
	}

	@Quando("^clico na lupa de pesquisar$")
	public void clico_na_lupa_de_pesquisar() throws Throwable {
	    m.clicar(e.getClicarLupa());
	}

	@Entao("^encontro o produto desejado$")
	public void encontro_o_produto_desejado() throws Throwable {
	    m.clicar(e.getClicarCelular());
	}

	
	
	
}
