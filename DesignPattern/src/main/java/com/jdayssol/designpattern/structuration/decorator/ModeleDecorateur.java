package com.jdayssol.designpattern.structuration.decorator;

public class ModeleDecorateur extends Decorateur
{
  public ModeleDecorateur(ComposantGraphiqueVehicule
    composant)
  {
    super(composant);
  }
  protected void afficheInfosTechniques()
  {
    System.out.println(
      "Informations techniques du mod�le");
  }

  public void affiche()
  {
    super.affiche();
    this.afficheInfosTechniques();
  }
}
