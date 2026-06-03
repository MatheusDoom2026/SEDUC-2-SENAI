import static java.lang.IO.*;

void main() {

    String nome = "Anderson";

    println("\n -- Imprimindo o contéudo de uma váriavel");
    println("Nome: " + nome);


    String[] nomes = {"Anderson", "Atila", "Lucas"};
    println("\n -- Imprimindo o contéudo de um array");
    println("Nome: " + nomes[0]);
    println("Nome: " + nomes[1]);
    println("Nome: " + nomes[2]);

    println("\n -- Imprimindo o contéudo de um Array com um loop For");
    for (int i = 0; i < 3; i++) {
        println("Nome: " + nomes[i]);


    }
}