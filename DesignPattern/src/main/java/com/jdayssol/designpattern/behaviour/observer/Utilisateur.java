package com.jdayssol.designpattern.behaviour.observer;

public class Utilisateur
{

  public static void main(String[] args)
  {
    Vehicule vehicule = new Vehicule();
    vehicule.setDescription("V�hicule bon march�");
    vehicule.setPrix(5000.0);
    VueVehicule vueVehicule = new VueVehicule(vehicule);
    vueVehicule.redessine();
    vehicule.setPrix(4500.0);
    VueVehicule vueVehicule2 = new VueVehicule(vehicule);
    vehicule.setPrix(5500.0);
  }
}
