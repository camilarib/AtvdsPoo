//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 31/07/2023
*/

public class Aves { //inicio da classe aves
    // cria atributos
    protected String nome;
    protected int idade;

    // Construtor
    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para emitir o som da ave
    public void emitirSom() {//inicio do metodo emitir som
        System.out.println("emitir som:");
    }// fim do metodo

    // Método para o voo da ave
    public void voar() { //inicio do metodo voar
        System.out.println(nome + "esta voando:");
    }//fim do metodo

    public void informacoes() { //inicio do metodo informaçoes
        System.out.println("Nome: " + nome); //print do nome da ave
        System.out.println("Idade: " + idade); ///print da idade da ave
    }//fim do metodo informaçoes

}//fim da classe aves
