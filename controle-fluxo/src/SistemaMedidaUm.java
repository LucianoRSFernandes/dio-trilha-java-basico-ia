// Condicional If/Else
public class SistemaMedidaUm {
    public static void main(String[] args) {
        String sigla = "L";

        if  (sigla == "P")
            System.out.println("Pequeno");
        else if (sigla == "M")
            System.out.println("Médio");
        else if (sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");
    }
}
