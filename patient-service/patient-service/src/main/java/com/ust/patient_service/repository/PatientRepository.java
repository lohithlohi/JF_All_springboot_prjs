package com.ust.patient_service.repository;

import com.ust.patient_service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    //JPQL
    @Query("SELECT p FROM Patient p WHERE p.email LIKE %?1%")
    Optional<Patient> searchByEmail(String email);

    Optional<Patient> findByPhone(String phone);

    Optional<Patient> findByEmailOrPhone(String email, String phone);
}
