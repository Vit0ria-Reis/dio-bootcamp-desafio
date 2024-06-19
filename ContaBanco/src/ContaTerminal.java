import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroDaAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.print("Por favor, digite o saldo da conta: ");
        float saldo = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroDaAgencia + " sua conta é " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}