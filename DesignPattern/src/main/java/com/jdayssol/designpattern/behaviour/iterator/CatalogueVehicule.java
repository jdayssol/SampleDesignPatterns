package com.jdayssol.designpattern.behaviour.iterator;

public class CatalogueVehicule extends
  Catalogue<Vehicule, IterateurVehicule> 
{
  public CatalogueVehicule()
  {
    contenu.add(new Vehicule("v�hicule bon march�"));
    contenu.add(new Vehicule("petit v�hicule bon march�"));
    contenu.add(new Vehicule("v�hicule grande qualit�"));
  }

  protected IterateurVehicule creeIterateur()
  {
    return new IterateurVehicule();
  }
}
