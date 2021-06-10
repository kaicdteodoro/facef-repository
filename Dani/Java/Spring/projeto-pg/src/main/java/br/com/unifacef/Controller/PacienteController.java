package br.com.unifacef.Controller;

import br.com.unifacef.Model.Paciente;
import br.com.unifacef.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @GetMapping("/paciente")
    public List<Paciente> get(){
        return repository.findAll();
    }

    @PostMapping("/paciente")
    public String add(@RequestBody Paciente paciente) {
        repository.save(paciente);
        return "Salvo com Sucesso!";
    }

    @DeleteMapping("/paciente/{id}")
    public String delete(@PathVariable Long id)
    {
     repository.deleteById(id);
     return "Removido com sucesso!";
    }

    @PutMapping("/paciente")
    public String update(@RequestBody Paciente paciente){
        repository.save(paciente);
        return "Atualizado com Sucesso!";
    }
}
