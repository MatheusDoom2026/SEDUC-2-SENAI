import static java.lang.IO.readln;

public class Exércicio_3{
//Primeiro exércicio da atividade 1. Desenvolver um programa que leia o consumo de água para uma residência social e exiba o valor (R$) da conta baseado nos seguintes cálculos:
//Se o consumo for menor ou igual a 10m3, então R$ 7,59
//Se o consumo for menor ou igual a 20m3, então R$ 1,31 por m3
//Se o consumo for menor ou igual a 30m3, então R$ 4,64 por m3
//Se o consumo for menor ou igual a 50m3, então R$ 6,62 por m3
//Se o consumo for acima dos 50m3, então R$ 7,31 por m3
//residencia_social.java

    void main() {
        IO.println("Digite o valor do consumo de água por m3 ");
        float consumo = Float.parseFloat(readln());

        if (consumo <= 10) {
            IO.println("Então ele é R$: 44,95");
        } else if (consumo <= 20) {

            IO.println("Então ele é R$: 8,75");
        } else if (consumo <= 30) {
            IO.println("Então ele é R$: 16,76");
        }

        else {
            IO.print("Então ele é R$: 17,46");}


    }
}
