import static java.lang.IO.println;
import static java.lang.IO.readln;

void main(){

//    ## Exercício 4 - Contando Números Pares

//    Crie um programa que:

//    1. Crie um array de `int` para armazenar 6 números.
//    2. Solicite os números ao usuário.
//    3. Utilize um `for` para percorrer o array.
//    4. Conte quantos números pares existem.
//    5. Exiba o resultado.

//### Exemplo

//```
//    Quantidade de números pares: 4
//```
    String[] números = new String[5]; //


    println("\n--- Contando Números Pares---\n");
    números[0] = readln("Digite o 1º: ");
    números[1] = readln("Digite o 2º: ");
    números[2] = readln("Digite o 3º: ");
    números[3] = readln("Digite o 4º: ");
    números[4] = readln("Digite o 5º número: ");
    números[4] = readln("Digite o último & 6º número: ");

    println("\nO número 1 é: " + números[0]);
    println("O número 2 é: " + números[1]);
    println("O número 3 é: " + números[2]);
    println("O número 4 é: " + números[3]);
    println("O número 5 é: " + números[4]);
    println("O número 6 é: " + números[4]);


    int num = Integer.parseInt(readln());

    if(num % 2 == 0) {
        IO.print("Número é par!!");
    }else {
        IO.print("O número é impar!");

    }
}





