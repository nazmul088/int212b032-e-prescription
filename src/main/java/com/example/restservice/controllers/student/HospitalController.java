package com.example.restservice.controllers.student;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.restservice.models.Hospitals.Hospitals;
import com.example.restservice.repository.HospitalsRepository;


// Write get and post method controller here
@RestController
@CrossOrigin
@RequestMapping("/api")
public class HospitalController {


    @Autowired
    public HospitalsRepository hospitalsRepository;





    @GetMapping("/hospitals")
    public List<Hospitals> getAllHospitals(){
        System.out.println("ALL HOSPITALS");
        System.out.println( hospitalsRepository.findAll());
        return hospitalsRepository.findAll();

    }



    @GetMapping("/hospitals/name/{name}")
    public List<Hospitals> name(
            @PathVariable("name") String name){
        Hospitals hospitals=new Hospitals(name);
        Example<Hospitals> example = Example.of(hospitals);
        List<Hospitals> results = hospitalsRepository.findAll(example);
        return results;
    }




    @GetMapping("/hospitals/{id}")
    public Optional<Hospitals> getHospitalbyId(@PathVariable String id){
        System.out.println("GET HOsPITAL");
        return hospitalsRepository.findById(id);
    }







    @PostMapping("/hospitals")
    public String addHospital(@RequestBody Hospitals hospitals){
        System.out.println(hospitals);
        hospitalsRepository.save(hospitals);
        return "Hospital Added "+hospitals.getId();
    }


    @PutMapping("/hospitals/{id}")
    public Hospitals updateHospital(@PathVariable("id") String id,@RequestBody Hospitals hospitals){
        System.out.println("Put request");
        hospitalsRepository.save(hospitals);
        return hospitals;
    }


    @DeleteMapping("/hospitals")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        try {
            hospitalsRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/hospitals/{id}")
    public String deleteHospital(@PathVariable("id") String id){

        hospitalsRepository.deleteById(id);
        return "Hospital deleted";
    }




}
