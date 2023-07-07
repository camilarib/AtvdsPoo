//Classe impressão de texto: 
/*
IFPR - Campus Cascavel
Curso: Informatica
Diciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta
Aluna: Camila Ribeiro Gonçalves
Data: 07/07/2023
*/

public class testeEmprestimo {
    public class TesteEmprestimo {
        public void main(String[] args) {
            // Criação dos objetos Emprestimo
            Emprestimo E1 = new Emprestimo(1000.0, 5.0, 3);
            Emprestimo E2 = new Emprestimo(2000.0, 8.0, 5);

            // Exibição das parcelas em paralelo
            double parcelaE1, parcelaE2;

            do {
                parcelaE1 = E1.proximaParcela();  // pega a próxima parcela de E1
                parcelaE2 = E2.proximaParcela();  // pega a próxima parcela de E2

                // Exibe as parcelas se ainda houver
                if (parcelaE1 != -1) {
                   System.out.println("Empréstimo 1 - Parcela " + E1.getParcelaAtual() + ": R$ " + parcelaE1);
                }

                if (parcelaE2 != -1) {
                    System.out.println("Empréstimo 2 - Parcela " + E2.getParcelaAtual() + ": R$ " + parcelaE2);
                }
            } while (parcelaE1 != -1 || parcelaE2 != -1);  // Continua enquanto houver parcelas em pelo menos um empréstimo
    }
    }
}
