package com.jdayssol.designpattern.behaviour.mediator;

import java.util.*;
public class PopupMenu extends Controle
{
  protected List<String> options = 
	new ArrayList<String>();
  protected Scanner reader = new Scanner(System.in);

  public PopupMenu(String nom)
  {
    super(nom);
  }

  public void saisie()
  {
    System.out.println("Saisie de : " + nom);
    System.out.println("Valeur actuelle : " + getValeur());
    for (int index = 0; index < options.size(); index++)
      System.out.println("- " + index + " )" +
        options.get(index));
    int choix = reader.nextInt();
    if ((choix >= 0) && (choix < options.size()))
    {
      boolean change = !(getValeur().equals(options.get(choix)));
      if (change)
      {
        setValeur(options.get(choix));
        this.modifie();
      }
    }
  }

  public void ajouteOption(String option)
  {
    options.add(option);
  }
}
