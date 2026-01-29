package controller;

import service.CadastrarUsuarioService;
import service.ListarUsuarioService;
import service.OpcaoInvalidaService;
import service.SairSistemaService;

public class SistemaController {

    private CadastrarUsuarioService cadastrarUsuarioService = new CadastrarUsuarioService();
    private ListarUsuarioService listarUsuarioService = new ListarUsuarioService();
    private SairSistemaService sairSistemaService = new SairSistemaService();
    private OpcaoInvalidaService opcaoInvalidaService = new OpcaoInvalidaService();

    public boolean processarOpcao(int opcao){

        switch (opcao){
            case 1:
                cadastrarUsuarioService.executar();
                return true;
            case 2:
                listarUsuarioService.executar();
                return true;
            case 3:
                sairSistemaService.executar();
                return false;


            default:
                opcaoInvalidaService.executar();
                return true;

        }
    }
}
