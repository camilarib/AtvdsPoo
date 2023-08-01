//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 31/07/2023
*/

public class passaros extends Aves {
    String cor; //cria o atributo privado cor
    // Construtor
    public passaros(String nome, int idade, String cor) { //inicio da classe passaros 
        super(nome, idade); 
        this.cor = cor;
    }//fim da classe

    // Método adicional para construir o ninho do pássaro
    public void construirNinho() { //inicio do metodo construirNinho
        System.out.println("Construindo ninho");
    } //fi, do metodo construirNinho

    public void exibirInformacoes() { //inicio do metodo exibirInformacoes
        System.out.println("Nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Idade: " + idade);
    }// fim do metodo exibirInformacoes
}
