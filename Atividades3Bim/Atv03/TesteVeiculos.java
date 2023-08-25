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
