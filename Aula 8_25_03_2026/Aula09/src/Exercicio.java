import static java.lang.IO.print;
import static java.lang.IO.readln;

public class Exercicio {
}

void main() {
    int dia = Integer.parseInt(readln("Digite o dia da semana: "));

    String diaSemana = switch (dia) {
        case 1 -> "Domingo";
        case 2 -> "Segunda-Feira";
        case 3 -> "Terça-Feira";
        case 4 -> "Quarta-Feira";
        case 5 -> "Quinta-Feira";
        case 6 -> "Sexta-Feira";
        case 7 -> "Sábado";
        default -> "Dia Inválido";

    };print(diaSemana);


}
