package dio.web.api.controller;

import dio.web.api.handler.BusinessException;
import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    public UserRepository repository;
    @GetMapping
    public List<Usuario>getUsers(){
        return repository.listAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable ("username")String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/{id}")
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping("/{id}")
    public void put(@RequestBody Usuario usuario){
        if(usuario.getLogin()==null)
            throw new BusinessException("O campo login é obrigatório");
        repository.save(usuario);
    }
}
