import java.lang.IO.*;

import static java.lang.IO.readln;

void main() {
    int num = Integer.parseInt(readln("Digite o número da tabuada: "));
    {
    }

    int i = 1;

    while (i <= 10) {
        IO.println(i + " x " + num + "=" + (i *num));
        i += 1;
    }
}