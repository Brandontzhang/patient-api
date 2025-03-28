package com.project.healthcare.patient_api.models.elements.backbone;

import com.project.healthcare.patient_api.models.elements.*;
import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Data;
import lombok.NonNull;

@Data
// Contact Party (guardian, partner, friend) of patient
public class Contact {

  @NonNull
  private PersonalRelationship relationship;

  @NonNull
  private Relationship role;

  @NonNull
  private HumanName name;

  private HumanName additionalName;

  @NonNull
  private ContactPoint telecom;

  private Address address;

  private Address additionalAddress;

  private Gender gender;

  public Contact() {

  }
}
