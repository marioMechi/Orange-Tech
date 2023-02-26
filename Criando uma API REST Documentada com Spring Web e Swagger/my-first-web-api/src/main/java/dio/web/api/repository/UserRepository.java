package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

        public void save(Usuario usuario){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
            System.out.println(usuario);
        }
        public void update(Usuario usuario){
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
            System.out.println(usuario);
        }
        public void remove(Integer id){
            System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
            System.out.println(id);
        }
        public List<Usuario> listAll(){
            List<Usuario> usuarios = new ArrayList<>();
            usuarios.add(new Usuario("gleyson","password"));
            usuarios.add(new Usuario("frank","masterpass"));
            return usuarios;
        }
        public Usuario finById(Integer id){
            System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
            return new Usuario("gleyson","password");
        }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendoo username: %s para localizar o usuario", username));
        return new Usuario("gleyson", "password");
    }

    public void deleteById(Integer id) {
        new Usuario(0);
    }

}
