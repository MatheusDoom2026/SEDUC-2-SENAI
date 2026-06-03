import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {

//    ## Exercício 3 - Maior Número

//    Crie um programa que:

//    1. Crie um array de `int` para armazenar 5 números.
//    2. Solicite os números ao usuário.
//    3. Utilize um `for` para descobrir qual é o maior número digitado.
//    4. Exiba o maior valor encontrado.

//### Exemplo

//```
//    Maior número: 42
//```

    String[] números = new String[5]; //


    println("\n--- Maior Número---\n");
    números[0] = readln("Digite o 1º: ");
    números[1] = readln("Digite o 2º: ");
    números[2] = readln("Digite o 3º: ");
    números[3] = readln("Digite o 4º: ");
    números[4] = readln("Digite o último & 5º número: ");

    println("\nO número 1 é: " + números[0]);
    println("O número 2 é: " + números[1]);
    println("O número 3 é: " + números[2]);
    println("O número 4 é: " + números[3]);
    println("O número 5 é: " + números[4]);





}


