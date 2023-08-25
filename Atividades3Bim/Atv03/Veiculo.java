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
