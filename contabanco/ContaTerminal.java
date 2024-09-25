import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nome;
        float saldo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá digite seu número");
        numero = teclado.nextInt();
        System.out.println("Digite sua agência");
        agencia = teclado.next();
        System.out.println("Digite seu nome");
        nome = teclado.next();
        System.out.println("Digite seu saldo");
        saldo = teclado.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.02f já está disponível para saque", nome, agencia,numero, saldo  );
    }
}