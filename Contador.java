import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem-vindo ao contador, subtraia 2 números para ele contar");
        System.out.println("Coloque o primeiro número: ");
        int parametroUm = teclado.nextInt();
        System.out.println("Agora coloque o segundo: ");
        int parametroDois = teclado.nextInt();

        try{
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e){
            System.out.println("ATENÇÃO!!");
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem = parametroUm - parametroDois;
                if(contagem < 0){
                    throw new ParametrosInvalidosException();
                } else {
                    for(int i = 0; i < contagem; i++){
                        System.out.println("Imprimindo o número " + (i+1));
                    }
                }
    }

    private static class ParametrosInvalidosException extends Exception {
    }
}
