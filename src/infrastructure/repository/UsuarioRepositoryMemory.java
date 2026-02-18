package infrastructure.repository;

import application.port.UsuarioRepository;
import domain.entity.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryMemory implements UsuarioRepository {

    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public boolean existePorCpf(String cpf) {
        return usuarios.stream()
                .anyMatch(usuario -> usuario.getCpf().equals(cpf));
    }

    @Override
    public boolean existePorEmail(String email) {
        return usuarios.stream()
                .anyMatch(usuario -> usuario.getEmail().equals(email));
    }

    @Override
    public Usuario buscarPorCpf(String cpf) {
        return usuarios.stream()
                .filter(usuario -> usuario.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }
}
