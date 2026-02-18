package application.port;

import domain.entity.model.Usuario;
import java.util.List;

public interface UsuarioRepository {

    void salvar(Usuario usuario);

    boolean existePorCpf(String cpf);

    boolean existePorEmail(String email);

    Usuario buscarPorCpf(String cpf);

    List<Usuario> listar();
}

