package com.jdayssol.designpattern.structuration.flyweight;
import java.util.*;
public class FabriqueOption
{
  protected Map<String, OptionVehicule> options = new
    TreeMap<String, OptionVehicule>();
  public OptionVehicule getOption(String nom)
  {
    OptionVehicule resultat;
    if (options.containsKey(nom))
    {
    	return options.get(nom);
    }
    else
    {
      resultat = new OptionVehicule(nom);
      options.put(nom, resultat);
    }
    return resultat;
  }
}
