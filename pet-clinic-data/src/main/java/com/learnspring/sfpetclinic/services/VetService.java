package com.learnspring.sfpetclinic.services;

import com.learnspring.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
