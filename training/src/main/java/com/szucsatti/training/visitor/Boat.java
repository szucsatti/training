package com.szucsatti.training.visitor;

public class Boat implements Vehicle {

  private String licenceNumber;


  public Boat(final String licenseNumber) {
    licenceNumber = licenseNumber;
  }


  public void sail() {
    //To be implemented
  }


  @Override
  public String getRegistrationNumber() {
    //To be implemented
    return null;
  }


  @Override
  public String getLicenseNumber() {
    return licenceNumber;
  }


  @Override
  public boolean isPrivate() {
    return true;
  }

}
