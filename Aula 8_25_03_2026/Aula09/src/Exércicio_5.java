import static java.lang.IO.readln;

public class Exércicio_5{

}
//5. Desenvolver um programa que leia o peso e a altura de uma pessoa e calcule seu imc utilizando a fórmula:
//imc = peso / altura ^ 2
//Com o imc exiba para o usuário seu imc e a classificação:
//IMC		Classificação
//< 16		'Magreza grave'
//16 a < 17	'Magreza moderada'
//17 a < 18,5	'Magreza leve'
//18,5 a < 25	'Saudável'
//25 a < 30	'Sobrepeso'
//30 a < 35	'Obesidade Grau I'
//35 a < 40	'Obesidade Grau II (severa)'
//≥ 40		'Obesidade Grau III (mórbida)'


void main() {
    IO.println("Digite o peso: ");
    float peso = Float.parseFloat(readln());

    IO.println("Digite a altura: ");
    float altura = Float.parseFloat(readln());

    float imc = (peso / (altura * altura));
    IO.println("Resultado: " + imc);

    if (imc <16){
        IO.println("Magreza grave!");
    }else if (imc <17){
        IO.println("Magreza moderada!");
    }else if (imc <18.5){
        IO.println("Magreza leve!");
    }else if (imc <25){
        IO.println("Saudável!");
    }else if (imc <30){
        IO.println("Sobrepeso!");
    }else if (imc <35){
        IO.println("Obesidade grau 1");
    }else if (imc <40){
        IO.println("Obesidade grau 2 (severa)");
    }else {
        IO.println("Obesidade grau 3 (mórbida)");
    }

}
