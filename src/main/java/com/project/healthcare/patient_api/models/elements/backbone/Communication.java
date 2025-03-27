package com.project.healthcare.patient_api.models.elements.backbone;

import com.project.healthcare.patient_api.models.elements.codes.Language;

import lombok.Data;

@Data
// Language patient uses to communicate about his/her health
public class Communication {
  private Language language;
  private boolean preferred;

  public Communication(Language language, boolean preferred) {
    this.language = language;
    this.preferred = preferred;
  }

}
