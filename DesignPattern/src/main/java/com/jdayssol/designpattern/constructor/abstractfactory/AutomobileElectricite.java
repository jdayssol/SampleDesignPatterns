package com.jdayssol.designpattern.constructor.abstractfactory;

public class AutomobileElectricite extends Automobile
{
  public AutomobileElectricite(String modele, String
    couleur, int puissance, double espace)
  {
    super(modele, couleur, puissance, espace);
  }

  public void afficheCaracteristiques()
  {
    System.out.println(
      "Automobile �lectrique de mod�le : " + modele + 
      " de couleur : " + couleur + " de puissance : " +
      puissance + " d'espace : " + espace);
  }
}
