package ui;
import java.util.Scanner;

public class EntradaUsuario {

    private static Scanner scanner = new Scanner(System.in);

    public static int lerOpcao(){

        String entrada = scanner.nextLine();
        if (!entrada.matches("[1-3]")){
            System.out.println("Digite apenas números!");
            return -1;

        }

        return Integer.parseInt(entrada);

    }
}
