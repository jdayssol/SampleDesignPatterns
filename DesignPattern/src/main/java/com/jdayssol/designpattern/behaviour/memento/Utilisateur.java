package com.jdayssol.designpattern.behaviour.memento;

public class Utilisateur
{
  public static void main(String[] args)
  {
    Memento memento;
    OptionVehicule option1 = new OptionVehicule(
      "Si�ges en cuir");
    OptionVehicule option2 = new OptionVehicule(
      "Accoudoirs");
    OptionVehicule option3 = new OptionVehicule(
      "Si�ges sportifs");
    option1.ajouteOptionIncompatible(option3);
    option2.ajouteOptionIncompatible(option3);
    ChariotOption chariotOptions = new ChariotOption();
    chariotOptions.ajouteOption(option1);
    chariotOptions.ajouteOption(option2);
    chariotOptions.affiche();
    memento = chariotOptions.ajouteOption(option3);
    chariotOptions.affiche();
    chariotOptions.annule(memento);
    chariotOptions.affiche();
  }
}
