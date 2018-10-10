package com.jdayssol.designpattern.constructor.factorymethod;

public class CommandeCredit extends Commande
{
  public CommandeCredit(double montant)
  {
    super(montant);
  }

  public void paye()
  {
    System.out.println(
      "Le paiement de la commande au cr�dit de : " +
      montant + " est effectu�.");
  }

  public boolean valide()
  {
    return (montant >= 1000.0) && (montant <= 5000.0);
  }
}
