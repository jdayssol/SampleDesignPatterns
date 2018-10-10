package com.jdayssol.designpattern.behaviour.visitor;

public class SocieteSansFiliale extends Societe 
{
  public SocieteSansFiliale(String nom, String email,
    String adresse)
  {
    super(nom, email, adresse);
  }

  public boolean ajouteFiliale(Societe filiale)
  {
    return false;
  }
}
