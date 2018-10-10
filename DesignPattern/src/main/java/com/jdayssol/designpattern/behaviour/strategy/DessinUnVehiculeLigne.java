package com.jdayssol.designpattern.behaviour.strategy;

import java.util.*;
public class DessinUnVehiculeLigne implements
  DessinCatalogue
{

  public void dessine(List<VueVehicule> contenu)
  {
    System.out.println(
      "Dessine les v�hicules avec un v�hicule par ligne");
    for (VueVehicule vueVehicule: contenu)
    {
      vueVehicule.dessine();
      System.out.println();
    }
    System.out.println();
  }
}
