package com.jdayssol.designpattern.structuration.bridge;

public abstract class FormulaireImmatriculation
{
  protected String contenu;
  protected FormulaireImpl implantation;

  public FormulaireImmatriculation(FormulaireImpl
    implantation)
  {
    this.implantation = implantation;
  }

  public void affiche()
  {
    implantation.dessineTexte(
      "num�ro de la plaque existante : ");
  }

  public void genereDocument()
  {
    implantation.dessineTexte("Demande d'immatriculation");
    implantation.dessineTexte("num�ro de plaque : " +
      contenu);
  }

  public boolean gereSaisie()
  {
    contenu = implantation.gereZoneSaisie();
    return this.controleSaisie(contenu);
  }

  protected abstract boolean controleSaisie(String plaque);
    
}
