// DESAFIO: peça para o usuario digitar 4 carros em seguida e grave-os no Array criado acima
// Ao final, imprima a lista de carros com a numeracao de 1 a 4

import static java.lang.IO.* ;

void main() {

    String[] selecoes = {"FIAT", "Ferrari", "Fox", "Agrale"};
    println(selecoes[0]); // imprimir um elemento do Array
    println(selecoes[1]);
    println(selecoes[2]);
    println(selecoes[3]);

    println("------------");
    selecoes[0] = "Camaro"; // alterando o primeiro elemento do Array
    println(selecoes[0]); // imprimir um elemento do Array

    selecoes[3] = "Audi";
    println(selecoes[3]);

// criando um Array vazio, é necessario especificar o numero de elementos!!

    String[] carros = new String[3];

}