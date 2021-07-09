package org.acme;

import org.acme.model.Pet;

import java.util.List;
public class PetsController implements org.acme.api.PetApi {

    public void addPet(Pet body) {

    }

    public void deletePet(Long petId, String apiKey) {

    }

    public List<Pet> findPetsByStatus(List<String> status) {
        return null;
    }

    public List<Pet> findPetsByTags(List<String> tags) {
        return null;
    }

    public Pet getPetById(Long petId) {
        System.out.println("get pet by id " + petId);
        return null;
    }

    public void updatePet(Pet body) {

    }

    public void updatePetWithForm(Long petId, String name, String status) {

    }
}
