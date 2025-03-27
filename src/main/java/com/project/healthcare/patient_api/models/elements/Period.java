package com.project.healthcare.patient_api.models.elements;

import java.util.Date;

import lombok.Data;

// Time range defined by start and end date
// TODO: Rule: If present, start SHALL have a lower or equal value than end
@Data
public class Period {
  private Date start; // Start time with inclusive boundary
  private Date end; // End time with inclusive boundary, if not ongoing

  public Period(Date start) {
    this.start = start;
  }

  public Period(Date start, Date end) {
    this(start);
    this.end = end;
  }

  public Date getStart() {
    return this.start;
  }

  public Date getEnd() {
    return this.end;
  }
}
