import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o Número da sua Agência:");
            int numeroAgencia = scanner.nextInt();

            System.out.println("Digite o seu nome:");
            String nomeCliente = scanner.next();

            System.out.println("Digite o Numero da sua Conta:");
            String numeroConta = scanner.next();

            System.out.println("digite o seu saldo:");
            double saldo = scanner.nextDouble();

            System.err.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        }
    }
}
