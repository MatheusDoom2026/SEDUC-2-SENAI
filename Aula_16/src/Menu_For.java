//VERSÃO 1 - EXEMPLO DE MENU (ainda sem loop)

//AULA 16 - MENU USANDO LOOPS

import static java.lang.IO.*;

void main() {

    IO.println("Bem-Vindo ao Sistema de Cadastro");
    IO.println("** MENU DE OPÇÕES **");
    IO.println("1- CADASTRAR PACIENTE");
    IO.println("2- ALTERAR PACIENTE");
    IO.println("3- EXCLUIR PACIENTE");
    IO.println("4- SAIR ");

    String opcao = readln("Digite a opcao desejada: ") ;

    IO.println("Opção escolhida:" + opcao);

    if(opcao.equals("1")){
        IO.println("Iniciando Cadastro de Paciente.....");
// TODO: Implementar rotina de cadastro IO.println("Cadastro finalizado....");
    }

    if(opcao.equals("2")){
        IO.println("Iniciando Alteração Cadastro de Paciente.....");
// TODO: Implementar rotina de alteração IO.println("Alteração finalizada....");
    }

    if(opcao.equals("3")){
        IO.println("Excluir Paciente.....");
// TODO: Implementar rotina de alteração IO.println("Cliente Excluído....");
    }

    if(opcao == "4"){
        IO.println("FINALIZANDO PROGRAMA...");
    }









}