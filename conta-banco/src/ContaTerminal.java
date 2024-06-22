import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe scanner
        
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o nome completo do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor entre com o valor do saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();
        System.out.printf("Olá "+ nomeCliente + ", sua agência é a " +agencia+ ", conta de número " +numeroConta+ " e saldo de R$" +saldo);

    }
}
