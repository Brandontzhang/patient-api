package com.project.healthcare.patient_api.models.elements;

import com.project.healthcare.patient_api.models.elements.codes.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

// Contact detail for a person
@Data
@Builder
public class ContactPoint {

  @NonNull
  private ContactPointSystem method;

  @NonNull
  private String value;

  @NonNull
  private ContactPointUse use;

  @Builder.Default
  private int rank = 1;

  @NonNull
  private Period period;
}
