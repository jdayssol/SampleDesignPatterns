package com.jdayssol.designpattern.behaviour.strategy;

import java.util.*;
public class VueCatalogue
{
  protected List<VueVehicule> contenu = 
    new ArrayList<VueVehicule>();
  protected DessinCatalogue dessin;

  public VueCatalogue(DessinCatalogue dessin)
  {
    contenu.add(new VueVehicule("v�hicule bon march�"));
    contenu.add(new VueVehicule("v�hicule spacieux"));
    contenu.add(new VueVehicule("v�hicule rapide"));
    contenu.add(new VueVehicule("v�hicule confortable"));
    contenu.add(new VueVehicule("v�hicule sportif"));
    this.dessin = dessin;
  }

  public void dessine()
  {
    dessin.dessine(contenu);
  }
}
