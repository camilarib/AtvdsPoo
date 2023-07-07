//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 07/07/2023
*/

public class Pessoa{ //inicio da classe "Pessoa"
    private String nome; //atributo privado do tipo String para nome
    private int idade; //atributo privado do tipo int para idade
    private double altura; //atributo privado do tipo double para altura

    public Pessoa(String nome, int idade, double altura)
    {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    //acessa o atributo "nome"
    public String getNome(){
        return nome; //retorna o nome
    }
    //modifica o atributo "nome"
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    //acessa o atributo "Idade"
    public int getIdade(){
        return idade; //retorna a idade
    }
    //modifica o atributo "Idade"
    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    //acessa o atributo "Altura"
    public double getAltura(){
        return altura; //retorna a altura
    }
    //modifica o atributo "Altura"
    public void setAltura(double novaAltura){
        this.altura = novaAltura;
    }
}//fim da classe "Pessoa"