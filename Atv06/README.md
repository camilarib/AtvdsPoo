# Atv06
* Exercício: Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão 
necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

# Código:
    /*
    IFPR - Campus Cascavel
    Curso: Informatica
    Diciplina: Programação Orientada à Objetos
    Professor: Nelson Bellincanta
    Aluna: Camila Ribeiro Gonçalves
    Data: 14/04/2023
    */

    import java.util.Scanner;

    public class Deposito //declara classe Deposito
    {
	    public static void main(String[] args){ // Declaracao do método main
	        double depositoMensal;  //declara a  variavel depositoMensal
	        float montante; // declara a variavel montante 
	
          Scanner leitor = new Scanner(System.in);  // scanner leitor para a entrada de dados

          System.out.print("Deposito Mensal: "); // print da menssagem deposito mensal
          depositoMensal = leitor.nextDouble(); 

          System.out.print("Montante Desejavel: "); // print do montante desejavel
          montante = leitor.nextFloat(); 

          int cont = 0; // contador

          //calcula o saldo atual a cada mês e incrementa o número de meses até que o saldo atual seja igual ou maior que o montante desejado
          while (depositoMensal < montante) { 
              depositoMensal += (depositoMensal * 0.5); // calcula o juros
              cont +=1;
          } // fim do while
          System.out.println("Serao necessarios " + cont + " meses para alcancar o montante desejavel"); // saida de dados para informar a qnt de meses necessarios
	    }// fim do método main
    }
