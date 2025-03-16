import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lendo os dados como String
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String conta = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        // Exibindo os dados do exercicio
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
