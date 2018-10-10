package com.jdayssol.designpattern.constructor.pluggablefactory;


public class ScooterElectricite extends Scooter
{

  public void afficheCaracteristiques()
  {
    System.out.println("Scooter �lectrique de mod�le : " 
      + modele + " de couleur : " + couleur + 
      " de puissance : " + puissance);
  }

}
