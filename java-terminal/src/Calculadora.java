/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação dessa classe
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Luciano Fernandes
 * @version 1.0
 * @since 26/07/2024
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros.
     * @param numeroUm este é o primeiro parâmetro do método.
     * @param numeroDois este é o segundo parâmetro do método.
     * @return int o resultado deste método é a soma dos dois parâmetros.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    /**
     * Método principal que executa a aplicação.
     * @param args argumentos de linha de comando.
     */
    public static void main(String[] args) {
        // Criando uma instância da classe Calculadora
        Calculadora calc = new Calculadora();

        // Chamando o método somar e armazenando o resultado
        int resultado = calc.somar(10, 5);

        // Imprimindo o resultado
        System.out.println("O resultado da soma é: " + resultado);
    }
}