package com.example.demo.Controller;

import com.example.demo.Entity.PatientRecord;
import com.example.demo.Repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRecordRepository;


    @GetMapping("/patient")
    public List<PatientRecord> PatientList(){
        return patientRecordRepository.findAll();
    }

    @GetMapping("/patient/{patientId}")
    public PatientRecord  get_Patient(@PathVariable Integer id){
        return patientRecordRepository.findById(id).get();
    }

    @PostMapping("/patient")
    public List<PatientRecord> addPatient(@RequestBody PatientRecord courses){
        patientRecordRepository.save(courses);
        return patientRecordRepository.findAll();
    }

    @DeleteMapping("/patient/{patientId}")
    public List<PatientRecord> deletePatient(@PathVariable Integer id){
        patientRecordRepository.delete(patientRecordRepository.findById(id).get());
        return patientRecordRepository.findAll();
    }

    @PutMapping("/course/{id}")
    public List<PatientRecord> updatePatient(@RequestBody PatientRecord c,@PathVariable Integer id){
        PatientRecord patient_obj = patientRecordRepository.findById(id).get();
        patient_obj.setName(c.getName());
        patient_obj.setId(c.getId());
        patient_obj.setAddress(c.getAddress());
        patient_obj.setAge((int) c.getAge());
        patientRecordRepository.save(patient_obj);
        return patientRecordRepository.findAll();
    }


}
