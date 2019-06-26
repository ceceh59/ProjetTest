/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class Adresse {
    private String rue;
    private int numero;
    private String codePostal;
    private String ville;

    public Adresse() {
    }
    
    
    
    public Adresse(String rue, int numero, String codePostal,String ville) {
        this.rue = rue;
        this.numero = numero;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public int getNumero() {
        return numero;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    @Override
    public String toString() {
        return "Adresse{" + "rue=" + rue + ", numero=" + numero + ", codePostal=" + codePostal + ", ville=" + ville + '}';
    }
    
    
}
