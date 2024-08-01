//Condicional Encadeada
public class NovoResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
        if (nota >= 7)
        System.out.println("aprovado");

        else if (nota >= 5 && nota < 7)//true or false
        System.out.println("Recupareção");

        else
        System.out.println("Reprovado");
    }
}
