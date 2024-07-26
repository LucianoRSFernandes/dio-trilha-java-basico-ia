import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
   public static void main(String[] args) {
       //criando o objeto scanner
       Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

       System.out.println("Digite seu Nome: ");
       String nome = scanner.next();

       System.out.println("Digite seu Sobrenome: ");
       String sobrenome = scanner.next();

       System.out.println("Digite sua idade: ");
       int idade = scanner.nextInt();

       System.out.println("Digite sua altura: ");
       double altura = scanner.nextDouble();


       //imprimindo os dados obtidos do usuários
       System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
       System.out.println("Tenho " + idade + " anos");
       System.out.println("Minha altura é " + altura + " cm");


   } 
}
