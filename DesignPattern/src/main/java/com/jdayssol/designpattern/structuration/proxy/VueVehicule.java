package com.jdayssol.designpattern.structuration.proxy;

public class VueVehicule
{

  public static void main(String[] args)
  {
    Animation animation = new AnimationProxy();
    animation.dessine();
    animation.clic();
    animation.dessine();
  }
}
