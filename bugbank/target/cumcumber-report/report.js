$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/bugBank.feature");
formatter.feature({
  "name": "BugBank",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Acessar o repositorio do projeto no GitHub",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@repositorio"
    },
    {
      "name": "@inicio"
    },
    {
      "name": "@fim"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que esteja na pagina inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "RegistrarSteps.queNaPaginaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario clicar em conheca nossos requisitos",
  "keyword": "Quando "
});
formatter.match({
  "location": "RepositorioSteps.oUsuarioClicarEmConhecaNossosRequisitos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "depois em acessar o link do repositorio",
  "keyword": "E "
});
formatter.match({
  "location": "RepositorioSteps.depoisEmAcessarOLinkDoRepositorio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ele estara no repositorio do github",
  "keyword": "Entao "
});
formatter.match({
  "location": "RepositorioSteps.eleEstaraNoRepositorioDoGithub()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});