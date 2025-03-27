package com.project.healthcare.patient_api.service;

import java.util.Collection;

import com.project.healthcare.patient_api.models.requests.PatientRequest;
import com.project.healthcare.patient_api.models.resources.Patient;

public interface PatientService {
  public void createPatient(PatientRequest patient);

  public Patient getPatient();

  public Collection<Patient> getPatients();

  public void updatePatient();

  public void deletePatient();
}
