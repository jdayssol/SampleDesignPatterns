package com.jdayssol.designpattern.behaviour.state;


public class Utilisateur
{

  public static void main(String[] args)
  {
    Commande commande = new Commande();
    commande.ajouteProduit(new Produit("v�hicule 1"));
    commande.ajouteProduit(new Produit("Accessoire 2"));
    commande.affiche();
    commande.etatSuivant();
    commande.ajouteProduit(new Produit("Accessoire 3"));
    commande.efface();
    commande.affiche();

    Commande commande2 = new Commande();
    commande2.ajouteProduit(new Produit("v�hicule 11"));
    commande2.ajouteProduit(new Produit("Accessoire 21"));
    commande2.affiche();
    commande2.etatSuivant();
    commande2.affiche();
    commande2.etatSuivant();
    commande2.efface();
    commande2.affiche();
  }
}
