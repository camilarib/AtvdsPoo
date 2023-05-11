# Atv07
Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.

    /*
    IFPR - Campus Cascavel
    Curso: Informatica
    Diciplina: Programação Orientada à Objetos
    Professor: Nelson Bellincanta
    Aluna: Camila Ribeiro Gonçalves
    Data: 14/04/2023
    */

    import javax.swing.JOptionPane;
    import java.util.Arrays;

    public class NotasAlunos { //declara classe Atv07
          public static void main(String[] args){ //Declaracao do método main
              double[] notas = new double[5];

        //inicio do for para repetir a entrada da nota 5 vezes 
        for (int i = 0; i < 5; i++) { 
            String notaStr = JOptionPane.showInputDialog("Digite a nota do aluno: "+(i+1)+":");
            double nota = Double.parseDouble(notaStr);
            notas[i] = nota;
        }//fim do for
        Arrays.sort(notas);// ordenar as notas em ordem decrescente
        double media = calcularMedia(notas);//calcular a media das notas 
        JOptionPane.showMessageDialog(null, "Notas em ordem decrescente: "+ Arrays.toString(notas)+"media das notas: "+ media); //exibindo as notas decrescente e a media das notas em uma caixa de diálogo usando a classe JOptionPane
    }
    //calcula a media aritimetica das notas
    public static double calcularMedia(double[] notas){
        double soma = 0; //percorre o arrey somado todas as notas 
        for(double nota : notas){ // divide pela quantidade de elementos
            soma += nota;
        }
        return soma / notas.length; //exibe as notas ordenadas e a média em uma caixa de diálogo
      }
    } //fim da classe NotasAlunos
