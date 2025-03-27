package com.project.healthcare.patient_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.healthcare.patient_api.models.requests.*;
import com.project.healthcare.patient_api.service.PatientService;

@RestController
public class PatientController {

  @Autowired
  PatientService patientService;

  @PostMapping("/patient")
  public ResponseEntity<Object> createPatient(@RequestBody PatientRequest patient) {
    patientService.createPatient(patient);
    return new ResponseEntity<>("Patient registered successfully", HttpStatus.CREATED);
  }

  @GetMapping("/patient/{id}")
  public ResponseEntity<Object> getPatient(@PathVariable String id) {
    return new ResponseEntity<>(patientService.getPatient(), HttpStatus.OK);
  }

  @PatchMapping("/patient/{id}")
  public ResponseEntity<Object> updatePatient(@PathVariable String id) {
    patientService.updatePatient();
    return new ResponseEntity<>("Patient updated", HttpStatus.OK);
  }

  @DeleteMapping("/patient/{id}")
  public ResponseEntity<Object> deletePatient(@PathVariable String id) {
    patientService.deletePatient();
    return new ResponseEntity<>("Patient deleted", HttpStatus.OK);
  }

}
