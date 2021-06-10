package br.com.unifacef.Repository;


import br.com.unifacef.Model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {

}
