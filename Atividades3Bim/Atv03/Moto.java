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
