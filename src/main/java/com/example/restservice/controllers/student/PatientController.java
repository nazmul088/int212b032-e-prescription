package com.example.restservice.controllers.student;

import com.example.restservice.models.Patients.Patient;
import com.example.restservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @PostMapping("/patients")
    public String addNewPatient(@RequestBody Patient patient) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String strings[]= patient.getDate_of_birth().split("/");
        System.out.println(strings[2]+strings[1]+strings[0]);
        LocalDate localDate=LocalDate.of(Integer.parseInt(strings[2]),Integer.parseInt(strings[1]),Integer.parseInt(strings[0]));
        LocalDate now = LocalDate.now();
        Period diff= Period.between(localDate,now);
        System.out.println(diff.getYears());
        patient.setAge(String.valueOf(diff.getYears()));
        patientRepository.save(patient);
        return "Patient Added";
    }

    @GetMapping("/patients/{id}")
    public Optional<Patient> getPatientById(@PathVariable("id") String id){
        return patientRepository.findById(id);
    }

    @GetMapping("/patients/name/{name}")
    public List<Patient> getPatientByName(@PathVariable("name") String name){
        Patient patient = new Patient(name);
        Example<Patient> p = Example.of(patient);
        List<Patient> p1 = patientRepository.findAll(p);
        return p1;
    }

    @GetMapping("/patients/namedob/{name}/{dob}")
    public List<Patient> getPatientByNameByDOB(@PathVariable("name") String name, @PathVariable("dob") String dob){
        Patient patient = new Patient(name,dob);
        Example<Patient> patientExample = Example.of(patient);
        List<Patient> patientList = patientRepository.findAll(patientExample);
        return patientList;
    }

    @PutMapping("/patients/{id}")
    public Patient updatePatientById(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @DeleteMapping("/patients/{id}")
    public String deletePatientById(@PathVariable("id") String id){
        patientRepository.deleteById(id);
        return "Patient Deleted";
    }

    @DeleteMapping("/patients")
    public String deleteAllPatients(){
        patientRepository.deleteAll();
        return "All Patients deleted";
    }
}
