import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine(); 
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite sua conta!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " sua conta é " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}