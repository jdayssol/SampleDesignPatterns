package com.jdayssol.designpattern.behaviour.visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class Visiteur {

  public void demarreVisite(Visitable visitable) {
    int nbMethodesTrouvees;
    Method methodeAInvoquer;
    List<Class<?>> visitableClasses = new ArrayList<Class<?>>();
    List<Class<?>> visitableSurClasses;
    visitableClasses.add(visitable.getClass());
    nbMethodesTrouvees = 0;
    methodeAInvoquer = null;
    do {
      visitableSurClasses = new ArrayList<Class<?>>();
      for (Class<?> visitableClasse : visitableClasses) {
        Method methode = null;
        Class<?> visiteurClasse = this.getClass();
        while ((methode == null) && (visiteurClasse != Object.class)) {
          try {
            methode =
                visiteurClasse.getDeclaredMethod("visite",
                    new Class[] { visitableClasse });
          } catch (SecurityException e) {
          } catch (NoSuchMethodException e) {
          }
          if (methode == null)
            visiteurClasse = visiteurClasse.getSuperclass();
        }
        if (methode == null) {
          Class<?> surClasse = visitableClasse.getSuperclass();
          if ((surClasse != null)
              && (!visitableSurClasses.contains(surClasse)))
            visitableSurClasses.add(surClasse);
          for (Class<?> uneInterface : visitableClasse.getInterfaces())
            if (!visitableSurClasses.contains(uneInterface))
              visitableSurClasses.add(uneInterface);
        } else {
          nbMethodesTrouvees++;
          methodeAInvoquer = methode;
        }
      }
      visitableClasses = visitableSurClasses;
    } while (visitableClasses.size() > 0);
    if (nbMethodesTrouvees == 0)
      System.out
          .println("L'appel de la m�thode visite pour la classe \""
              + visitable.getClass().getSimpleName()
              + "\" est impossible !");
    else if (nbMethodesTrouvees > 1)
      System.out
          .println("L'appel de la m�thode visite pour la classe \""
              + visitable.getClass().getSimpleName()
              + "\" est ambigu !");
    else
      try {
        methodeAInvoquer.invoke(this, new Object[] { visitable });
      } catch (IllegalArgumentException e) {
      } catch (IllegalAccessException e) {
      } catch (InvocationTargetException e) {
      }
  }
}
