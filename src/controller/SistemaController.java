package controller;

import service.*;

public class SistemaController {

    private AcaoSistema cadastrar = new CadastrarUsuarioService();
    private AcaoSistema listar = new ListarUsuarioService();
    private AcaoSistema sair = new SairSistemaService();
    private AcaoSistema invalida = new OpcaoInvalidaService();

    public boolean processarOpcao(int opcao){

    switch (opcao){
        case 1:
            cadastrar.executar();
            return true;

        case 2:
            listar.executar();
            return true;

        case 3:
            sair.executar();
            return false;

        default:
            invalida.executar();
            return true;


        }
    }

}