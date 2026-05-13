import static java.lang.IO.readln;

public class Exercicio_12 {

}
//12. Desenvolva um programa que leia quatro notas bimestrais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média final. A atribuição de conceitos obedece à tabela abaixo:
//  Média de Aproveitamento  Conceito
//  Entre 9.0 e 10.0        A
//  Entre 7.5 e 8.9         B
//  Entre 6.0 e 7.4         C
//  Entre 4.0 e 5.9         D
//  Entre zero e 3.9        E
//O programa deve exibir na tela:
//  1. As quatro notas bimestrais,
//  2. A média final,
//  3. O conceito correspondente e,
//  4. A mensagem "APROVADO" ou "Reprovado" de acordo com a regra a seguir:
//     4.1. Se o conceito       for A, B ou C    exibir "APROVADO"
//     4.2. Senão se o conceito for D ou E       exibir "REPROVADO"



void main() {

    int num_alunos = 1; //valor inicial
    while (num_alunos <= 4) {

        IO.print("Digite o nome do " + num_alunos + "º aluno: ");
        String nome = readln();

        float soma_notas = 0;
        int notas = 1;
        while (notas <= 4) {
            IO.println("Digite a " + notas + "º nota: ");
            float nota_bimestral = Float.parseFloat(readln());
            soma_notas = soma_notas + nota_bimestral;
            notas = notas + 1;

        }

        float media = soma_notas / 4;
        num_alunos = num_alunos + 1;


        if (media >= 7) {
            IO.println("Média = + " + media + "situação = Aprovado\n");
        } else if (media < 5) {
            IO.print("Digite a " + media + ", situação = Reprovado\n");
        } else {
            IO.print(("Média = " + media + ", Situação = Recuperação\n"));

        }
    }
}



