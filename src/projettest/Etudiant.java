package projettest;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class Etudiant extends Personne{
    private int anneeEtude;
    private boolean doubleur;
    private boolean ancien;

    //constructeur

    public Etudiant(int anneeEtude, boolean doubleur, boolean ancien, int numero, String nom, Adresse adresse) {
        super(numero, nom, adresse);
        this.anneeEtude = anneeEtude;
        this.doubleur = doubleur;
        this.ancien = ancien;
    }

    public Etudiant() {
       
    }
    
   
   
   // private int numero;
    //private String nom;
    

    public void setAnneeEtude(int anneeEtude) {
        this.anneeEtude = anneeEtude;
    }

    public void setDoubleur(boolean doubleur) {
        this.doubleur = doubleur;
    }

    public void setAncien(boolean ancien) {
        this.ancien = ancien;
    }
    
    
   /* private Adresse adresse;

    private static int valeur;

    public static int getValeur() {
        return valeur;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public static void setValeur(int valeur) {
        Etudiant.valeur = valeur;
    }

    public static void incrementValeur() {
        valeur++;
    }

    // 2 constructeur
    public Etudiant() {
        this.anneeEtude = 1;
        valeur = 0;
        this.adresse = new Adresse();
    }

    /*public Etudiant(int numEtud, String nom,Adresse adresse) {
        this.numero = numEtud;
        this.nom = nom;
        this.anneeEtude = 1;
        valeur = 0;
        this.adresse = adresse;
    }

    public Etudiant(int numEtud, String nom, int anneeEtud,Adresse adresse) {
        this.numero = numEtud;
        this.nom = nom;
        this.anneeEtude = anneeEtude;
        valeur = 0;
        this.adresse = adresse;

    }

    /**
     * *******les getteurs*******
     */
    /*public String getNom() {
        return this.nom;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAnneeEtude() {
        return this.anneeEtude;
    }

    public boolean isDoubleur() {
        return this.doubleur;
    }

    public boolean isAncien() {
        return this.ancien;
    }

    /**
     * ****les setteurs*******
     */

    /*public void setAnneeEtud(int AnneeEtude) {
        this.anneeEtude = AnneeEtude;
    }

    public void setNom(String Nom) {
        if (numero > 0) {
            this.nom = Nom;
        }
    }

    public void setNumero(int Numero) {
        this.numero = Numero;
    }

    public void setDoubleur(boolean Doubleur) {
        this.doubleur = Doubleur;
    }

    public void setAncien(boolean Ancien) {
        this.ancien = Ancien;
    }

    // 3 toString
    public String toString() {
        return this.numero + "-" + this.nom + "-" + this.anneeEtude + "-"
                + this.doubleur + "_" + this.ancien;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!( obj instanceof Etudiant)) return false;
        Etudiant autre = (Etudiant)obj;
        
        return this.numero == autre.numero
                && this.nom == autre.nom
                && this.anneeEtude == autre.anneeEtude
                && this.ancien == autre.ancien
                && this.adresse.equals(autre.adresse);
        
        
    
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.anneeEtude != other.anneeEtude) {
            return false;
        }
        if (this.doubleur != other.doubleur) {
            return false;
        }
        if (this.ancien != other.ancien) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;*/

    public int getAnneeEtude() {
        return anneeEtude;
    }

    public boolean isDoubleur() {
        return doubleur;
    }

    public boolean isAncien() {
        return ancien;
    }

    @Override
    public String toString() {
        return "Etudiant{"+ super.toString() + "anneeEtude=" + anneeEtude + ", doubleur=" + doubleur + ", ancien=" + ancien + '}';
    }

    @Override
    public void afficher() {
        super.afficher(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("je suis l'étudiant");
    }
    
    }
    




