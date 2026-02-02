package ui;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EntradaUsuario {

    private static Scanner scanner = new Scanner(System.in);

    public static String lerTexto() {
        return scanner.nextLine();
    }

    public static int lerOpcao(){
        while (true){
            String entrada = scanner.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e){
                System.out.println("Digite um número válido: ");

            }
        }
    }


}
