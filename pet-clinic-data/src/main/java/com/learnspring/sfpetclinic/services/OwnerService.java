package com.learnspring.sfpetclinic.services;

import com.learnspring.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
