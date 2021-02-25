package com.example.restservice.models.Patients;

import com.example.restservice.models.Hospitals.Hospitals;
import com.example.restservice.models.doctor.Doctor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Document(collection = "Patient")
public class Patient {
    @Id private String id;
    String doctor_id;
    String hospital_id;
    String patient_name;
    String reg_datetime;
    String date_of_birth;
    String gender;
    String occupation;
    String health_insurance_no;
    String health_care_provider;
    String address;
    String contact_no;
    String created_on;
    String age;

    public Patient() {
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
        this.reg_datetime= timeStamp;
        this.created_on = timeStamp;
    }



    public Patient(String reg_id, String doctor_id, String hospital_id, String patient_name, String date_of_birth, String age, String gender, String occupation, String health_insurance_no, String health_care_provider, String address, String contact_no) {
        id = reg_id;
        this.doctor_id = doctor_id;
        this.hospital_id = hospital_id;
        this.patient_name = patient_name;
        this.date_of_birth = date_of_birth;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.health_insurance_no = health_insurance_no;
        this.health_care_provider = health_care_provider;
        this.address = address;
        this.contact_no = contact_no;
    }

    public Patient(String name) {
        this.patient_name = name;
    }

    public Patient(String name, String dob) {
        this.patient_name=name;
        this.date_of_birth=dob;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getReg_datetime() {
        return reg_datetime;
    }

    public void setReg_datetime(String reg_datetime) {
        this.reg_datetime = reg_datetime;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHealth_insurance_no() {
        return health_insurance_no;
    }

    public void setHealth_insurance_no(String health_insurance_no) {
        this.health_insurance_no = health_insurance_no;
    }

    public String getHealth_care_provider() {
        return health_care_provider;
    }

    public void setHealth_care_provider(String health_care_provider) {
        this.health_care_provider = health_care_provider;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }
}
