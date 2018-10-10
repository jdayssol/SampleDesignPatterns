package com.jdayssol.designpattern.behaviour.iterator;

import java.util.*;
public abstract class Catalogue
  <TElement extends Element, 
  TIterateur extends Iterateur<TElement>> 
{
  protected List<TElement> contenu = 
    new ArrayList<TElement>();

  protected abstract TIterateur creeIterateur();

  public TIterateur recherche(String motCleRequete)
  {
    TIterateur resultat = creeIterateur();
    resultat.setMotCleRequete(motCleRequete, contenu);
    return resultat;
  }
}
