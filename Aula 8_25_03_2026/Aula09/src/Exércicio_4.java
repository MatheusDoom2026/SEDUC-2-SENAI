import static java.lang.IO.print;
import static java.lang.IO.readln;

public class Exércicio_4 {
//4. Desenvolver um programa que leia um número de 1 a 7 e exiba o dia da semana:
//   1 - 'Domingo'
//   2 - 'Segunda'
//   3 - 'Terça'
//   4 - 'Quarta'
//   5 - 'Quinta'
//   6 - 'Sexta'
//   7 - 'Sábado'
//Qualquer outro numero exibir: 'Opção inválida!'

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

        };
        print(diaSemana);


    }
}



