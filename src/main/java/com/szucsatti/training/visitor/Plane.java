package com.szucsatti.training.visitor;

public class Plane implements Vehicle {

  public void fly() {
    //To be implemented
  }


  public String getFlightNo() {
    return "LH1579";
  }


  public boolean prepareForLanding() {
    return true;
  }


  @Override
  public String getRegistrationNumber() {
    return null;
  }


  @Override
  public String getLicenseNumber() {
    return "FRF-45/15/789";
  }


  @Override
  public boolean isPrivate() {
    return true;
  }

}
