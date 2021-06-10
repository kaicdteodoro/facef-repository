package br.com.unifacef.Controller;

import br.com.unifacef.Model.Medico;
import br.com.unifacef.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicoController {

    @Autowired
    MedicoRepository repository;

    @GetMapping("/medico")
    public List<Medico> get () {
        return repository.findAll();
    }

    @PostMapping("/medico")
    public String add(@RequestBody Medico medico) {
        repository.save(medico);
        return "Salvo com sucesso!";
    }

    @PutMapping("/medico")
    public String update(@RequestBody Medico medico) {
        repository.save(medico);
        return "Atualizado com sucesso!";
    }

    @DeleteMapping("/medico/{id}")
    public String add(@PathVariable Long id) {
        repository.deleteById(id);
        return "Removido com sucesso!";
    }

}
