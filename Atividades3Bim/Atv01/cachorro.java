//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 31/07/2023
*/

// Classe que representa a subclasse Cachorros, herdando de Mamíferos
public class cachorro extends mamifero {
    // Atributo adicional
    String raca;

    // Construtor
    public cachorro(String nome, int idade, String raca) {
        // Chamada ao construtor da superclasse para inicializar nome e idade
        super(nome, idade);
        this.raca = raca;
    }

    public void raca(){
        System.out.println("a raça do cachorro é: " + raca);
    }
  
    // Método para abanar o rabo do cachorro
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}