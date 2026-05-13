import static java.lang.IO.*;

//2. Peça 4 notas (nota1, nota2, nota3, nota4) de  4 alunos (aluno1, aluno2, aluno3, aluno4), calcule a média final (mf) de cada um e exiba na tela a sua situação escolar:

//Média final >= 7 → Aprovado
//Média final entre 5 e 6.9 → Recuperação
//Média final < 5 → Reprovado

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


    
