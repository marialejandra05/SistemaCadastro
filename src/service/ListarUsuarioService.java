package service;
import model.Usuario;
import service.UsuarioRepository;

import model.Usuario;

import java.util.List;

public class ListarUsuarioService implements  AcaoSistema {

    @Override
    public void executar() {
        List<Usuario> usuarios = UsuarioRepository.listar();

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("\n USUÁRIOS CADASTRADOS: ");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email " + usuario.getEmail());
        }

        System.out.println("------------------------");
    }
}