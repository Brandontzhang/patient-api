package com.project.healthcare.patient_api.models.elements;

import lombok.Data;

@Data
public class Address {

  private String street1;

  private String street2;

  private String state;

  private String zipCode;

  private String country;

  public Address() {

  }

}
