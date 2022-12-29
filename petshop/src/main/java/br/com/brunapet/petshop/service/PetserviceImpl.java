package br.com.brunapet.petshop.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.brunapet.petshop.model.Pet;
import br.com.brunapet.petshop.repositorio.Petrepositorio;

@Service
public class PetserviceImpl implements Petservice {

    @Autowired Petrepositorio repositorio;

    @Override
    public List<Pet> obterTodosOsPet() {
       return repositorio.findAll();
    }

    @Override
    public Optional<Pet> obterPetPorId(String id) {
       return repositorio.findById(id);
    }

    @Override
    public void excluirPetPorId(String id) {
       repositorio.deleteById(id);
        
    }

    @Override
    public Pet cadastrarPet(Pet pet) {
        return repositorio.save(pet);
    }

    @Override
    public Optional <Pet> atualizarPetPorId(String id, Pet pet) {
        Optional<Pet> retorno = repositorio.findById(id);
        pet.setId(id);
        if(retorno.isPresent()){
            pet.setId(id);
            return Optional.of(repositorio.save(pet));
        }else{
            return null;
        }
       
    }
    
}
