package com.example.PetStoreUsingSpringDataREST;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pet1", path = "pet1")
public interface Pet1Repository extends JpaRepository<Pet1, Long>{

}
