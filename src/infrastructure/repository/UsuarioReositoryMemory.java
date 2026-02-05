package infrastructure.repository;
import java.util.List;
import domain.entity.model.Usuario;

public interface UsuarioReositoryMemory {

    void salvar (Usuario usuario);

    list<Usuario> listar ();

    boolean existeEmail(String email);
    Usuario buscarPorCpf(String cpf);



}
