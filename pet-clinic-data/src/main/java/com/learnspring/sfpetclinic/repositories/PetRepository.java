package com.learnspring.sfpetclinic.repositories;

import com.learnspring.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
