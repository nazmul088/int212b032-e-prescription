package com.example.restservice;

import com.example.restservice.models.Hospitals.Hospitals;
import com.example.restservice.repository.HospitalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.util.List;

@EnableMongoAuditing
@SpringBootApplication
public class RestServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }
/*
    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Sajib","nazmul@gmail.com",Integer.parseInt("01796688828") ,"01101997");
        Student student2 = new Student("Nazmul","nazmul@gmail.com", Integer.parseInt("0179668828"),"01101997");
        Student student3 = new Student("Islam","naz@gmail.com",Integer.parseInt("017966888") ,"01101997");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

        List<Student> students=studentRepository.findAll();
        for(Student student: students)
            System.out.println(student.getName()+""+student.getEmail());
    }

 */
}
