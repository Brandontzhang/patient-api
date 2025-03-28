package com.project.healthcare.patient_api.models.elements;

import com.project.healthcare.patient_api.models.elements.codes.NameUse;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class HumanName {

  @Builder.Default
  private NameUse use = NameUse.OFFICIAL;

  @NonNull
  private String familyName;

  @NonNull
  private String givenName;

  private String text; // Textual representative of full name

  private String prefix;

  private String suffix;

  private Period period; // Period of time in use

  @Override
  public String toString() {
    return this.familyName + " " + this.givenName;
  }

}
