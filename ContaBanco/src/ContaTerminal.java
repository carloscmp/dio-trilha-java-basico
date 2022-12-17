import java.util.Scanner;

public class ContaTerminal {

    // TODO: conhecer e importar a classe scanner
    // Exibir as mensagens para o nosso usuario
    // obter pela scanner os valores digitados no terminal
    // exibir a mensagem conta criada
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da gência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo: ");
        float saldo = scanner.nextFloat();

        float saldof = saldo;

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo ");
        System.out.printf("%.2f", saldo );
        System.out.println(" já está disponível para saque. ");
    }

}
