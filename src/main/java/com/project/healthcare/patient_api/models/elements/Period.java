package com.project.healthcare.patient_api.models.elements;

import java.util.Date;
import java.time.DateTimeException;

import lombok.Data;
import lombok.NonNull;

// Time range defined by start and end date
// Rule: If present, start MUST have a lower or equal value than end
@Data
public class Period {

  @NonNull
  private Date start; // Start time with inclusive boundary

  private Date end; // End time with inclusive boundary, if not ongoing

  public Period(Date start) {
    this.start = start;
  }

  public Period(Date start, Date end) {
    this(start);
    this.end = end;
  }

  public void setStart(Date start) throws DateTimeException {
    if (start.after(end)) {
      throw new DateTimeException("Start date must be before end date");
    }

    this.start = start;
  }

  public void setEnd(Date end) {
    if (end.before(start)) {
      throw new DateTimeException("End date must be before start date");
    }

    this.end = end;
  }

}
