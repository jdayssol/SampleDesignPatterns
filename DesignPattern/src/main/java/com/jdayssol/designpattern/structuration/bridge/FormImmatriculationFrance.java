package com.jdayssol.designpattern.structuration.bridge;


public class FormImmatriculationFrance extends
  FormulaireImmatriculation
{
  public FormImmatriculationFrance(FormulaireImpl
    implantation)
  {
    super(implantation);
  }

  protected boolean controleSaisie(String plaque)
  {
    return plaque.length() == 7;
  }
}
