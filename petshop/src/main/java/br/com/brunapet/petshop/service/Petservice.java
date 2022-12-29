package br.com.brunapet.petshop.service;

import java.util.List;
import java.util.Optional;
import br.com.brunapet.petshop.model.Pet;

public interface Petservice {
    List<Pet>obterTodosOsPet();
    Optional<Pet> obterPetPorId(String id);
    void excluirPetPorId(String id);
    Pet cadastrarPet (Pet pet);
    Optional <Pet> atualizarPetPorId (String id,Pet pet);
}
