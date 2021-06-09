package br.com.unifacef.Controller;

import br.com.unifacef.Model.Medico;
import br.com.unifacef.Repository.MedicoRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicoController {
    MedicoRepository repository;

    public void add(@RequestBody Medico medico) {
        repository.save(medico);
    }

    public List<Medico> get() {
        return repository.findAll();
    }
}
