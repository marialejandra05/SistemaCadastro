package service;

import model.Usuario;
import repository.UsuarioRepository;
import ui.EntradaUsuario;

public class CadastrarUsuarioService implements AcaoSistema{

    @Override
    public void executar() {
        System.out.print("Nome: ");
        String nome = EntradaUsuario.lerTexto();
        if (nome.isBlank()){
            System.out.println("Nome não pode ser vazio. ");
            return;
        }

        System.out.print("Email: ");
        String email = EntradaUsuario.lerTexto();
        if (email.isBlank()){
            System.out.println("Email não pode estar vazio.");
            return;
        }

        if (UsuarioRepository.existeEmail(email)){
            System.out.println("Já existe um usuário com esse email. ");
            return;
        }

        System.out.print("Senha: ");
        String senha = EntradaUsuario.lerTexto();

        if(senha.isBlank()){
            System.out.println("Senha não pode ser vazia. ");
            return;
        }


        Usuario usuario = new Usuario(nome, email, senha);

        UsuarioRepository.salvar(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
        }


    }
