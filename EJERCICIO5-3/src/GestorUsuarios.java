import java.util.ArrayList;

public class GestorUsuarios {
    private ArrayList<Usuario> usuarios;

    // Constructor
    public GestorUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void cargarUsuariosDesdeArchivo(String nombreArchivo) {

    }

    public Usuario buscarUsuarioPorEmail(String email) {
        // Asumiendo que cada usuario tiene un campo de email
        usuarios.add(new Usuario("", "", email));
        int i = 0;
        while (!usuarios.get(i).getEmail().equals(email)) {
            i++;
        }
        usuarios.remove(usuarios.size() - 1);
        if (i < usuarios.size()) {
            return usuarios.get(i);
        } else {
            return null;
        }
    }
}
