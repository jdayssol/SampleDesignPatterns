package com.jdayssol.designpattern.behaviour.visitor;

public interface VisiteurSociete {
  void visite(SocieteSansFiliale societe);

  void visite(SocieteMere societe);
}
