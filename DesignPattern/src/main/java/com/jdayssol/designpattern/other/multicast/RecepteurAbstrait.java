package com.jdayssol.designpattern.other.multicast;


public interface RecepteurAbstrait
  <TMessage extends MessageAbstrait> 
{
  public void recoit(TMessage message);
}
