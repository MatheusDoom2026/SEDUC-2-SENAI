import static java.lang.IO.println;
import static java.lang.IO.readln;

//## Exercício 2 - Média da Turma

//Crie um programa que:

//        1. Crie um array de `double` para armazenar 4 notas.
//2. Solicite ao usuário as 4 notas.
//3. Calcule a soma das notas utilizando um `for`.
//        4. Calcule e exiba a média da turma.

//### Exemplo

//```
//Nota 1: 8
//Nota 2: 7
//Nota 3: 10
//Nota 4: 5

//Média: 7.5
 //       ```
    void main() {
        println("\n--- Média da Turma ---\n");
        int num_alunos = 1; //valor inicial
        while (num_alunos <= 1) {

            IO.print("Digite o nome do " + num_alunos + "º e único aluno: ");
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


