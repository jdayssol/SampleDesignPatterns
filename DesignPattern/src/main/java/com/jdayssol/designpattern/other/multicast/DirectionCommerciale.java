package com.jdayssol.designpattern.other.multicast;


public class DirectionCommerciale
{
  protected ExpediteurCommercial expediteurCommercial =
    new ExpediteurCommercial();

  public void envoieMessages()
  {
    MessageCommercial message = new MessageCommercial(
      "Annonce nouvelle gamme");
    expediteurCommercial.envoieMultiple(message);
    message = new MessageCommercial(
      "Annonce suppression mod�le");
    expediteurCommercial.envoieMultiple(message);
  }

  public void ajouteRecepteurCommercial
    (RecepteurCommercial recepteur)
  {
    expediteurCommercial.ajoute(recepteur);
  }

}
