package com.example.restservice.models.doctor;

import com.example.restservice.models.Hospitals.Hospitals;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Document(collection = "Doctor")
public class Doctor {
    @Id private String id;
    Hospitals hospitals;
    String doctor_name;
    String speciality;
    String address;
    String about;
    String profile_picture;
    String created_on;

    public Doctor() {
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
        this.profile_picture = "No profile picture uploaded";
        this.created_on = timeStamp;
    }

    public Doctor(String id, Hospitals hospitals, String doctor_name, String speciality, String address, String about) {
        this.id = id;
        this.hospitals = hospitals;
        this.doctor_name = doctor_name;
        this.speciality = speciality;
        this.address = address;
        this.about = about;
    }

    public Doctor(String doctor_name) {
        this.doctor_name=doctor_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hospitals getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospitals hospitals) {
        this.hospitals = hospitals;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }
}

