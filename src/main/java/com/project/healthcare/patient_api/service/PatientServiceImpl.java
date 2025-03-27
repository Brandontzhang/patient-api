package com.project.healthcare.patient_api.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.project.healthcare.patient_api.models.resources.Patient;
import com.project.healthcare.patient_api.models.requests.PatientRequest;

@Service
public class PatientServiceImpl implements PatientService {

  @Override
  public void createPatient(PatientRequest patient) {
    System.out.println(patient.getName());
  }

  @Override
  public Patient getPatient() {
    return new Patient();
  }

  @Override
  public Collection<Patient> getPatients() {
    return new ArrayList<>();
  }

  @Override
  public void updatePatient() {

  }

  @Override
  public void deletePatient() {

  }
}
