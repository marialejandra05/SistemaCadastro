package service;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;


public class UsuarioRepository {

    private static List<Usuario> usuarios = new ArrayList<>();

    public static void salvar (Usuario usuario){
        usuarios.add (usuario);

    }

    public static List<Usuario> listar (){
        return  usuarios;

    }




}
