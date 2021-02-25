package com.example.restservice.repository;

import com.example.restservice.models.Hospitals.Hospitals;
import org.springframework.data.mongodb.repository.MongoRepository;

// write the repository of Student model to operate DOA operation using mongo-data repository here...
//@Repository
public interface HospitalsRepository extends MongoRepository<Hospitals, String>  {

}