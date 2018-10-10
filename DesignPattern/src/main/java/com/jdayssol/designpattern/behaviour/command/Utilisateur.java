package com.jdayssol.designpattern.behaviour.command;
public class Utilisateur
{
  public static void main(String[] args)
  {
    Vehicule vehicule1 = new Vehicule("A01", 1, 1000.0);
    Vehicule vehicule2 = new Vehicule("A11", 6, 2000.0);
    Vehicule vehicule3 = new Vehicule("Z03", 2, 3000.0);
    Catalogue catalogue = new Catalogue();
    catalogue.ajoute(vehicule1);
    catalogue.ajoute(vehicule2);
    catalogue.ajoute(vehicule3);
    System.out.println("Affichage du catalogue initial");
    catalogue.affiche();
    System.out.println();
    CommandeSolder commmandeSolder = new CommandeSolder
      (10, 5, 0.1);
    catalogue.lanceCommandeSolder(commmandeSolder);
    System.out.println("Affichage du catalogue apr�s " + 
      "ex�cution de la premi�re commande");
    catalogue.affiche();
    System.out.println();
    CommandeSolder commmandeSolder2 = new CommandeSolder
      (10, 5, 0.5);
    catalogue.lanceCommandeSolder(commmandeSolder2);
    System.out.println("Affichage du catalogue apr�s " +
      "ex�cution de la seconde commande");
    catalogue.affiche();
    System.out.println();
    catalogue.annuleCommandeSolder(1);
    System.out.println("Affichage du catalogue apr�s " +
      "annulation de la premi�re commande");
    catalogue.affiche();
    System.out.println();
    catalogue.retablitCommandeSolder(1);
    System.out.println("Affichage du catalogue apr�s " +
      "r�tablissement de la premi�re commande");
    catalogue.affiche();
    System.out.println();
  }
}
