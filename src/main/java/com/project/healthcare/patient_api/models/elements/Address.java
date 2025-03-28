package com.project.healthcare.patient_api.models.elements;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Address {

  @NonNull
  private String street1;

  private String street2;

  // TODO: Enum for states
  @NonNull
  private String state;

  @NonNull
  private String zipCode;

  @NonNull
  private String country;

}
