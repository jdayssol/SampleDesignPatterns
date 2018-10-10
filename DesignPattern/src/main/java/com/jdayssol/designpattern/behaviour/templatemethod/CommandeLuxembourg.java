package com.jdayssol.designpattern.behaviour.templatemethod;

public class CommandeLuxembourg extends Commande
{
  protected void calculeTva()
  {
    montantTva = montantHt * 0.15;
  }
}
