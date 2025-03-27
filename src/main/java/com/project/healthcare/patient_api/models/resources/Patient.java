package com.project.healthcare.patient_api.models.resources;

import java.sql.Blob;
import java.util.Date;

import com.project.healthcare.patient_api.models.elements.*;
import com.project.healthcare.patient_api.models.elements.backbone.*;
import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Patient extends Resource {

  private String active; // Whether the record is in active use
  private HumanName firstName;
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
  // private Reference generalPractitioner;
  // private Reference managingOrganization;

  public Patient() {
    super();
  }

}
