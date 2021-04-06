#language: pt
#Author: marcoalmolina@gmail.com

@allTest
Funcionalidade: Validaçao dos campos de Marca e Modelo 
  Eu como usuario quero acessar o site para realizar a busca de uma marca e modelo específico de carro
        
  @buscaMarcaModelo1
  Cenario: validar os campos de busca de Marca e Modelo 
  	Dado que esteja no site "https://www.webmotors.com.br/"
    Quando informar a marca Honda na barra de busca
		E selecionar o modelo City
		Entao deve aparecer os carros disponiveis
		
		@lojaConcessionaria
		Cenario: Validacao dos campos de Marca e Modelo em lojas e concessionarias
  	Dado que esteja no site "https://www.webmotors.com.br/carros/estoque?anunciante=Concession%C3%A1ria%7CLoja&tipoveiculo=carros&estadocidade=estoque"
    Quando informar a marca do veiculo
		E selecionar o modelo City
		Entao deve aparecer os carros disponiveis na concessionaria
		
	@estoqueMazola
		Cenario: Validacao dos campos de Marca e Modelo em uma concessionaria especifica
  	Dado que esteja no site "https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja"
    Quando informar a marca do veiculo
		E selecionar o modelo City
		Entao deve aparecer os carros disponiveis em estoque
