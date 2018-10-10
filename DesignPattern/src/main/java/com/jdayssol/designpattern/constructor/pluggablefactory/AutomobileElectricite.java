package com.jdayssol.designpattern.constructor.pluggablefactory;

public class AutomobileElectricite extends Automobile
{

  public void afficheCaracteristiques()
  {
    System.out.println(
      "Automobile �lectrique de mod�le : " + modele + 
      " de couleur : " + couleur + " de puissance : " +
      puissance + " d'espace : " + espace);
  }
}
