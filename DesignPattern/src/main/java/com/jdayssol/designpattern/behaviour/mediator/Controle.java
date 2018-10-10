package com.jdayssol.designpattern.behaviour.mediator;

public abstract class Controle
{
  protected String valeur = "";
  protected Formulaire directeur;
  protected String nom;

  public Controle(String nom)
  {
    setNom(nom);
  }

  public String getNom()
  {
    return nom;
  }

  protected void setNom(String nom)
  {
    this.nom = nom;
  }
  
  protected Formulaire getDirecteur()
  {
    return directeur;
  }

  public void setDirecteur(Formulaire directeur)
  {
    this.directeur = directeur;
  }

  public String getValeur()
  {
    return valeur;
  }
  
  protected void setValeur(String valeur)
  {
	this.valeur = valeur;
  }

  public abstract void saisie();

  protected void modifie()
  {
    getDirecteur().controleModifie(this);
  }
}
