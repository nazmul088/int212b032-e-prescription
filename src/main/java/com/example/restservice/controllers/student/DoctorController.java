package com.example.restservice.controllers.student;

import com.example.restservice.models.doctor.Doctor;
import com.example.restservice.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    public DoctorsRepository doctorsRepository;

    @PostMapping("/doctors")
    public String addDoctors(@RequestBody Doctor doctor){
        doctorsRepository.save(doctor);
        return "Doctor Added";
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        return doctorsRepository.findAll();
    }

    @GetMapping("/doctors/id/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable("id") String id){
        return doctorsRepository.findById(id);
    }

    @GetMapping("/doctors/name/{name}")
    public List<Doctor> getDoctorByName(@PathVariable("name") String doctor_name){
        Doctor doctor=new Doctor(doctor_name);
        Example<Doctor> d = Example.of(doctor);
        List<Doctor> d1=   doctorsRepository.findAll(d);
        return d1;
    }

    @PutMapping("/doctors/{id}")
    public Doctor updateDoctorById(@PathVariable("id") String id, @RequestBody Doctor doctor){
        doctorsRepository.save(doctor);
        return doctor;
    }

    @DeleteMapping("/doctors/{id}")
    public String deleteDoctor(@PathVariable("id") String id){
        doctorsRepository.deleteById(id);
        return "Deleted";
    }

    @DeleteMapping("/doctors")
    public String deleteAllHospital(){
        doctorsRepository.deleteAll();
        return "ALl hospital deleted";
    }
}
