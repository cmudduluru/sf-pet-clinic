package com.learnspring.sfpetclinic.repositories;

import com.learnspring.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
