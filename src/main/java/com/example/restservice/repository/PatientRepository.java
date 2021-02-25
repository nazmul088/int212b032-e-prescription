package com.example.restservice.repository;

import com.example.restservice.models.Patients.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient,String> {
}
