package com.jdayssol.designpattern.constructor.factorymethod;

public class CommandeComptant extends Commande
{
  public CommandeComptant(double montant)
  {
    super(montant);
  }

  public void paye()
  {
    System.out.println(
      "Le paiement de la commande au comptant de : " +
      montant + " est effectu�.");
  }

  public boolean valide()
  {
    return true;
  }
}
