package com.example.demo.Repository;

import com.example.demo.Entity.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Integer> {
}
