package com.project.healthcare.patient_api.models.elements;

import lombok.Data;

@Data
public class HumanName {
  public enum Use {
    USUAL, OFFICIAL, TEMP, NICKNAME, ANONYMOUS, OLD, MAIDEN
  }

  private Use use;
  private String text; // Textual representative of full name
  private String familyName;
  private String givenName;
  private String prefix;
  private String suffix;
  private Period period; // Period of time in use

  @Override
  public String toString() {
    return this.familyName + " " + this.givenName;
  }

}
