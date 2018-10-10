package com.jdayssol.designpattern.other.multicast;

import java.util.*;
public class DirectionGenerale
{
  protected ExpediteurGeneral expediteurGeneral = new
    ExpediteurGeneral();

  public void envoieMessages()
  {
    List<String> contenu = new ArrayList<String>();
    contenu.add("Informations g�n�rales");
    contenu.add("Informations sp�cifiques");
    MessageGeneral message = new MessageGeneral(contenu);
    expediteurGeneral.envoieMultiple(message);
  }

  public void ajouteRecepteurGeneral(Employe recepteur)
  {
    expediteurGeneral.ajoute(recepteur);
  }

}
