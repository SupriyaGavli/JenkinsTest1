package com.infosys.exercise;

import org.springframework.beans.factory.annotation.Value;
//Employee Bean with name being injected
public class Employee {
  @Value("Sangamithra")
  private String name;
  public String getName() {
      return name;
  }
}