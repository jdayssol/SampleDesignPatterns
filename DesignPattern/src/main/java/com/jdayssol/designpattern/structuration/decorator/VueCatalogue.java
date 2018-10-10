package com.jdayssol.designpattern.structuration.decorator;

public class VueCatalogue
{
  public static void main(String[] args)
  {
    VueVehicule vueVehicule = new VueVehicule();
    ModeleDecorateur modeleDecorateur = new
      ModeleDecorateur(vueVehicule);
    MarqueDecorateur marqueDecorateur = new
      MarqueDecorateur(modeleDecorateur);
    marqueDecorateur.affiche();
  }
}
