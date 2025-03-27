package com.project.healthcare.patient_api.models.elements.backbone;

import com.project.healthcare.patient_api.models.elements.*;
import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Data;

@Data
// Contact Party (guardian, partner, friend) of patient
public class Contact {

  private PersonalRelationship relationship;
  private Relationship role;
  private HumanName name;
  private HumanName additionalName;
  private ContactPoint telecom;
  private Address address;
  private Address additionalAddress;
  private Gender gender;

  public Contact() {

  }
}
