package com.example.restservice.repository;

import com.example.restservice.models.doctor.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorsRepository extends MongoRepository<Doctor,String> {
}
