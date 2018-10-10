package com.jdayssol.designpattern.structuration.facade;
import java.util.List;
public interface WebServiceAuto
{
  String document(int index);
  List<String> chercheVehicules(int prixMoyen, int ecartMax);
}
