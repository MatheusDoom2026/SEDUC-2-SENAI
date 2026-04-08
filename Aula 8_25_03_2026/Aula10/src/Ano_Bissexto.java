import static java.lang.IO.*;


void main() {

    IO.print("Digite um ano qualquer: ");
    int ano = Integer.parseInt(readln());

    if (ano % 4 == 0) {
        IO.print("Ano Bissexto!");
    }else {
        IO.print("É um ano normal.");
    }


}