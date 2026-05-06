import static java.lang.IO.*;

void main() {

    IO.print("Digite um número inteiro: ");
    int num = Integer.parseInt(readln());

    if(num % 2 == 0) {
        IO.print("Número é par!!");
    }else {
        IO.print("O número é impar!");

    }
}