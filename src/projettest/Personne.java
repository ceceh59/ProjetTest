/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

/**
 *
 * @author Administrateur
 */
public class Personne implements Afficher{

    @Override
    public void afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println("je suis une personne");
    }
    
    protected int numero;
    protected String nom;
    protected Adresse adresse;

    public Personne(int numero, String nom, Adresse adresse) {
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Personne() {
    }
    
    

    public void setNumero(int numero) throws Exception {
        if(numero<0) 
            throw new Exception ("valeur négative");
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }
}
