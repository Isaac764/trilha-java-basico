import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para os nossos usuários
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua Agência: ");
        String Agência = scanner.next();

        double saldo = 150.00;
        System.out.println(saldo);

        //Exibir a mensagem da conta criada 
        System.out.println("Olá " + nome + " " + sobrenome + "obrigado por criar uma conta em nosso banco! ");
        System.out.println("Sua conta é: " + numero + "");
        System.out.println("Sua Agência: " + Agência + " ");
        System.out.println("Seu saldo de " + saldo + ", já está disponível para saque! ");
        
    }
}
