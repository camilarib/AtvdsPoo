//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 31/07/2023
*/

//Classe que contém o programa principal
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        cachorro cachorro1 = new cachorro("caramelo", 3, "vira-lata");

        // Exibindo informações específicas do cachorro
        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Idade: " + cachorro1.idade);
        System.out.println("Raça: " + cachorro1.raca);
        cachorro1.emitirSom(); //chama o metodo emitirSom
        cachorro1.mover(); //chama o metodo move
        cachorro1.abanarRabo(); //chama o metodo abanarRabo

        // Criando um objeto da classe Passaro
        passaros passaro1 = new passaros("calopsita", 1, "Amarelo");

        // Exibindo informações específicas do pássaro
        System.out.println("\nNome: " + passaro1.nome);
        System.out.println("Idade: " + passaro1.idade);
        System.out.println("Cor: " + passaro1.cor);
        passaro1.emitirSom(); //chama o metodo emitirSom
        passaro1.voar();//chama o metodo voar
        passaro1.construirNinho();//chama o metodo construirNinho
    }
}