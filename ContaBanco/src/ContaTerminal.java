import java.util.Scanner;

 //TODO: Conhcer e importar a classe Scanner
    
    // Exibir as mensagens para o nosso usuário

    //Obter pela scanner os valores digitados no terminal

    //Exibir a mensagem conta criada ;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
   
    int [] numeroConta = new int[4];
    String [] agencia = new String[5];
    String [] nomeCliente = new String[30];
    double [] saldo = new double[5];
    
    System.out.println("Por favor, digite o número da conta !");
    numeroConta[0] = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("Por favor digite o numero da sua Agencia");
    agencia[0] = scanner.nextLine();

    System.out.println("Por favor digite o seu nome");
    nomeCliente[0] = scanner.nextLine();

    System.out.println("Por favor digite o saldo");
    saldo[0] = scanner.nextDouble();

    System.out.println("Olá, " + nomeCliente[0] + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia[0] + " , conta " + numeroConta[0] + " e seu saldo de  " + saldo[0] + "já está disponivel para saque ");


    }
}