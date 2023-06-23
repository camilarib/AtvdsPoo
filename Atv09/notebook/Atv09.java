/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 11/05/2023
*/


public class Atv09 { // inicio da classe atv09
    public static void imprimirNumeros(int[] numeros) { // recebe um array de inteiros como parâmetro e imprime cada número na tela
        for (int numero : numeros) { // inicio do for que irá percorrer o array numeros
            System.out.print(numero + " "); //adiciona o numero + um espaço
        }
        System.out.println(); // print dos elementos 
    }

public static void somaNumeros(int[] numeros){ // inicio do método somaNumeros recebe um array de inteiros como parâmetro, e mostra o resultado na tela
    int soma = 0; //recebe a soma do array
        for (int numero : numeros) { // calcula a soma dos numeros
            soma += numero;
        } //fim do for
        System.out.println("A soma dos números é: " + soma); //print da soma de todos os numeros
}
public static void main(String[] args) { //inicio do método main
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // array de inteiros com valores de 1 a 10 

        System.out.println("Array inicial:"); //
        imprimirNumeros(numeros); // chama o método imprimirNumeros e exibe os numeros iniciais

        somaNumeros(numeros); // chama o método imprimirNumeros e exibe a soma dos numeros
    } //fim do método main
} // fim da classe Atv09