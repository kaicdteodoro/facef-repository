package br.com.unifacef.Controller;

import br.com.unifacef.Model.Cliente;
import br.com.unifacef.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository repository;

    @CrossOrigin(origins = "*")
    @GetMapping("/cliente")
    public List<Cliente> get() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/cliente")
    public String add(@RequestBody Cliente cliente) {
        try {
            repository.save(cliente);
            return "success";
        } catch (Exception exception) {
            return "error";
        }

    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/cliente/{id}")
    public String delete(@PathVariable Long id) {

        try {
            repository.deleteById(id);
            return "success";
        } catch (Exception exception) {
            return "error";
        }
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/cliente")
    public String update(@RequestBody Cliente cliente) {

        try {
            repository.save(cliente);
            return "success";
        } catch (Exception exception) {
            return "error";
        }
    }

    @CrossOrigin(origins = "*")
    @PatchMapping("/cliente/{id}")
    public Object show(@PathVariable Long id) {
        return repository.findById(id);
    }

}
