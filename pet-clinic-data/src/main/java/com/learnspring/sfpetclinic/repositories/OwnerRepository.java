package com.learnspring.sfpetclinic.repositories;

import com.learnspring.sfpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
