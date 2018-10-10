package com.jdayssol.designpattern.other.multicast;


public class MessageCommercial extends MessageAbstrait
{
  protected String contenu;

  public String getContenu()
  {
    return contenu;
  }

  public MessageCommercial(String contenu)
  {
    super();
    this.contenu = contenu;
  }

}
