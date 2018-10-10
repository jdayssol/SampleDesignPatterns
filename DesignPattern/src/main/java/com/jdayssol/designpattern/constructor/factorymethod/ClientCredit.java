package com.jdayssol.designpattern.constructor.factorymethod;

public class ClientCredit extends Client
{
  protected Commande creeCommande(double montant)
  {
    return new CommandeCredit(montant);
  }
}
