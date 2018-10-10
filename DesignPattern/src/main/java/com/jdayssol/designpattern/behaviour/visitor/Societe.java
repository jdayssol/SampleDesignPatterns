package com.jdayssol.designpattern.behaviour.visitor;

public abstract class Societe implements Visitable
{
  protected String nom, email, adresse;

  public Societe(String nom, String email, String adresse)
  {
    this.setNom(nom);
    this.setEmail(email);
    this.setAdresse(adresse);
  }

  public String getNom()
  {
    return nom;
  }

  protected void setNom(String nom)
  {
    this.nom = nom;
  }
  
  public String getEmail()
  {
    return email;
  }

  protected void setEmail(String email)
  {
    this.email = email;
  }
  
  public String getAdresse()
  {
    return adresse;
  }

  protected void setAdresse(String adresse)
  {
    this.adresse = adresse;
  }
  
  public abstract boolean ajouteFiliale(Societe filiale);
}
