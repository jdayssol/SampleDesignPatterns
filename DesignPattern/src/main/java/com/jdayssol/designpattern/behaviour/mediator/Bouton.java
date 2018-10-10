package com.jdayssol.designpattern.behaviour.mediator;

import java.util.*;
public class Bouton extends Controle
{
  Scanner reader = new Scanner(System.in);

  public Bouton(String nom)
  {
    super(nom);
  }

  public void saisie()
  {
    System.out.println("D�sirez-vous activer le bouton " 
      + nom + " ?");
    String reponse = reader.nextLine();
    if (reponse.equals("oui"))
      this.modifie();
  }
}
