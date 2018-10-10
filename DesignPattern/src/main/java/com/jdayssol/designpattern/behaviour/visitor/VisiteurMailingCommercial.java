package com.jdayssol.designpattern.behaviour.visitor;

public class VisiteurMailingCommercial extends Visiteur implements
    VisiteurSociete {

  public void visite(SocieteSansFiliale societe) {
    System.out.println("Envoi d'un email � " + societe.getNom()
        + " adresse : " + societe.getEmail()
        + " Proposition commerciale pour votre soci�t�");
  }

  public void visite(SocieteMere societe) {
    System.out.println("Envoi d'un email � " + societe.getNom()
        + " adresse : " + societe.getEmail()
        + " Proposition commerciale pour votre groupe");
    System.out.println("Impression d'un courrier � "
        + societe.getNom() + " adresse : " + societe.getAdresse()
        + " Proposition commerciale pour votre groupe");
    for (Societe filiale : societe.getFiliales())
      this.demarreVisite(filiale);
  }
}
