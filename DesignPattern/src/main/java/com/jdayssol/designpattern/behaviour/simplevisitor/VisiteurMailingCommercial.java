package com.jdayssol.designpattern.behaviour.simplevisitor;

public class VisiteurMailingCommercial implements Visiteur
{
  public void visite(SocieteSansFiliale
    societe)
  {
    System.out.println("Envoi d'un email � " +
      societe.getNom() + " adresse : " + societe.getEmail
      () + " Proposition commerciale pour votre soci�t�");
  }

  public void visite(SocieteMere societe)
  {
    System.out.println("Envoi d'un email � " +
      societe.getNom() + " adresse : " + societe.getEmail
      () + " Proposition commerciale pour votre groupe");
    System.out.println("Impression d'un courrier � " +
      societe.getNom() + " adresse : " +
      societe.getAdresse() + 
      " Proposition commerciale pour votre groupe");
  }
}
