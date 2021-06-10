package br.com.unifacef.Controller;

import br.com.unifacef.Model.Paciente;
import br.com.unifacef.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping("/create/paciente")
    public void add(@RequestBody Paciente paciente) {
      repository.save(paciente);
    }

    @GetMapping("/paciente")
    public List<Paciente> get() {
       return repository.findAll();
    }

}
