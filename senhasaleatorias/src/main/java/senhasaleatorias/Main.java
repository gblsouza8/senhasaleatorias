package senhasaleatorias;
import java.util.Random;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int qtd;


        Scanner in = new Scanner(System.in);
        System.out.println("Insira a quantidade de caracteres na senha: ");
        qtd = in.nextInt();
        in.close();


        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%¨&()_-+=";
        Random aleatorio = new Random();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtd; i++) {
            int indice = aleatorio.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println("Sua senha com " + qtd + " caracteres aleatórios é: " + senha.toString());

        }
}