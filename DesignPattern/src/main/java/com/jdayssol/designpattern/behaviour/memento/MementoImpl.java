package com.jdayssol.designpattern.behaviour.memento;

import java.util.ArrayList;
import java.util.List;
public class MementoImpl implements Memento
{
  protected List<OptionVehicule> options = 
    new ArrayList<OptionVehicule>();

  public void setEtat(List<OptionVehicule> options)
  {
    this.options.clear();
    this.options.addAll(options);
  }

  public List<OptionVehicule> getEtat()
  {
    return options;
  }
}
