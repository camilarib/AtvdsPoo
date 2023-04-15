# Atv05
* Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem.
Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

# Código:
    /*
    IFPR - Campus Cascavel
    Curso: Informatica
    Diciplina: Programação Orientada à Objetos
    Professor: Nelson Bellincanta
    Aluna: Camila Ribeiro Gonçalves
    Data: 15/04/2023
    */
    
    public class BalancoTrimestral {
        public static void main (String[] args) { // declaração do metodo main
            //declaração das variaveis gastos
            double gastosJaneiro = 30000.00;
            double gastosFevereiro = 33030.77;
            double gastosMarco = 23899.01;
            double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; // declara a variavel e inicializa a soma
            System.out.println("Gastos Trimestrais: "+gastosTrimestre); // print
            double mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) /3;
            System.out.println("Valor da media mensal: " +mediaMensal);
       }//fim do metodo main
    }//fim da classe BalancoTrimestral//
