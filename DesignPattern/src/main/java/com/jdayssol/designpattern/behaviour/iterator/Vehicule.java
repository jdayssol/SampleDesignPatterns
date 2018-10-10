package com.jdayssol.designpattern.behaviour.iterator;

public class Vehicule extends Element
{
  public Vehicule(String description)
  {
    super(description);
  }

  public void affiche()
  {
    System.out.println("Description du v�hicule : " +
      description);
  }
}
