package com.jdayssol.designpattern.constructor.pluggablefactory;

public class FabriqueVehicule
{
  protected Automobile prototypeAutomobile;
  protected Scooter prototypeScooter;

  public FabriqueVehicule()
  {
    prototypeAutomobile = null;
    prototypeScooter = null;
  }

  public FabriqueVehicule(Automobile prototypeAutomobile,
    Scooter prototypeScooter)
  {
    this.prototypeAutomobile = prototypeAutomobile;
    this.prototypeScooter = prototypeScooter;
  }

  public Automobile getPrototypeAutomobile()
  {
    return prototypeAutomobile;
  }

  public void setPrototypeAutomobile(Automobile
    prototypeAutomobile)
  {
    this.prototypeAutomobile = prototypeAutomobile;
  }

  public Scooter getPrototypeScooter()
  {
    return prototypeScooter;
  }

  public void setPrototypeScooter(Scooter
    prototypeScooter)
  {
    this.prototypeScooter = prototypeScooter;
  }

  Automobile creeAutomobile()
  {
    if (prototypeAutomobile == null)
      return null;
    return prototypeAutomobile.duplique();
  }

  Scooter creeScooter()
  {
    if (prototypeScooter == null)
      return null;
    return prototypeScooter.duplique();
  }

}
