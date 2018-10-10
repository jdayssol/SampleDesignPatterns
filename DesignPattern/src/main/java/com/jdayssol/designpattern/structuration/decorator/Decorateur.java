package com.jdayssol.designpattern.structuration.decorator;

public abstract class Decorateur implements
  ComposantGraphiqueVehicule
{
  protected ComposantGraphiqueVehicule composant;

  public Decorateur(ComposantGraphiqueVehicule composant)
  {
    this.composant = composant;
  }

  public void affiche()
  {
    composant.affiche();
  }
}
