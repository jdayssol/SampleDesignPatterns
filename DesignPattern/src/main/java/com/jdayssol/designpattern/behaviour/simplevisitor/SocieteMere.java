package com.jdayssol.designpattern.behaviour.simplevisitor;

import java.util.ArrayList;
import java.util.List;
public class SocieteMere extends Societe
{
  protected List<Societe> filiales = 
    new ArrayList<Societe>();

  public SocieteMere(String nom, String email, String
    adresse)
  {
    super(nom, email, adresse);
  }

  public void accepteVisiteur(Visiteur visiteur)
  {
    visiteur.visite(this);
    for (Societe filiale: filiales)
      filiale.accepteVisiteur(visiteur);
  }

  public boolean ajouteFiliale(Societe filiale)
  {
    return filiales.add(filiale);
  }
}
