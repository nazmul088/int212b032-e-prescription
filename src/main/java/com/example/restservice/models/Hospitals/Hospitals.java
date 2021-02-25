package com.example.restservice.models.Hospitals;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

// Create a model by using the collection name as your Intern ID
// as example if your Intern ID is int212b003 then the collection name as follow

@Document(collection = "Hospitals")
public class Hospitals {


    @Id private String id;
    String hospital_name;
    String branch_name;
    String address;
    String email;
    Integer contact_no;
    String created_on;

    public Hospitals() {
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
        this.created_on = timeStamp;
    }

    public Hospitals(String id, String hospital_name, String branch_name, String address, String email, Integer contact_no) {
        this.id = id;
        this.hospital_name = hospital_name;
        this.branch_name = branch_name;
        this.address = address;
        this.email = email;
        this.contact_no = contact_no;
    }

    public Hospitals(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContact_no() {
        return contact_no;
    }

    public void setContact_no(Integer contact_no) {
        this.contact_no = contact_no;
    }

    public String getCreated_on() {
        return this.created_on.toString();
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    @Override
    public String toString() {
        return hospital_name;
    }
}