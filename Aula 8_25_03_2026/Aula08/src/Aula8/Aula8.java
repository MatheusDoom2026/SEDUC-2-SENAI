package Aula8;

import java.util.Scanner;

public class Aula8 {
  void main (){
    Scanner sc = new Scanner(System.in);
    IO.print("Digite o valor do raio ");
    double raio = sc.nextDouble();
    double area = 3.1415 * Math.pow(raio, 2);
    IO.print("Area da Circuferência = " + area);


  }
}


