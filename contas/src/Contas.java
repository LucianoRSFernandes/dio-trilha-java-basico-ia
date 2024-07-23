public class Contas {
    // variável da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        // variável local de método
        double novoSaldo = saldo - valor;
        saldo = novoSaldo; // Atualiza o saldo
    }

    public void imprimirSaldo() {
        // disponível em toda classe
        System.out.println(saldo);
        // somente o método sacar conhece esta variável
        // System.out.println(novoSaldo); // Linha removida, pois novoSaldo não está no escopo deste método
    }

    public double calcularDividaExponencial() {
        // variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável
        for (int x = 1; x <= 5; x++) { // x variável de escopo            
            // esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado; // Corrigido com ponto e vírgula
        }
        // escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis

        return valorMontante;
    }

    public static void main(String[] args) {
        Contas conta = new Contas();
        conta.imprimirSaldo();
        conta.sacar(2.0);
        conta.imprimirSaldo();
        double divida = conta.calcularDividaExponencial();
        System.out.println("Dívida exponencial: " + divida);
    }
}