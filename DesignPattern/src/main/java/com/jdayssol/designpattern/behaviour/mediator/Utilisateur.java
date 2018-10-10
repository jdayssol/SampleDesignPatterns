package com.jdayssol.designpattern.behaviour.mediator;


public class Utilisateur
{

  public static void main(String[] args)
  {
    Formulaire formulaire = new Formulaire();
    formulaire.ajouteControle(new ZoneSaisie("Nom"));
    formulaire.ajouteControle(new ZoneSaisie("Pr�nom"));
    PopupMenu menu = new PopupMenu("Coemprunteur");
    menu.ajouteOption("sans coemprunteur");
    menu.ajouteOption("avec coemprunteur");
    formulaire.ajouteControle(menu);
    formulaire.setMenuCoemprunteur(menu);
    Bouton bouton = new Bouton("OK");
    formulaire.ajouteControle(bouton);
    formulaire.setBoutonOK(bouton);
    formulaire.ajouteControleCoemprunteur(new ZoneSaisie(
      "Nom du coemprunteur"));
    formulaire.ajouteControleCoemprunteur(new ZoneSaisie(
      "Pr�nom du coemprunteur"));
    formulaire.saisie();
  }
}
