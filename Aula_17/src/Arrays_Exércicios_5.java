import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {

    //Exercício 5 - Procurando um Nome
    //Crie um programa que:

    //1. Crie um array de `String` para armazenar 5 nomes.
    //2. Solicite os nomes ao usuário.
    //3. Depois, peça um nome para pesquisa.
    //4. Utilize um `for` para verificar se o nome existe no array.
    //5. Exiba uma mensagem informando se o nome foi encontrado ou não.

    String[] números = new String[5]; //


    println("\n--- Procurando Nome ---\n");
    números[0] = readln("1º nome: ");
    números[1] = readln("2º nome: ");
    números[2] = readln("3º nome: ");
    números[3] = readln("4º nome: ");
    números[4] = readln("5º nome: ");

    println("\nPrimeiro nome: " + números[0]);
    println("Segundo nome: " + números[1]);
    println("Terceiro nome: " + números[2]);
    println("Quarto nome: " + números[3]);
    println("Último nome: " + números[4]);








}