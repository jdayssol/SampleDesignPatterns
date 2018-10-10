package com.jdayssol.designpattern.structuration.flyweight;
import java.util.*;
public class VehiculeCommande
{
  protected List<OptionVehicule> options = new
    ArrayList<OptionVehicule>();
  protected List<Integer> prixDeVenteOptions = new
    ArrayList<Integer>();

  public void ajouteOptions(String nom, int prixDeVente,
    FabriqueOption fabrique)
  {
    options.add(fabrique.getOption(nom));
    prixDeVenteOptions.add(prixDeVente);
  }

  public void afficheOptions()
  {
    int index, taille;
    taille = options.size();
    for (index = 0; index < taille; index++)
    {
      options.get(index).affiche(prixDeVenteOptions.get
        (index));
      System.out.println();
    }
  }
}
