public class Incrementacao {
    public static void main(String[] args) {
        int numero = 5;
        //x repeticao
        numero = numero + 2;
        System.out.println(numero);
        numero = numero +1;
        System.out.println(numero);
        //numero +1 = numero++
        numero++;
        System.out.println(numero);
        //podemos adicionar o incremento direto no parametro
        // numero -1 = numero--
        System.out.println(--numero);
        System.out.println(numero -2);
    }
}
