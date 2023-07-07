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
