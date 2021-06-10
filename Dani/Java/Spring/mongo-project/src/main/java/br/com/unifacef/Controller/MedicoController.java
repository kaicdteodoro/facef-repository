package br.com.unifacef.Controller;

import br.com.unifacef.Model.Medico;
import br.com.unifacef.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicoController {
    @Autowired
    MedicoRepository repository;

    @PostMapping("create/medico")
    public void add(@RequestBody Medico medico) {
        repository.save(medico);
    }
    @GetMapping("medico")
    public List<Medico> get() {
        return repository.findAll();
    }
}
