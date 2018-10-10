package com.jdayssol.designpattern.structuration.bridge;

import java.util.Scanner;
public class FormAppletImpl implements FormulaireImpl
{
  Scanner reader = new Scanner(System.in);

  public void dessineTexte(String texte)
  {
    System.out.println("Applet : " + texte);
  }

  public String gereZoneSaisie()
  {
    return reader.next();
  }
}
