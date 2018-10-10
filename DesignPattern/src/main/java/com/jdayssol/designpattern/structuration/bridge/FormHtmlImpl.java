package com.jdayssol.designpattern.structuration.bridge;

import java.util.*;
public class FormHtmlImpl implements FormulaireImpl
{
  Scanner reader = new Scanner(System.in);

  public void dessineTexte(String texte)
  {
    System.out.println("HTML : " + texte);
  }

  public String gereZoneSaisie()
  {
    return reader.next();
  }
}
