package com.learnspring.sfpetclinic.bootstrap;

import com.learnspring.sfpetclinic.model.Owner;
import com.learnspring.sfpetclinic.model.Pet;
import com.learnspring.sfpetclinic.model.PetType;
import com.learnspring.sfpetclinic.model.Vet;
import com.learnspring.sfpetclinic.services.OwnerService;
import com.learnspring.sfpetclinic.services.PetTypeService;
import com.learnspring.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        System.out.println(" *****I am in DataLoader Constructor *****");
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michel");
        owner1.setLastName("Hen");
        owner1.setAddress("123 BrickLande");
        owner1.setCity("Miami");
        owner1.setTelephone("1234454");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fina");
        owner2.setLastName("Glen");
        owner2.setAddress("123 BrickLande");
        owner2.setCity("Miami");
        owner2.setTelephone("1234454");
        Pet finasPet = new Pet();
        finasPet.setPetType(savedCatPetType);
        finasPet.setOwner(owner2);
        finasPet.setBirthDate(LocalDate.now());
        finasPet.setName("Just Cat");
        owner1.getPets().add(finasPet);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Basil");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Orge");
        vet2.setLastName("Omel");
        vetService.save(vet2);

        System.out.println("Loaded Vets......");

    }
}
