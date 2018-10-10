package com.jdayssol.designpattern.structuration.proxy;


public class AnimationProxy implements Animation
{
  protected Film film = null;
  protected String photo = "affichage de la photo";

  public void clic()
  {
    if (film == null)
    {
      film = new Film();
      film.charge();
    }
    film.joue();
  }

  public void dessine()
  {
    if (film != null)
      film.dessine();
    else
      dessine(photo);
  }
  
  public void dessine(String photo)
  {
      System.out.println(photo);  
  }
}
