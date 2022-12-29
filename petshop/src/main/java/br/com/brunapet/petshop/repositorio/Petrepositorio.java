package br.com.brunapet.petshop.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.brunapet.petshop.model.Pet;

public interface Petrepositorio extends MongoRepository<Pet,String> {
    
}
