import static java.lang.IO.*;

void main() {
    String senha = "1234";
    String msg = "";
    for (int tentativas = 1; tentativas <= 3; tentativas++){
        IO.print("Digite uma senha: ");
        String senha_fornecida = readln();

        if (senha_fornecida.equals(senha)) {
            msg = ("Liberado!");
            break;
        } else {
            msg = ("Negado!");

        }
    }
    IO.println("Acesso: " + msg);

    IO.print("FIM DO PROGRAMA");
}