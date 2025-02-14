import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite seu nome!");
        scanner.nextLine();
        String nome_cliente = scanner.nextLine();;
        System.out.println("Por favor, digite o numero da sua conta!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o saldo que deseja colocar na conta!");
        double saldo = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
        nome_cliente, agencia, numero, saldo);
        scanner.close();
    }
}
