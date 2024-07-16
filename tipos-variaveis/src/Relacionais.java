public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que o numeroDois? " + simNao);

        if (numero1 < numero2){
            System.out.println ("Nossa condição é verdadeira");
        }
        String nomeUm = "LUCIANO";
        String nomeDois = new String ("FERNANDES");

        System.out.println(nomeUm.equals(nomeDois));
        /*Trabalhando com Objetos ao invés de variáveis utiliza-se equals no lugar de == */
    }
}
