# Atv04
* Exercício: Atualmente os gastos mensais de uma empresa são detalhados em planilhas eletrônicas. Assim, para fechar o balanço do
primeiro trimestre, é necessário somar o gasto total destas planilhas. Sabendo que, em janeiro, foram gastos R$ 30.000,00 reais, em 
fevereiro, R$ 33.030,77 reais e em março, R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, 
seguindo os seguintes passos:

* a) Crie uma classe chamada BalancoTrimestral com o método main;
* b) No método principal, declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro;
* c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;
* d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;
* e) Exiba a variável gastosTrimestre.

      /*
      IFPR - Campus Cascavel
      Curso: Informatica
      Diciplina: Programação Orientada à Objetos
      Professor: Nelson Bellincanta
      Aluna: Camila Ribeiro Gonçalves
      Data: 15/04/2023
      */
      public class BalancoTrimestral {// declaração da classe BalancoTrimestral
        public static void main (String[] args) { // declaração do metodo main
            //declaração das variaveis gastos
            double gastosJaneiro = 30000.00;
            double gastosFevereiro = 33030.77;
            double gastosMarco = 23899.01;
            double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; // declara a variavel e inicializa a soma
            System.out.println("Gastos Trimestrais: "+gastosTrimestre); // print
        }//fim do metodo main
      }//fim da classe BalancoTrimestral//
