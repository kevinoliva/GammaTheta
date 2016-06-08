package com.example.koliva.gammatheta;

/**
 * Created by koliva on 1/25/2016.
 */

import java.util.*;

public class DataProvider {

    public static LinkedHashMap<String, List<String>> getInfo() {
        LinkedHashMap<String, List<String>> brothers = new LinkedHashMap<String, List<String>>();
        List<String> alpha = new ArrayList<String>();
        List<String> beta = new ArrayList<String>();
        List<String> gamma = new ArrayList<String>();
        List<String> delta = new ArrayList<String>();
        List<String> epsilon = new ArrayList<String>();
        List<String> zeta = new ArrayList<String>();
        List<String> eta = new ArrayList<String>();
        List<String> theta = new ArrayList<String>();
        List<String> iota = new ArrayList<String>();
        List<String> kappa = new ArrayList<String>();
        List<String> lambda = new ArrayList<String>();
        List<String> mu = new ArrayList<String>();

        alpha.add("#1 - Gilmar Valencia");
        alpha.add("#3 - Richard Montez");
        alpha.add("#4 - Santos Barrientes");
        alpha.add("#5 - Cesar Diaz");

        beta.add("#1 - Andres Chihuahua");
        beta.add("#2 - Luis Flores");
        beta.add("#3 - John Gutierrez");
        beta.add("#4 - Andrew Diaz");

        gamma.add("#1 - David Perez");
        gamma.add("#2 - Anthony Hernandez");
        gamma.add("#3 - Steve Pereira");

        delta.add("#2 - Hugo Vergara");
        delta.add("#3 - Bruno Rodriguez");
        delta.add("#4 - Jaime Rogero");

        epsilon.add("#1 - Klinsmann Gutierrez");
        epsilon.add("#2 - Eliezer Campos");
        epsilon.add("#3 - Johnathan Martinez");
        epsilon.add("#4 - Luis Aldana");
        epsilon.add("#5 - Andrew Thomas");

        zeta.add("#1 - Erick Gutierrez");
        zeta.add("#2 - Joseph Mendoza");
        zeta.add("#4 - Alexis Valladares");

        eta.add("#1 - Arturo Diaz");
        eta.add("#2 - Carlos Bustamante");
        eta.add("#3 - Bryan Grajeda");

        theta.add("#1 - Eduardo De La Torre");
        theta.add("#2 - Christian Hernandez");
        theta.add("#3 - Ryan Aranda");
        theta.add("#4 - Jonatan Encarnacion");
        theta.add("#5 - Bryant Robles");
        theta.add("#6 - Kevin Oliva");

        iota.add("#1 - Dorian Gonzalez");
        iota.add("#2 - Devon Hamilton");
        iota.add("#3 - Jose Escobar");

        kappa.add("#1 - Ron Rivera");
        kappa.add("#2 - Cameron Perra");

        lambda.add("#1 - Anthony Gomez");
        lambda.add("#2 - Bryan Suzan");
        lambda.add("#3 - Francisco Penaloza");
        lambda.add("#4 - Jose Madrigal");

        mu.add("#1 - Ricardo Rangel");
        mu.add("#2 - Jesus Del Toro");
        mu.add("#3 - Remington Finn");
        mu.add("#4 - Ulices Montoya");

        brothers.put("Spring 2006 - Founding Line", alpha);
        brothers.put("Fall 2006 - Beta Line", beta);
        brothers.put("Fall 2007 - Gamma Line", gamma);
        brothers.put("Spring 2008 - Delta Line", delta);
        brothers.put("Spring 2009 - Epsilon Line", epsilon);
        brothers.put("Spring 2010 - Zeta Line", zeta);
        brothers.put("Spring 2011 - Eta Line", eta);
        brothers.put("Spring 2012 - Theta Line", theta);
        brothers.put("Spring 2013 - Iota Line", iota);
        brothers.put("Spring 2014 - Kappa Line", kappa);
        brothers.put("Spring 2015 - Lambda Line", lambda);
        brothers.put("Fall 2015 - Mu Line", mu);

        return brothers;
    }
}
