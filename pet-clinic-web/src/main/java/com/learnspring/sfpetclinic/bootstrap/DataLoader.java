package com.learnspring.sfpetclinic.bootstrap;

import com.learnspring.sfpetclinic.model.Owner;
import com.learnspring.sfpetclinic.model.Vet;
import com.learnspring.sfpetclinic.services.OwnerService;
import com.learnspring.sfpetclinic.services.VetService;
import com.learnspring.sfpetclinic.services.map.OwnerServiceMap;
import com.learnspring.sfpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michel");
        owner1.setLastName("Hen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fina");
        owner2.setLastName("Glen");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Basil");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Orge");
        vet2.setLastName("Omel");
        vetService.save(vet2);

        System.out.println("Loaded Vets......");

    }
}
