package com.jdayssol.designpattern.other.multicast;

import java.util.*;
public abstract class ExpediteurAbstrait
  <TMessage extends MessageAbstrait,
   TRecepteur extends RecepteurAbstrait<TMessage>> 
{
  protected List<TRecepteur> registre = 
    new ArrayList<TRecepteur>();

  public void ajoute(TRecepteur recepteur)
  {
    registre.add(recepteur);
  }

  public void envoieMultiple(TMessage message)
  {
    for (TRecepteur recepteur: registre)
      recepteur.recoit(message);
  }

}
