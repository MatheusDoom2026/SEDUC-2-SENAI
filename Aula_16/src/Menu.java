//Aula 16 - Menu

import static java.lang.IO.*;

void main() {

    String opcao;

    do {
        IO.println("Bem-Vindo ao Sistema do Cadastro!");
        IO.println("-- Menu de Opções --");
        IO.println("1- Cadastrar paciente");
        IO.println("2- Alterar paciente");
        IO.println("3- Remover o paciente");
        IO.println("4- Sair");

        opcao = readln("Digite a opção desejada: ");

        IO.println("Opção escolhida: " + opcao);

        if (opcao.equals("1")) {

            IO.println("Iniciando Cadastro... ");
            //TODO: Implementar rotina do cadastro;
            IO.println("Cadastro finalizado");
        }

        if (opcao.equals("2")) {

            IO.println("Iniciando alteração de cadastro do paciente... ");
            //TODO: Implementar rotina do cadastro;
            IO.println("Alteração finalizada");
        }

        if (opcao.equals("3")) {

            IO.println("Removendo o paciente... ");
            //TODO: Implementar rotina do cadastro;
            IO.println("Paciente removido");
        }

        if (opcao.equals("4")) {
            IO.println("Finalizando Programa...");
            break;
        }
    }while(!opcao.equals("4"));
}

