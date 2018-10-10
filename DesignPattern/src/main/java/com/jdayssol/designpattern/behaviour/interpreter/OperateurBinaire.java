package com.jdayssol.designpattern.behaviour.interpreter;

public abstract class OperateurBinaire extends Expression
{
  protected Expression operandeGauche, operandeDroite;

  public OperateurBinaire(Expression operandeGauche,
    Expression operandeDroite)
  {
    this.operandeGauche = operandeGauche;
    this.operandeDroite = operandeDroite;
  }
}
