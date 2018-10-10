package com.jdayssol.designpattern.behaviour.interpreter;

public class OperateurEt extends OperateurBinaire
{
  public OperateurEt(Expression operandeGauche,
    Expression operandeDroite)
  {
    super(operandeGauche, operandeDroite);
  }

  public boolean evalue(String description)
  {
    return operandeGauche.evalue(description) &&
      operandeDroite.evalue(description);
  }

  // partie analyse syntaxique
  public static Expression parse()throws Exception
  {
    Expression resultatGauche, resultatDroit;
    resultatGauche = Expression.parse();
    while ((jeton != null) && (jeton.equals("et")))
    {
      prochainJeton();
      resultatDroit = Expression.parse();
      resultatGauche = new OperateurEt(resultatGauche,
        resultatDroit);
    }
    return resultatGauche;
  }
}
