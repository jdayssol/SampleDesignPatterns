package com.jdayssol.designpattern.other.multicast;


public class Concession
{

  public static void main(String[] args)
  {
    DirectionGenerale directionGenerale = new
      DirectionGenerale();
    DirectionCommerciale directionCommerciale = new
      DirectionCommerciale();
    Commercial commercial1 = new Commercial("Paul");
    Commercial commercial2 = new Commercial("Henri");
    Administratif administratif = new Administratif(
      "Jacques");
    directionGenerale.ajouteRecepteurGeneral(commercial1);
    directionGenerale.ajouteRecepteurGeneral(commercial2);
    directionGenerale.ajouteRecepteurGeneral
      (administratif);
    directionGenerale.envoieMessages();
    directionCommerciale.ajouteRecepteurCommercial
      (commercial1.getRecepteurCommercial());
    directionCommerciale.ajouteRecepteurCommercial
      (commercial2.getRecepteurCommercial());
    directionCommerciale.envoieMessages();
  }

}
