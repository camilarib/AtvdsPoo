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
