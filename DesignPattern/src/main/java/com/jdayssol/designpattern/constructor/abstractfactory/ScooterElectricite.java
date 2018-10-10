package com.jdayssol.designpattern.constructor.abstractfactory;


public class ScooterElectricite extends Scooter
{
  public ScooterElectricite(String modele, String couleur,
    int puissance)
  {
    super(modele, couleur, puissance);
  }

  public void afficheCaracteristiques()
  {
    System.out.println("Scooter �lectrique de mod�le : " 
      + modele + " de couleur : " + couleur + 
      " de puissance : " + puissance);
  }

}
