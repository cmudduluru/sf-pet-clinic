package com.learnspring.sfpetclinic.repositories;

import com.learnspring.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
