package com.jdayssol.designpattern.constructor.abstractfactory;

public class FabriqueVehiculeElectricite implements
  FabriqueVehicule
{
  public Automobile creeAutomobile(String modele, String
    couleur, int puissance, double espace)
  {
    return new AutomobileElectricite(modele, couleur,
      puissance, espace);
  }

  public Scooter creeScooter(String modele, String
    couleur, int puissance)
  {
    return new ScooterElectricite(modele, couleur,
      puissance);
  }
}
