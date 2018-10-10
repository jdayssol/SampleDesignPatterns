package com.jdayssol.designpattern.behaviour.strategy;

public class VueVehicule
{
  protected String description;

  public VueVehicule(String description)
  {
    this.description = description;
  }

  public void dessine()
  {
    System.out.print(description);
  }
}
