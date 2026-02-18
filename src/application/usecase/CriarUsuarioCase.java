package application.usecase;

import application.port.UsuarioRepository;
import domain.entity.model.Usuario;

public class CriarUsuarioUseCase {

    private final UsuarioRepository usuarioRepository;

    public CriarUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void executar(String nome, String email, String cpf) {

        if (usuarioRepository.existePorCpf(cpf)) {
            throw new IllegalArgumentException("CPF já cadastrado.");
        }

        if (usuarioRepository.existePorEmail(email)) {
            throw new IllegalArgumentException("Email já cadastrado.");
        }

        Usuario usuario = new Usuario(nome, email, cpf);

        usuarioRepository.salvar(usuario);
    }
}
