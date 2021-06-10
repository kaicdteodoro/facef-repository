package br.com.unifacef.Repository;

import br.com.unifacef.Model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
