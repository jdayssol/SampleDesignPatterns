package com.jdayssol.designpattern.behaviour.memento;

import java.util.*;
public class OptionVehicule
{
  protected String nom;
  protected List<OptionVehicule> optionsIncompatibles =
    new ArrayList<OptionVehicule>();

  public OptionVehicule(String nom)
  {
    this.nom = nom;
  }

  public void ajouteOptionIncompatible(OptionVehicule
    optionIncompatible)
  {
    if (!optionsIncompatibles.contains(optionIncompatible))
    {
      optionsIncompatibles.add(optionIncompatible);
      optionIncompatible.ajouteOptionIncompatible(this);
    }
  }

  public List<OptionVehicule> getOptionsIncompatibles()
  {
    return optionsIncompatibles;
  }

  public void affiche()
  {
    System.out.println("option : " + nom);
  }
}
