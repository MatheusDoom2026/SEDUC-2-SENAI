import static java.lang.IO.println;
import static java.lang.IO.readln;

public class Exércicio_6 {}


//6. Desenvolva um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem formam um triângulo e se formarem exibir na tela se é equilátero, isósceles ou escaleno.
//
//Sabemos que:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;

void main() {
    println("Bem-vindo(a) ao nosso programa!"); //1-mostrar titulo do programa

//2- pedir as informaçoes
    float lado1 = Float.parseFloat(readln("Por favor digite o valor do dado da lado 1: "));
    float lado2= Float.parseFloat(readln("Por favor digite o valor do dado do lado 2: "));
    float lado3 = Float.parseFloat(readln("Por favor digite o valor do dado do lado 3: "));

//3-calcular e mostrar resultado
    if (lado1 + lado2 >= lado3 || lado2 + lado3 >= lado1 || lado3 + lado1 >= lado2) {
        if (lado1 == lado2 && lado2 == lado3) {
            println("esse triangulo e um Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            println("esse triangulo e um Isósceles");
        } else {
            println("Esse triângulo é um Escaleno");
        }
    }
    else {
        println("Isto não é um triangulo");
    }
}








