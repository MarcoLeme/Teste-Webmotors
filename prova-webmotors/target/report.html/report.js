$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("teste-webmotors.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: marcoalmolina@gmail.com"
    }
  ],
  "line": 5,
  "name": "Valida�ao dos campos de Marca e Modelo",
  "description": "Eu como usuario quero acessar o site para realizar a busca de uma marca e modelo espec�fico de carro",
  "id": "valida�ao-dos-campos-de-marca-e-modelo",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@allTest"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "validar os campos de busca de Marca e Modelo",
  "description": "",
  "id": "valida�ao-dos-campos-de-marca-e-modelo;validar-os-campos-de-busca-de-marca-e-modelo",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@buscaMarcaModelo1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que esteja no site \"https://www.webmotors.com.br/\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "informar a marca Honda na barra de busca",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "selecionar o modelo City",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "deve aparecer os carros disponiveis",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.webmotors.com.br/",
      "offset": 20
    }
  ],
  "location": "Steps.que_esteja_no_site(String)"
});
formatter.result({
  "duration": 16360840800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.informar_a_marca_Honda_na_barra_de_busca()"
});
formatter.result({
  "duration": 6634892600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.selecionar_o_modelo_City()"
});
formatter.result({
  "duration": 1747846000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.deve_aparecer_os_carros_disponiveis()"
});
formatter.result({
  "duration": 3642661400,
  "status": "passed"
});
});