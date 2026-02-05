import interfaceadapter.ui.Menu;
import interfaceadapter.ui.EntradaUsuario;
import interfaceadapter.controller.SistemaController;

public class Main {


    public static void main(String[] args) {

        Menu menu = new Menu();
        SistemaController controller = new SistemaController();

        boolean sistemaAtivo = true;

        while (sistemaAtivo) {

            menu.mostrar();
            int opcao = EntradaUsuario.lerOpcao();
            sistemaAtivo = controller.processarOpcao(opcao);
        }
    }
}
