package com.jdayssol.designpattern.behaviour.state;

public class CommandeLivree extends EtatCommande
{
  public CommandeLivree(Commande commande)
  {
    super(commande);
  }

  public void ajouteProduit(Produit produit){}

  public void efface(){}

  public void retireProduit(Produit produit){}

  public EtatCommande etatSuivant()
  {
    return this;
  }
}
