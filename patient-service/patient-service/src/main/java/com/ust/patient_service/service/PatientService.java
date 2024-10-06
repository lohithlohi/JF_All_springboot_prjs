package com.ust.patient_service.service;

import com.ust.patient_service.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    Patient createPatient(Patient patient);

    Patient getPatient(long id);

    Patient updatePatient(Patient patient);

    void deletePatient(long id);

    Optional<Patient> searchByEmail(String email);

    Object searchByPhone(String phone);

    List<Patient> getAllPatients();
}
