package com.szucsatti.training.visitor;

public class Car implements Vehicle {

  public void engine() {
    //To be implemented
  }


  public Double carbonDioxidEmission() {
    return 2D;
  }


  @Override
  public String getRegistrationNumber() {
    //To be implemented
    return null;
  }


  @Override
  public String getLicenseNumber() {
    //To be implemented
    return "CJ-17-MSG";
  }


  @Override
  public boolean isPrivate() {
    return false;
  }

}
