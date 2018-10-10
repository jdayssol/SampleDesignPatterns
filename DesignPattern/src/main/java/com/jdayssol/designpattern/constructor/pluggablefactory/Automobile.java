package com.jdayssol.designpattern.constructor.pluggablefactory;

public abstract class Automobile implements Cloneable
{
  protected String modele;
  protected String couleur;
  protected int puissance;
  protected double espace;

  public Automobile duplique()
  {
    Automobile resultat;
    try
    {
      resultat = (Automobile)this.clone();
    }
    catch (CloneNotSupportedException exception)
    {
      return null;
    }
    return resultat;
  }

  public String getModele()
  {
    return modele;
  }

  public void setModele(String modele)
  {
    this.modele = modele;
  }

  public String getCouleur()
  {
    return couleur;
  }

  public void setCouleur(String couleur)
  {
    this.couleur = couleur;
  }

  public int getPuissance()
  {
    return puissance;
  }

  public void setPuissance(int puissance)
  {
    this.puissance = puissance;
  }

  public double getEspace()
  {
    return espace;
  }

  public void setEspace(double espace)
  {
    this.espace = espace;
  }

  public abstract void afficheCaracteristiques();
}
