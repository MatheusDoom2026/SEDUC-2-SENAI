import static java.lang.IO.readln;

public class Exércicio_2
//2. Desenvolver um programa que leia o consumo de água para uma residência normal e exiba o valor (R$) da conta baseado nos seguintes cálculos:
//Se o consumo for menor ou igual a 10m3, então R$ 22,38
//Se o consumo for menor ou igual a 20m3, então R$ 3,50 por m3
//Se o consumo for menor ou igual a 50m3, então R$ 8,75 por m3
//Se o consumo for acima dos 50m3, então R$ 9,64 por m3
//residencia_normal.java
{
    void main() {
        IO.println("Digite o valor do consumo de água por m3 ");
        float consumo = Float.parseFloat(readln());

        if (consumo <= 10) {
            IO.println("Então ele é R$: 22,38");
        } else if (consumo <= 20) {

            IO.println("Então ele é R$: 3,50");
        } else if (consumo <= 30) {
            IO.println("Então ele é R$: 8,75");

        }

        else {
            IO.print("Então ele é R$: 9,64");}


    }
}



