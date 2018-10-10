package com.jdayssol.designpattern.constructor.pluggablefactory;

public class AutomobileEssence extends Automobile
{

  public void afficheCaracteristiques()
  {
    System.out.println(
      "Automobile � essence de mod�le : " + modele + 
      " de couleur : " + couleur + " de puissance : " +
      puissance + " d'espace : " + espace);
  }
}
