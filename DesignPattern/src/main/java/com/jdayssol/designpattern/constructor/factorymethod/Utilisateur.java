package com.jdayssol.designpattern.constructor.factorymethod;

public class Utilisateur
{

  public static void main(String[] args)
  {
    Client client;
    client = new ClientComptant();
    client.nouvelleCommande(2000.0);
    client.nouvelleCommande(10000.0);
    client = new ClientCredit();
    client.nouvelleCommande(2000.0);
    client.nouvelleCommande(10000.0);
  }
}
