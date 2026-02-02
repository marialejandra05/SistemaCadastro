package service;

import model.Usuario;
import ui.EntradaUsuario;

public class CadastrarUsuarioService implements AcaoSistema{

    @Override
    public void executar() {
        System.out.print("Nome: ");
        String nome = EntradaUsuario.lerTexto();

        System.out.print("Email: ");
        String email = EntradaUsuario.lerTexto();

        System.out.print("Senha: ");
        String senha = EntradaUsuario.lerTexto();

        Usuario usuario = new Usuario(nome, email, senha);

        UsuarioRepository.salvar(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
        }


    }
