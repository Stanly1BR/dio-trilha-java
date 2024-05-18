import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero =0, saldo=0, agencia=0;
        String nomeCliente ="";

        System.out.print("QUAL O NUMERO??: ");
        numero=scanner.nextInt();
        System.out.print("QUAL A AGENCIA??: ");
        agencia=scanner.nextInt();
        System.out.print("QUAL O NOME DO CLIENTE COMPLETO?!: ");
        nomeCliente=scanner.next();
        System.out.print("QUAL O SALDO??: ");
        saldo=scanner.nextInt();
        System.out.print("Olá "+nomeCliente+",\nobrigado por criar uma conta em nosso banco,\nsua agência é "+agencia+",\n conta "+numero+"\ne seu saldo "+saldo+"\njá está disponível para saque");

    }
}
