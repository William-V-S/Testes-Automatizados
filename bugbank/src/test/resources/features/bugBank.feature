#language: pt
#enconding: UTF-8


Funcionalidade: BugBank


@errosNoCadastro	@inicio
Cenario: Campos vazio qaundo registrar
	Dado que esteja na pagina inicial
	Quando o usuario acionar o botao registrar
	Dado que esteja na tela de registro
	
	Quando preencher o campo email ""
	E preencher o campo senha ""
	E preencher o campo confirmacao senha ""
	E acionar o botao cadastrar
	Entao aparece a mesagem de campo obrigatorio
	
	
@errosNoCadastro 	@modal
Cenario: Sem nome quando registrar
	Dado que esteja na tela de registro
	Quando preencher o campo email "contaerro@gmail.com"
	E preencher o campo nome ""
	E preencher o campo senha "bug1234"
	E preencher o campo confirmacao senha "bug1234"
	E acionar o botao cadastrar
	Entao o modal de nome em branco aparece
	
	
@errosNoCadastro	@modal @fim
Cenario: Senhas diferentes quando registrar
	Dado que esteja na tela de registro
	E preencher o campo email "contaerro@gmail.com"
	E preencher o campo nome "contaY"
	E preencher o campo senha "bug1234"
	E preencher o campo confirmacao senha "errada"
	E acionar o botao cadastrar
	Entao o modal de senha diferente aparece
	
	
@errosNoLogin @modal @inicio
Cenario: email ou senha invalidos
	Dado que esteja na pagina inicial
	Quando o usuario informar o email "xxxxx@gmail.com"
	E acionar o botao acessar
	E informar senha "xxxxxxx"	
	E acionar o botao acessar
	Entao o modal de login invalido aparece
	
	
@errosNoLogin  @fim
Cenario: email em formato invalido
	Dado que esteja na pagina inicial
	Quando o usuario informar o email "xxxxxinvalido"
	E informar senha "xxxxxxx"	
	E acionar o botao acessar
	Entao formato invalido aparece embaixo do compo email
	
	
	
@cadastro @modal @inicio
Cenario: Cadastro bem sucedido
	Dado que esteja na pagina inicial
	Quando o usuario acionar o botao registrar
	
	Dado que esteja na tela de registro
	Quando preencher o campo email "conta01@gmail.com"
	E preencher o campo nome "contaX"
	E preencher o campo senha "bug1234"
	E preencher o campo confirmacao senha "bug1234"
	E acionar o botao criar conta com saldo
	E acionar o botao cadastrar
	Entao a conta foi criada
	

@Saque	@modal
Cenario: Saque em desenvolvimento
	Dado que esteja na pagina inicial
	Quando o usuario realizar o login	
	Dado que esteja na home page
	Quando ele clicar no botao saque
	Entao o modal de desenvolvimento vai ser exibido
	
	
@Pagamento	@modal
Cenario: Pagamento em desenvolvimento	
	Dado que esteja na home page
	Quando o usuario clicar no botao pagamento
	Entao o modal de desenvolvimento vai ser exibido
	
	
@tranferencia @modal 
Cenario: Tranferencia bem secedida
	Dado que esteja na home page
	Quando o usuario clicar no botao tranferencia
	Dado que esteja na transfer page
	
	Quando informa a conta "X007"
	E informa a o digito "13"
	E informar o valor da tranferencia "900"
	E clicar no botao transferir agora
	Entao o modal de transferencia realizada vai ser exibido
	
	
@errosNaTranferencia @modal
Cenario: Tranferencia saldo insuficiente
	Dado que esteja na transfer page
	Quando informar o valor da tranferencia "9999999"
	E clicar no botao transferir agora
	Entao o modal de saldo insuficiente vai ser exibido
	
	
@errosNaTranferencia
Cenario: Letras no lugar de numeros na tranferencia
	Dado que esteja na transfer page
	Quando informar o valor da tranferencia "XBOX360"
	Entao a mensagem que nao aceita "XBOX360" vai ser exibida

@extrato @fim
Cenario: Conferir extrato	
	Dado que esteja na transfer page
	Quando o usuario clicar em voltar
	Dado que esteja na home page
	Quando clicar no botao extrato
	Entao o extrato da conta vai ser mostrado
	
	
@repositorio @inicio @fim
Cenario: Acessar o repositorio do projeto no GitHub
	Dado que esteja na pagina inicial
	Quando o usuario clicar em conheca nossos requisitos
	E depois em acessar o link do repositorio
	Entao ele estara no repositorio do github