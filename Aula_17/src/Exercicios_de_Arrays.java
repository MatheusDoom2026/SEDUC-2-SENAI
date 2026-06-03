import static java.lang.IO.*;

void main() {

//    ## Exercício 1 - Cadastro de Produtos

//    Crie um programa que:

//    1. Crie um array de `String` com capacidade para 5 produtos.
//    2. Solicite ao usuário o nome dos 5 produtos.
//    3. Utilize um `for` para preencher o array.
//    4. Utilize outro `for` para exibir todos os produtos cadastrados.

// ### Exemplo de saída

//```
   // Produtos cadastrados:

   // Teclado
           // Mouse
    //Monitor
           // Webcam
    //Headset
//```

    String nome = "Produtos no catálogo para o Computador:";

    println("\n -- Produtos de Computador");
    println("Objetos de pesquisa: " + nome);


    String[] nomes = {"Teclado", "Mouse", "Monitor", "Webcam", "Headset"};
    println("\n -- Carregando resultados... ");
    println("Objeto: " + nomes[0]);
    println("Objeto: " + nomes[1]);
    println("Objeto: " + nomes[2]);
    println("Objeto: " + nomes[3]);
    println("Objeto: " + nomes[4]);

    println("\n -- Produtos Cadastrados: ");
    for (int i = 0; i < 5; i++) {
        println("Objeto: " + nomes[i]);


    }
}
    
