package com.jdayssol.designpattern.behaviour.simplevisitor;

public interface Visiteur
{
  void visite(SocieteSansFiliale
    societe);
  void visite(SocieteMere societe);
}
