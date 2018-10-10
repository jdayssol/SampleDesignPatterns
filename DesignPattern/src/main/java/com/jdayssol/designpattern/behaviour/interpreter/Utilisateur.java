package com.jdayssol.designpattern.behaviour.interpreter;

import java.util.*;
public class Utilisateur
{
  public static void main(String[] args)
  {
    Expression expressionRequete = null;
    Scanner reader = new Scanner(System.in);
    System.out.print("Entrez votre requ�te : ");
    String requete = reader.nextLine();
    try
    {
      expressionRequete = Expression.analyse(requete);
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
      expressionRequete = null;
    }
    if (expressionRequete != null)
    {
      System.out.println(
        "Entrez le texte de description d'un v�hicule : ");
      String description = reader.nextLine();
      if (expressionRequete.evalue(description))
        System.out.println(
          "La description r�pond � la requ�te");
      else
        System.out.println(
          "La description ne r�pond pas � la requ�te");
    }
  }
}
