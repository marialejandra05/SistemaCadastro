package repository;

import domain.entity.model.Usuario;
import java.util.ArrayList;
import java.util.List;


public class UsuarioRepository {

    private static List<Usuario> usuarios = new ArrayList<>();

    public static void salvar(Usuario usuario) {
        usuarios.add(usuario);

    }

    public static List<Usuario> listar() {
        return usuarios;

    }

    public static boolean existeEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return true;

            }
        }

        return false;
    }

}