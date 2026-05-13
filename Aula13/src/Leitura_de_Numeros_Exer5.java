import static java.lang.IO.*;

//5. Ler dez números e exibir na tela:
//a soma destes números;
//a média destes números;
//o maior número lido;
//o menor número lido;
//a soma de todos os números pares lidos;
//a soma de todos os números ímpares lidos;
//o número de ímpares;
//o número de pares.

void main() {

    float soma = 0;
    float soma_pares = 0;
    float soma_impares = 0;
    float media = 0;
    float maior = Integer.MIN_VALUE;
    float menor = Integer.MAX_VALUE;
    float cont_impares = 0;
    float cont_pares = 0;


    for (int i = 1; i <= 5; i++) {
        int num = Integer.parseInt(readln("Digite um número: "));
        soma = soma + num;
        if (num > maior) {
            maior = num;

        }
        if (num < menor) {
            menor = num;
            {
                if (num % 2 == 0) {
                    soma_pares += num;
                    cont_pares += 1;
                }
                else  {
                    soma_impares += num;
                    cont_impares +=  1;
                }

            }


        }
    }
    media = soma / 5;
    println("Soma = " + soma);
    println("Média = " + media);
    println("Maior = " + maior);
    println("Menor = " + menor);
    println("Soma dos Números Pares = " + soma_pares);
    println("Soma dos Números Ímpares = " + soma_impares);
    println("Números Ímpares = " + cont_impares);
    println("Números pares = " + cont_pares);
}