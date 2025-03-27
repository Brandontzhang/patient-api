package com.project.healthcare.patient_api.models.requests;

import java.sql.Blob;
import java.util.Date;

import com.project.healthcare.patient_api.models.elements.*;
import com.project.healthcare.patient_api.models.elements.backbone.*;
import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientRequest {

  private boolean active;
  private HumanName name;
  private Date birthDate;
  private boolean deceased;
  private Gender gender;
  private Date deceasedDate;
  private Address address;
  private MaritialStatus maritalStatus;
  private boolean multipleBirth;
  private int multipleBirthInteger;
  private Blob photo;
  private Contact contact;
  private ContactPoint telecom;
  private Communication communication;

}
