package com.jdayssol.designpattern.structuration.facade;
public class ComposantGestionDocument implements
  GestionDocument
{

  public String document(int index)
  {
    return "Document num�ro " + index;
  }
}
