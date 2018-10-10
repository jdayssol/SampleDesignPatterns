package com.jdayssol.designpattern.behaviour.chainofresponsability;
public class Vehicule extends ObjetBase
{
  protected String description;

  public Vehicule(String description)
  {
    this.description = description;
  }

  protected String getDescription()
  {
    return description;
  }
}
