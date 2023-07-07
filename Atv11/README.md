# Atv11
* Exercício: Você foi contratado para desenvolver um programa que gerencie empréstimos financeiros. Sua tarefa é implementar a classe Emprestimo em Java, que representa cada empréstimo realizado.
  Cada objeto da classe Emprestimo será responsável por calcular e armazenar as parcelas correspondentes ao empréstimo.
  
A classe Emprestimo deve ser construída com os seguintes atributos: valorTotal (representando o valor total do empréstimo), taxaJuros (indicando o percentual de juros mensal) e numeroParcelas
(representando a quantidade de parcelas do empréstimo).

Além disso, a classe deve possuir um método chamado proximaParcela(), que não recebe parâmetros e retorna o valor da próxima parcela a ser paga. Cada vez que esse método é invocado, ele deve 
retornar o valor correspondente à próxima parcela. Caso não haja mais parcelas a serem pagas, o método deve retornar -1.

Seu programa deve criar dois objetos Emprestimo, chamados E1 e E2, com valores diferentes para valorTotal, taxaJuros e numeroParcelas. Após a criação dos objetos, seu programa deve exibir as parcelas
dos empréstimos em paralelo, ou seja, a primeira parcela de E1 deve ser exibida junto com a primeira parcela de E2, a segunda parcela de E1 com a segunda parcela de E2 e assim por diante. O programa deve
continuar exibindo as parcelas enquanto houver parcelas restantes em pelo menos um dos empréstimos.

Você deve implementar a solução em Java, criando a classe Emprestimo com o construtor e o método descritos, além de utilizar um loop e as chamadas adequadas para exibir as parcelas dos empréstimos em paralelo.

* Emprestimo.java - Código

      //Classe impressão de texto: 
      /*
      IFPR - Campus Cascavel
      Curso: Informatica
      Diciplina: Programação Orientada à Objetos
      Professor: Nelson Bellincanta
      Aluna: Camila Ribeiro Gonçalves
      Data: 07/07/2023
      */

      public class Emprestimo { //inicio da classe emprestimo  
          private double valorTotal; //atributo privado do tipo double para valorTotal
          private double taxaJuros; //atributo privado do tipo double para taxaJuros
          private int numParcelas; //atributo privado do tipo int para numParcelas
          private int parcelaAtual; //atributo privado do tipo int para parcelaAtual
      
      
          public Emprestimo(double valorTotal, double taxaJuros, int numParcelas) {
              this.valorTotal = valorTotal;
              this.taxaJuros = taxaJuros;
              this.numParcelas = numParcelas;
              this.setParcelaAtual(1);
          }
          public int getParcelaAtual() {
              return parcelaAtual;
          }
          public void setParcelaAtual(int parcelaAtual) {
              this.parcelaAtual = parcelaAtual;
          }
          public double proximaParcela() {
              if (getParcelaAtual() <= numParcelas) {  // Verifica se existe mais parcelas a pagar
                  double valorParcela = valorTotal / numParcelas;  // Calcula o valor da parcela
                  double jurosParcela = valorParcela * taxaJuros / 100;  // Calcula o valor dos juros
                  double valorTotalParcela = valorParcela + jurosParcela;  // Calcula o valor total da parcela
      
                  setParcelaAtual(getParcelaAtual() + 1);  // Incrementa o número da parcela atual
                  return valorTotalParcela;  // Retorna o valor total da parcela
              } else {
                  return -1;  // Retorna -1 quando não há mais parcelas a serem pagas
              }
          }
      } //fim da classe emprestimo

* testeEmprestimo.java - Código

      //Classe impressão de texto: 
      /*
      IFPR - Campus Cascavel
      Curso: Informatica
      Diciplina: Programação Orientada à Objetos
      Professor: Nelson Bellincanta
      Aluna: Camila Ribeiro Gonçalves
      Data: 07/07/2023
      */
      
      public class testeEmprestimo {
          public class TesteEmprestimo {
              public void main(String[] args) {
                  // Criação dos objetos Emprestimo
                  Emprestimo E1 = new Emprestimo(1000.0, 5.0, 3);
                  Emprestimo E2 = new Emprestimo(2000.0, 8.0, 5);
      
                  // Exibição das parcelas em paralelo
                  double parcelaE1, parcelaE2;
      
                  do {
                      parcelaE1 = E1.proximaParcela();  // pega a próxima parcela de E1
                      parcelaE2 = E2.proximaParcela();  // pega a próxima parcela de E2
      
                      // Exibe as parcelas se ainda houver
                      if (parcelaE1 != -1) {
                         System.out.println("Empréstimo 1 - Parcela " + E1.getParcelaAtual() + ": R$ " + parcelaE1);
                      }
      
                      if (parcelaE2 != -1) {
                          System.out.println("Empréstimo 2 - Parcela " + E2.getParcelaAtual() + ": R$ " + parcelaE2);
                      }
                  } while (parcelaE1 != -1 || parcelaE2 != -1);  // Continua enquanto houver parcelas em pelo menos um empréstimo
          }
          }
      }
