# Atv01
* Ecercício: Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos 
inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

# Código:
    IFPR - Campus Cascavel
    Curso: Informatica
    Diciplina: Programação Orientada à Objetos
    Professor: Nelson Bellincanta
    Aluna: Camila Ribeiro Gonçalves
    Data: 14/04/2023
     */

    import java.util.Scanner; // importa a classe Scanner que será uzada para receber a entrada do usuário

         public class Atv01 { // declara a classe Atv01
         public static void main(String[]args) { // declaração do método main
         int soma, n1, n2; //criação das variaveis n1, n2 e n3
         Scanner i = new Scanner(System.in); // cria uma nova insttancia da classe Scanner, o i será o que o usuario irá digitar
    
         System.out.println("Digite o primmerio numero: "); //print
         n1 = i.nextInt();
    
         System.out.println("Digite o segundo numero: "); //print
         n2 = i.nextInt(); // coloca a resposta na var n2
    
         soma = n1 + n2; //soma o que foi digitado na var soma
         System.out.println(n1 + "+" + n2 + "=" + soma); // print do resultado da soma
         i.close(); // fecha o Scanner
    }// fim do metodo main
    } // fim da classe Atv01
