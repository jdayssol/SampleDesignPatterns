package com.jdayssol.designpattern.other.multicast;

public class Commercial extends Employe
{

  protected RecepteurCommercial recepteurCommercial = 
	new RecepteurCommercial()
  {
    public void recoit(MessageCommercial message)
    {
      System.out.println("Nom : " + nom);
      System.out.println("Message : " +
        message.getContenu());
    }
  };

  public Commercial(String nom)
  {
    super(nom);
  }

  public RecepteurCommercial getRecepteurCommercial()
  {
    return recepteurCommercial;
  }

}
