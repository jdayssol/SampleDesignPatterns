package com.jdayssol.designpattern.other.multicast;

import java.util.*;
public class MessageGeneral extends MessageAbstrait
{
  protected List<String> contenu;

  public List<String> getContenu()
  {
    return contenu;
  }

  public MessageGeneral(List<String> contenu)
  {
    super();
    this.contenu = contenu;
  }

}
