package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientRecord{
    @Id
    private Long id;
    private String name;
    private String address;
    private Integer age;

    public PatientRecord() {

    }

    public void course(){

    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String description) {
        this.address = description;
    }

    public long getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public PatientRecord(long id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
}