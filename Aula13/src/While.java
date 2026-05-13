import static java.lang.IO.*;

//1. Um caixa eletrônico permite 3 tentativas para digitar a senha correta (4321).
//Caso erre 3 vezes, a conta será bloqueada.

void main() {

    String senha = "4321";
    String msg = ""; //String nula

    int tentativas = 1; //valor inicial do loop
    while (tentativas <= 3){ //valor final do loop

        IO.print("Digite uma senha: ");
        String senha_fornecida = readln();

        if (senha_fornecida.equals(senha)) {
            msg = (" Acesso Liberado!");
            //break;
        } else {
            msg = ("Conta Negada!");

        }
        tentativas = tentativas + 1;//passo/incremento

        IO.println("Acesso: " + msg);

        IO.print("FIM DO PROGRAMA!");

        }
    }



