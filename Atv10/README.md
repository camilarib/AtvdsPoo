# Atv10
* Exercício: Crie uma classe chamada "Pessoa" com os seguintes atributos privados: "nome" (do tipo String), "idade" (do tipo int) e "altura" (do tipo double).
Em seguida, implemente métodos públicos para acessar e modificar esses atributos, respeitando o princípio de encapsulamento.
* Crie uma classe para testar o funcionamento da classe "Pessoa".

* Pessoa.Java - Código:

      // Classe impressão de texto: 
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

* testePessoa.Java - Código:

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
