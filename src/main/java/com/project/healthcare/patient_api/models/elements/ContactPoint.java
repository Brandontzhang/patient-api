package com.project.healthcare.patient_api.models.elements;

import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Data;

@Data
// Contact detail for a person
public class ContactPoint {
  private ContactPointSystem method;
  private String value;
  private ContactPointUse use;
  private int rank;
  private Period period;

  public ContactPoint() {

  }
}
