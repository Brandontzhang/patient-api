package com.project.healthcare.patient_api.models.resources;

import java.sql.Blob;
import java.util.Date;

import com.project.healthcare.patient_api.models.elements.*;
import com.project.healthcare.patient_api.models.elements.backbone.*;
import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Patient extends Resource {

  @Builder.Default
  private boolean active = true; // Whether the record is in active use

  @NonNull
  private HumanName name;

  @NonNull
  private Date birthDate;

  @NonNull
  private Gender gender;

  @Builder.Default
  private boolean deceased = false;

  private Date deceasedDate;

  @NonNull
  private Address address;

  @NonNull
  private MaritialStatus maritalStatus;

  private boolean multipleBirth;

  private int multipleBirthInteger;

  private Blob photo;

  @NonNull
  private Contact contact;

  @NonNull
  private ContactPoint telecom;

  private Communication communication;
  // private Reference generalPractitioner;
  // private Reference managingOrganization;

  public static PatientBuilder build() {
    return new CustomPatientBuilder();
  }

  public static class CustomPatientBuilder extends PatientBuilder {
    @Override
    public Patient build() {
      // Additional checks here

      return super.build();
    }
  }

}
