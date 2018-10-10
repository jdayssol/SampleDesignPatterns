package com.jdayssol.designpattern.constructor.factorymethod;

public class ClientComptant extends Client
{
  protected Commande creeCommande(double montant)
  {
    return new CommandeComptant(montant);
  }
}
