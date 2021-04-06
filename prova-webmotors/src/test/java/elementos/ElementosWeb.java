package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// ***********************************************************
	// ELEMENTOS WEB ENCAPSULADOS
	// ***********************************************************
	
	

	private By pesquisar = By.id("searchBar");
	private By clicarMarca = By.cssSelector("div:nth-child(1) > a > div.SearchBar__results__result__name");
	private By clicarModelo = By.cssSelector("div:nth-child(3) > div.Filters__make-block > div:nth-child(2) > div.Filters__line.Filters__line--gray.Filters__line--icon.Filters__line--icon--right");
	private By clicarCity = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(5) > a:nth-child(3)");
	private By clicarComprar = By.cssSelector("#root > header > nav > div > ul > li:nth-child(1)");
	private By usadosSeminovos = By.id("navigationUsedOrNewCars");
	private By usadosHonda = By.cssSelector("a[href*='carros/estoque/honda']");
	private By novos = By.id("navigationNewCars");
	private By botaoOk = By.cssSelector("#root > div.sc-bdVaJa.bjRMar > div.sc-htpNat.iPWKQm > button");

	
	

	// ***********************************************************
	// MÉTODOS DE ACESSO
	// ***********************************************************

	public By getPesquisar() {
		return pesquisar;
	}

	public By getClicarModelo() {
		return clicarModelo;
	}

	public By getClicarCity() {
		return clicarCity;
	}

	public By getClicarComprar() {
		return clicarComprar;
	}

	public By getUsadosSeminovos() {
		return usadosSeminovos;
	}

	public By getUsadosHonda() {
		return usadosHonda;
	}

	public By getNovos() {
		return novos;
	}

	public By getBotaoOk() {
		return botaoOk;
	}

	public By getClicarMarca() {
		return clicarMarca;
	}
	
	
	

}
