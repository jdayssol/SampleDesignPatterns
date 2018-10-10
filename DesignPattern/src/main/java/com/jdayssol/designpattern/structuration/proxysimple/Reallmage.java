package com.jdayssol.designpattern.structuration.proxysimple;

import java.util.*;

interface Image
{
    public void displayImage();
}

class RealImage implements Image
{
    private String filename;
    public RealImage(String filename)
    {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk()
    {
        System.out.println("Chargement de "+filename);
        // Opération potentiellement coûteuse en temps
    }

    public void displayImage()
    {
        System.out.println("Affichage de  "+filename);
    }
}

class ProxyImage implements Image
{
    private String filename;
    private Image image;

    public ProxyImage(String filename)
    {
        this.filename = filename;
    }

    public void displayImage()
    {
        if (image == null)
        {
            image = new RealImage(filename); // Chargement sur demande seulement
        }
        image.displayImage();
    }
}

class ProxyExample
{
    public static void main(String[] args)
    {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");

        image1.displayImage(); // chargement nécessaire
        image2.displayImage(); // chargement nécessaire
        image1.displayImage(); // pas de chargement nécessaire, déjà fait
        // la troisième image ne sera jamais chargée : pas de temps gaspillé
    }
}