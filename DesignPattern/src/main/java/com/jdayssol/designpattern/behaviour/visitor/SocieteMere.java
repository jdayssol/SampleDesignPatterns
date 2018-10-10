package com.jdayssol.designpattern.behaviour.visitor;

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

  public List<Societe> getFiliales() {
    return filiales;
  }

  public boolean ajouteFiliale(Societe filiale)
  {
    return filiales.add(filiale);
  }
}
