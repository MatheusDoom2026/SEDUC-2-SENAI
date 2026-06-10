import static java.lang.IO.println;
import static java.lang.IO.readln;

//### Contexto do desafio
//
//Parabéns! Você foi contratado para desenvolver a primeira versão de um sistema de cadastro para uma escola técnica.
//
//A coordenação deseja um programa simples, funcional e organizado para cadastrar alunos rapidamente durante o período de matrícula.
//
//Seu objetivo será criar um sistema em Java 25 utilizando conceitos fundamentais da programação, como:
//
//- Variáveis
//- Arrays
//- Estruturas de repetição
//- Condicionais
//- Menus interativos
//- Organização lógica do programa
//
//Este projeto será extremamente importante, porque ele servirá de base para as próximas evoluções do sistema ao longo do curso.

import java.util.Scanner;



static Scanner scanner = new Scanner(System.in);

static String[] nomes = new String[10];
static int[] idades = new int[10];
static String[] cursos = new String[10];

static int totalAlunos = 0;

public static void main(String[] args) {

    int opcao;

    do {
        exibirMenu();

        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // limpa buffer

        switch (opcao) {
            case 1:
                cadastrarAluno();
                break;

            case 2:
                listarAlunos();
                break;

            case 3:
                buscarAluno();
                break;

            case 4:
                removerAluno();
                break;

            case 5:
                System.out.println("\nSistema encerrado.");
                break;

            default:
                System.out.println("\nOpção inválida.");
        }

    } while (opcao != 5);
}

public static void exibirMenu() {
    System.out.println("\n===== SISTEMA DE CADASTRO DE ALUNOS =====");
    System.out.println("1 - Cadastrar aluno");
    System.out.println("2 - Listar alunos");
    System.out.println("3 - Buscar aluno pelo nome");
    System.out.println("4 - Remover aluno");
    System.out.println("5 - Sair");
    System.out.println();
}

public static void cadastrarAluno() {

    if (totalAlunos >= nomes.length) {
        System.out.println("\nLimite máximo de alunos atingido.");
        return;
    }

    System.out.print("Nome: ");
    String nome = scanner.nextLine().trim();

    if (nome.isEmpty()) {
        System.out.println("ERRO: o nome do aluno não pode ficar vazio.");
        return;
    }

    System.out.print("Idade: ");
    int idade = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Curso: ");
    String curso = scanner.nextLine();

    nomes[totalAlunos] = nome;
    idades[totalAlunos] = idade;
    cursos[totalAlunos] = curso;

    totalAlunos++;

    System.out.println("\nAluno cadastrado com sucesso.");
}

public static void listarAlunos() {

    if (totalAlunos == 0) {
        System.out.println("\nNenhum aluno cadastrado.");
        return;
    }

    System.out.println("\n===== LISTA DE ALUNOS =====");

    for (int i = 0; i < totalAlunos; i++) {
        System.out.println("\nAluno " + (i + 1));
        System.out.println("Nome: " + nomes[i]);
        System.out.println("Idade: " + idades[i]);
        System.out.println("Curso: " + cursos[i]);
    }
}

public static void buscarAluno() {

    if (totalAlunos == 0) {
        System.out.println("\nNenhum aluno cadastrado.");
        return;
    }

    System.out.print("Digite o nome do aluno: ");
    String nomeBusca = scanner.nextLine();

    boolean encontrado = false;

    for (int i = 0; i < totalAlunos; i++) {

        if (nomes[i].equalsIgnoreCase(nomeBusca)) {

            System.out.println("\nAluno encontrado!");
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Curso: " + cursos[i]);

            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("\nAluno não encontrado.");
    }
}

public static void removerAluno() {

    if (totalAlunos == 0) {
        System.out.println("\nNenhum aluno cadastrado.");
        return;
    }

    System.out.print("Digite o nome do aluno que deseja remover: ");
    String nomeBusca = scanner.nextLine();

    int indice = -1;

    for (int i = 0; i < totalAlunos; i++) {

        if (nomes[i].equalsIgnoreCase(nomeBusca)) {
            indice = i;
            break;
        }
    }

    if (indice == -1) {
        System.out.println("\nAluno não encontrado.");
        return;
    }

    System.out.print("Deseja realmente remover este aluno? (S/N): ");
    String resposta = scanner.nextLine();

    if (resposta.equalsIgnoreCase("S")) {

        for (int i = indice; i < totalAlunos - 1; i++) {
            nomes[i] = nomes[i + 1];
            idades[i] = idades[i + 1];
            cursos[i] = cursos[i + 1];
        }

        nomes[totalAlunos - 1] = null;
        cursos[totalAlunos - 1] = null;
        idades[totalAlunos - 1] = 0;

        totalAlunos--;

        System.out.println("\nAluno removido com sucesso.");
    } else {
        System.out.println("\nRemoção cancelada.");
    }
}

