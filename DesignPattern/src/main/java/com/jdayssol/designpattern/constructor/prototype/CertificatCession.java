package com.jdayssol.designpattern.constructor.prototype;


public class CertificatCession extends Document
{
  public void affiche()
  {
    System.out.println(
      "Affiche le certificat de cession : " + contenu);
  }

  public void imprime()
  {
    System.out.println(
      "Imprime le certificat de cession : " + contenu);
  }
}
