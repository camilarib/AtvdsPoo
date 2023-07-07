//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 07/07/2023
*/

public class testePessoa { //inicio da class teste
    public static void main(String[] args){ //inicio do metodo main
        Pessoa pessoa = new Pessoa(); //nova instancia para a classe

        // Acessando e modificando os atributos da pessoa
        pessoa.setNome("Camis");
        pessoa.setIdade(22);
        pessoa.setAltura(1.68);

        // print dos valores dos atributos e exibindo no console
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    } //fim do metodo main
}//fim da class teste
