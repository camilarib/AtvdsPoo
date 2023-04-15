# Atv03
* Exercício: Usando a classe JOptionPane para entrada de dados, crie uma classe que receba a nota de duas provas e de um trabalho.
Calcule e mostre a média.

# Código:
    /*
    IFPR - Campus Cascavel
    Curso: Informatica
    Diciplina: Programação Orientada à Objetos
    Professor: Nelson Bellincanta
    Aluna: Camila Ribeiro Gonçalves
    Data: 14/04/2023
    */

    import javax.swing.*;

        public class Atv03 { //declaração da classe Atv03
              public static void main(String args[]) { // declaração do método main
              String i; //
              float prova1, prova2, trab, media; //

              //recebe a nota da prova 1 
              i = JOptionPane.showInputDialog("Digite a nota da prova1: ");
              prova1 = Float.parseFloat(i); // converte os dados para float

              //recebe a nota da prova 2
              i = JOptionPane.showInputDialog("Digite a nota da prova2: ");
              prova2 = Float.parseFloat(i); // converte os dados para float

              //recebe a nota do trab
              i = JOptionPane.showInputDialog("Digite a nota do trab: ");
              trab = Float.parseFloat(i); // converte os dados para float

              media = (prova1+prova2+trab)/3; // calcula a media
              JOptionPane.showInputDialog("Sua média é: " + media);
        } // fim do metodo main
    } // fim da classe Atv02
