package com.jdayssol.designpattern.constructor.abstractfactory;

public class FabriqueVehiculeEssence implements
  FabriqueVehicule
{
  public Automobile creeAutomobile(String modele, String
    couleur, int puissance, double espace)
  {
    return new AutomobileEssence(modele, couleur,
      puissance, espace);
  }

  public Scooter creeScooter(String modele, String
    couleur, int puissance)
  {
    return new ScooterEssence(modele, couleur, puissance);
  }
}
