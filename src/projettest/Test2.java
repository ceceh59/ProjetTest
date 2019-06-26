/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class Test2 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        // déclaration +création de la liste
        ArrayList<String> maListe = new ArrayList<>();
        
      
        //2 ajout des éléments dans une liste
        maListe.add("Bart");
        maListe.add("Simpson");
        maListe.add("Homer");
        
        // 3 afficher les éléments de la liste avec le toString
        System.out.println(maListe.toString());
        
        // 4 accéder à un élément de la liste
        String valeur = maListe.get(1);
        System.out.println(valeur);
                
        // 5 parcours d'une liste avec une boucle forEach
        for(String nom:maListe){
            System.out.println(nom);
            
         // 6 parcours d'une liste avec une boucle for
         for(int i=0; i<maListe.size();i++){
             System.out.println(maListe.get(i));
             
             
             
         }
        }
    }
        // exercice une somme de liste
        
        public static int sommeEltListe(ArrayList<Integer> maListeExo){
            maListeExo = new ArrayList<>();
            
            int somme=0;
            for(int valeur:maListeExo){
                if(valeur%2==0){   
                    somme = somme + valeur;
            //for(int i=0; i<maListeExo.size();i++){
               
                
                //if (somme%2==0){
                 //somme = somme + maListeExo.get(i);
                }
            } 
             //System.out.println(somme);
            
            return somme;
        }
        // exercice 2 les extremes
        
             public static void supMinMaxListe(ArrayList<Integer> liste){
       int min,max,posMax,posMin;
       max = liste.get(0);
       min = liste.get(0);
       posMax = 0;
       posMin = 0;
       for (int i = 1;i<liste.size();i++) {
           if(max < liste.get(i)){
               max = liste.get(i);
               posMax = i;
           }
           else if (liste.get(i) < min){
               min = liste.get(i);
               posMin = i;
           }
       }
       liste.remove(posMax);
       liste.remove(posMin);
       }
   //exerci 4  concatenation de deux listes
   public static void concatenListe(
           ArrayList<Integer> liste1,
           ArrayList<Integer> liste2){
       for (int valeur : liste2) {
           liste1.add(valeur);
       }
   }
   //exercice 3 eliminer les doublons d'une liste
   public static ArrayList<Integer> removeDoublons(ArrayList<Integer>liste){
       ArrayList<Integer>listeResult = new ArrayList<>();
       listeResult.add(liste.get(0));
           for(int i=1; i<liste.size(); i++){
               if(liste.get(i) != liste.get(i-1)){
               listeResult.add(liste.get(i));
               }
   }
               return listeResult;
   }
}


    
    

