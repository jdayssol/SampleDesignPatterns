package com.jdayssol.designpattern.constructor.prototype;

import java.util.*;
public class LiasseVierge extends Liasse
{
  private static LiasseVierge _instance = null;

  private LiasseVierge()
  {
    documents = new ArrayList<Document>();
  }

  public static LiasseVierge Instance()
  {
    if (_instance == null)
      _instance = new LiasseVierge();
    return _instance;
  }

  public void ajoute(Document doc)
  {
    documents.add(doc);
  }

  public void retire(Document doc)
  {
    documents.remove(doc);
  }
}
