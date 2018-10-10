package com.jdayssol.designpattern.constructor.singleton;

public class TestVendeur
{

  public static void main(String[] args)
  {
    // initialisation du vendeur du syst�me
    Vendeur leVendeur = Vendeur.Instance();
    leVendeur.setNom("Vendeur Auto");
    leVendeur.setAdresse("Paris");
    leVendeur.setEmail("vendeur@vendeur.com");
    // affichage du vendeur du syst�me
    affiche();
  }

  public static void affiche()
  {
    Vendeur leVendeur = Vendeur.Instance();
    leVendeur.affiche();
  }

}
