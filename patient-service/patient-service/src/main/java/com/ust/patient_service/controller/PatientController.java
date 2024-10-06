package com.ust.patient_service.controller;

import com.ust.patient_service.dto.PatientDto;
import com.ust.patient_service.model.Patient;
import com.ust.patient_service.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public String sayHello(){
        return "I am Working";
    }

    @PostMapping
    public void createPatient(@Valid @RequestBody PatientDto dto) {
        // Create a new patient
        Patient patient = new Patient();
        patient.setFullName(dto.fullName());
        patient.setEmail(dto.email());
        patient.setPhone(dto.phone());
        patient.setAddress(dto.address());
        patient.setDob(dto.dob());

        patientService.createPatient(patient);
        // Save the patient to the database
    }

    @GetMapping("/giveAll")
    public List<Patient> giveall(){
        return patientService.getAllPatients();
    }

    @GetMapping("/getpat/{id}")
    public ResponseEntity<Patient> getbyId(@PathVariable int id){
        Optional<Patient> patientOptional = Optional.ofNullable(patientService.getPatient(id));
        return patientOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delbyId(@PathVariable int id){
        patientService.deletePatient(id);
    }

    @PutMapping
    public ResponseEntity<Patient> updpatient(Patient patient){
        return ResponseEntity.ok(patientService.updatePatient(patient));
    }

    @GetMapping("/getpat/email/{email}")
    public ResponseEntity<Patient> getbyemail(@PathVariable String email){
        Optional<Patient> res = patientService.searchByEmail(email);
        if(res.isPresent()){
            return ResponseEntity.ok(res.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
//
//    @GetMapping("/getpat/phone/{phone}")
//    public ResponseEntity<Patient> getbyphone(@PathVariable String phone){
//        Optional<Patient> res = patientService.searchByPhone(phone);
//        if(res.isPresent()){
//            return ResponseEntity.ok(res.get());
//        }else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
