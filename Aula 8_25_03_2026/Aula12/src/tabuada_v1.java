import java.lang.IO.*;

import static java.lang.IO.readln;

void main() {
    int num = Integer.parseInt(readln("Digite o número da tabuada: "));
    for(int i = 1; i <= 10; i++){
        IO.println(i + " x " + num + " = " + (i*num));

    }

}

