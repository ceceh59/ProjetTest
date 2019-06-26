/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class ProjetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant();
        Etudiant etudiant2 = new Etudiant(1234, "Simpson"
                ,new Adresse("Rue de Picpus",123, "75012", "Paris"));
        
        /*****poly*******/
        
        Personne[]pers = new Personne;
        personne personne2 = new Personne();
        Personne personne = new Etudiant();
        Personne personne1 = new Prof();
        pers[0]=personne;
        pers[1]=personne1;
        pers[2]=personne2;
        
        for(Personne p : pers){
            p.afficher();
        }
        
        
        Adresse adresseSimpson = new Adresse
        ("Rue de Paris",125, "75005", "Paris");
        
        System.out.println(etudiant2.getAdresse().toString());
        System.out.println(etudiant2.getAdresse().getRue());
        
        //modifier la rue
        etudiant2.getAdresse().setRue("Rue de lillers");
        System.out.println(etudiant2.getAdresse().getRue());
        
       /* Etudiant etudiant3 = new Etudiant(1234, "Simpson", 3,adresseSimpson);

        System.out.println(etudiant1.toString());
        System.out.println(etudiant2.toString());
        System.out.println(etudiant3.toString());

        etudiant1.incrementValeur();
        
        System.out.println(etudiant1.getValeur());
        System.out.println(etudiant2.getValeur());
        System.out.println(etudiant3.getValeur());

        etudiant1.setNumero(10);
        etudiant1.setNom("Bart");
        System.out.println("Apres modification : " + etudiant1.toString());

        System.out.println("nom:" + etudiant1.getNom());

    }*/
}
}
