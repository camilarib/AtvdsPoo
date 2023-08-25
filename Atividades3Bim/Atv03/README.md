* IFPR - Campus Cascavel
* Curso: Informatica
* Diciplina: Programação Orientada à Objetos
* Professor: Nelson Bellincanta
* Aluna: Camila Ribeiro Gonçalves
* Data: 25/08/2023

# Atv03
* Proposta da atividade:
> Suponha que você está desenvolvendo um sistema de gerenciamento de veículos para uma concessionária. Você precisa modelar
diferentes tipos de veículos, como carros e motos, e também precisa implementar funcionalidades específicas para cada tipo de veículo.

> Crie uma classe base chamada "Veiculo". Ela deve ter atributos como "marca", "modelo" e "ano". Crie um construtor para inicializar esses
atributos e métodos de acesso (getters e setters) para eles.

> Crie duas classes filhas: "Carro" e "Moto", ambas herdam da classe "Veiculo". Essas classes devem ter atributos adicionais específicos,
como "numeroDePortas" para carros e "cilindradas" para motos. Crie construtores para inicializar esses atributos e também implemente métodos de acesso.

> Na classe "Veiculo", crie um método chamado "exibirDetalhes" que imprime as informações básicas do veículo (marca, modelo, ano).
Agora, para cada classe filha (Carro e Moto), sobrescreva o método "exibirDetalhes" para também incluir os atributos específicos desses veículos.

> Crie uma classe de teste chamada "TesteVeiculos" com o método "main". Dentro desse método, crie instâncias de carros e motos, configure seus atributos
e chame o método "exibirDetalhes" para verificar se a sobreposição de métodos está funcionando corretamente.

* código da classe Veiculo:

      class Veiculo { //inicio da classe veiculo

        //atributos privados da classe veiculo
        private String marca;
        private String modelo;
        private int ano;

        public Veiculo(String marca, String modelo, int ano) { //construtor da classe veiculo
          //inicialização dos atributos com os valores fornecidos
          this.marca = marca;
          this.modelo = modelo;
          this.ano = ano;
        }

        // metodo de acesso para os atributos
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
          this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
  
        //exibe as informações do veículo
        public void exibirDetalhes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
          }
      }//fim da classe veiculo
* código da classe Carro:

      class Carro extends Veiculo { //inicio da classe carro que herda de veiculo
          private int numeroDePortas; //atributo privado da classe carro
    
          public Carro(String marca, String modelo, int ano, int numeroDePortas) { // Construtor da classe Carro
              super(marca, modelo, ano);
              this.numeroDePortas = numeroDePortas;
          }
      
          // método de acesso para ob atributo
          public int getNumeroDePortas() {
              return numeroDePortas;
          }
      
          public void setNumeroDePortas(int numeroDePortas) {
              this.numeroDePortas = numeroDePortas;
          }
      
          // Sobrescrita do método exibirDetalhes para incluir atributos específicos
          @Override
          public void exibirDetalhes() {
              super.exibirDetalhes();
              System.out.println("Número de Portas: " + numeroDePortas);
          }
      }//fim da classe Carro
* código da classe Moto:

      class Moto extends Veiculo { //inicio da classe Moto que herda de veiculo
          private int cilindradas; //atributo privado da classe Moto
      
          public Moto(String marca, String modelo, int ano, int cilindradas) {//Construtor da classe Moto
              super(marca, modelo, ano);
              this.cilindradas = cilindradas;
          }
      
          // método de acesso para ob atributo
          public int getCilindradas() {
              return cilindradas;
          }
      
          public void setCilindradas(int cilindradas) {
              this.cilindradas = cilindradas;
          }
      
          // Sobrescrita do método exibirDetalhes para incluir atributos específicos
          @Override
          public void exibirDetalhes() {
              super.exibirDetalhes();
              System.out.println("Cilindradas: " + cilindradas);
          }  
      }//fim da classe Moto
* código da classe TesteVeiculos:

      public class TesteVeiculos {
        public static void main(String[] args) {
            // Criando uma instância de Carro
            Carro carro = new Carro("Porsche", "911 Carrera T", 2024, 2);
            carro.exibirDetalhes();
    
            System.out.println();//print 
    
            // Criando uma instância de Moto
            Moto moto = new Moto("Kawasaki", "Z650", 2021, 649);
            moto.exibirDetalhes();
        }
      }
