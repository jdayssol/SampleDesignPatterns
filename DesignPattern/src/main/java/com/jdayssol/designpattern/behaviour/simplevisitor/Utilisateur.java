package com.jdayssol.designpattern.behaviour.simplevisitor;

public class Utilisateur
{

  public static void main(String[] args)
  {
    Societe societe1 = new SocieteSansFiliale("soci�t�1",
      "info@societe1.com", "rue de la soci�t� 1");
    Societe societe2 = new SocieteSansFiliale("soci�t�2",
      "info@societe2.com", "rue de la soci�t� 2");
    Societe groupe1 = new SocieteMere("groupe1", 
      "info@groupe1.com", "rue du groupe 1");
    groupe1.ajouteFiliale(societe1);
    groupe1.ajouteFiliale(societe2);
    Societe societe3 = new SocieteSansFiliale("soci�t�3",
      "info@societe3.com", "rue de la soci�t� 3");
    Societe groupe2 = new SocieteMere("groupe2", 
      "info@groupe2.com", "rue du groupe 2");
    groupe2.ajouteFiliale(groupe1);
    groupe2.ajouteFiliale(societe3);
    groupe2.accepteVisiteur(new VisiteurMailingCommercial
      ());
  }
}
