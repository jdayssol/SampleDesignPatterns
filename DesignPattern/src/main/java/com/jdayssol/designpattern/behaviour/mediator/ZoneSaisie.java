package com.jdayssol.designpattern.behaviour.mediator;

import java.util.*;
public class ZoneSaisie extends Controle
{
  Scanner reader = new Scanner(System.in);

  public ZoneSaisie(String nom)
  {
    super(nom);
  }

  public void saisie()
  {
    System.out.println("Saisie de : " + nom);
    setValeur(reader.nextLine());
    this.modifie();
  }
}
