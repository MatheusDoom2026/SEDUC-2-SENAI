import static java.lang.IO.*;

   //7. Desenvolver um aplicativo para um caixa eletrônico com saldo inicial de R$ 500,00 com as seguintes opções:

   // 1 Saque
   // 2 Depósito
   // 3 Saldo
   // 0 Sair

    //Repetir até sair.

      //      Regras do negócio:
       //     Não sacar valor maior que saldo
    //Valor inválido não permitido


void main() {

    int opção = Integer.parseInt(readln("Selecione uma opção: "));

    String Options = switch (opção) {

        case 1 -> "Saque";
        case 2 -> "Depósito";
        case 3 -> "Saldo";
        case 0 -> "Você selecionou sair";
        default -> "Opção inválida!!!";

    };
    print(Options);

    IO.print("Digite o valor do saldo: ");
    float saldo = Float.parseFloat(readln());

    IO.print("Digite o valor do saque: ");
    float saque = Float.parseFloat(readln());

    if (saldo >= saque) {
        saldo = saldo - saque;
        IO.print("Saque efetuado com sucesso");

        IO.print("Saque atual: " + saldo);

    } else {
        IO.print("Saldo insuficiente");


    }
}

