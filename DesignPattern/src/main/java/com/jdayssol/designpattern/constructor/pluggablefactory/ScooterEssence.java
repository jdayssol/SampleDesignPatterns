package com.jdayssol.designpattern.constructor.pluggablefactory;


public class ScooterEssence extends Scooter
{

  public void afficheCaracteristiques()
  {
    System.out.println("Scooter � essence de mod�le : " +
      modele + " de couleur : " + couleur + 
      " de puissance : " + puissance);
  }

}
